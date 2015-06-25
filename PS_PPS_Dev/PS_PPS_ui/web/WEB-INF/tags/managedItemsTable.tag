<%@tag import="gov.va.med.pharmacy.peps.common.vo.ManagedItemVo"%>
<%@tag import="gov.va.med.pharmacy.peps.presentation.common.utility.UrlUtility"%>
<%@tag import="gov.va.med.pharmacy.peps.presentation.common.utility.JspTagUtility"%>
<%@tag import="org.apache.commons.lang.StringUtils"%>
<%@tag import="org.apache.log4j.Logger"%>

<%@tag import="gov.va.med.pharmacy.peps.presentation.common.spring.interceptor.PepsSpringInterceptor"%>
<%@ tag
    language="java"
    body-content="empty"%>
<%@ taglib
    uri="http://displaytag.sf.net"
    prefix="display"%>
<%@ taglib
    prefix="peps"
    tagdir="/WEB-INF/tags"%>
<%@taglib 
	prefix="spring" 
	uri="http://www.springframework.org/tags"%>
<%@taglib 
	prefix="c" 
	uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute
    name="dataModel"
    required="true"
    type="java.util.Collection"
    rtexprvalue="true"
    description="EL value of the collection containing the data to display."%>
<%@ attribute
    name="printTemplate"
    required="true"
    type="gov.va.med.pharmacy.peps.common.vo.printtemplate.PrintTemplateVo"
    rtexprvalue="true"
    description="EL value of the PrintTemplateVo place on the model containing the fields to use as columns."%>
<%@ attribute
    name="tableId"
    required="true"
    type="java.lang.String"
    description="ID to give the generated HTML table"%>
<%@ attribute
    name="export"
    required="false"
    type="java.lang.Boolean"
    description="Turn on and off the export functionality. Defaults to false."%>
<%@ attribute
    name="paged"
    required="false"
    type="java.lang.Boolean"
    description="Set whether or not the table will be paged. Default is true."%>
<%@ attribute
    name="sortExportLinkParameters"
    required="false"
    type="java.util.Map"
    description="Request parameters to add to sort and export links generated by the Display Tag Library. Used especially when clicking one of these links should return the user back to a particular tab."%>
<%@ attribute
    name="multiselectButtonKey"
    required="false"
    type="java.lang.String"
    description="Key to localize as the button label if this table is multi-select."%>
<%@ attribute
    name="multiselectButtonAction"
    required="false"
    type="java.lang.String"
    description="Spring Web Flow event to trigger when the button is clicked if this table is multi-select."%>
<%@ attribute
    name="numRows"
    required="false"
    type="java.lang.Integer"
    description="Number of rows in the collection."%>
    
    <c:set value="${dataModel}" var="dataModel" scope="page"></c:set>
<%
            String model = (String) request.getAttribute("model");

            if (export == null) {
                jspContext.setAttribute("export", Boolean.FALSE);
            }

            if (sortExportLinkParameters == null) {
                sortExportLinkParameters = new java.util.HashMap();
            }
			
			//System.out.println("printTemplate:" +printTemplate);
            java.util.Collection collection = dataModel;
            java.util.List columns = printTemplate.getFields();
            //TODO remove logger
            //Logger.getRootLogger().error(columns);

            if (collection == null) {
            	Logger.getRootLogger().error("The collection is null");
                collection = java.util.Collections.EMPTY_LIST;
            }

            if (paged == null || paged) {
                gov.va.med.pharmacy.peps.common.vo.UserVo user = PepsSpringInterceptor.getUserContext(request.getSession()).getUser();
                jspContext.setAttribute("pagesize", user.getTableSizePreference());

                if (collection instanceof gov.va.med.pharmacy.peps.common.vo.PaginatedList) {
                    gov.va.med.pharmacy.peps.common.vo.PaginatedList paged = (gov.va.med.pharmacy.peps.common.vo.PaginatedList) collection;
                    sortExportLinkParameters.put(
                        gov.va.med.pharmacy.peps.presentation.common.controller.ControllerConstants.TABLE_ID_PARAMETER, tableId);                    
                    jspContext.setAttribute("sort", "external");
                    jspContext.setAttribute("partialList", Boolean.TRUE);
                    jspContext.setAttribute("fullSize", paged.getFullSize());

                    if (paged.isAscendingOrder()) {
                        jspContext.setAttribute("defaultOrder", "ascending");
                    }
                    else {
                        jspContext.setAttribute("defaultOrder", "descending");
                    }

                    for (int i = 0; i < columns.size(); i++) {
                        gov.va.med.pharmacy.peps.common.vo.printtemplate.Column column = (gov.va.med.pharmacy.peps.common.vo.printtemplate.Column) columns
                            .get(i);

                        if (column.getFieldKey() != null && column.getFieldKey().equals(paged.getSortedFieldKey())) {
                            jspContext.setAttribute("defaultSort", i + 1);
                        }
                    }
                }
                else {
                    jspContext.setAttribute("sort", "list");
                    jspContext.setAttribute("partialList", Boolean.FALSE);
                    jspContext.setAttribute("fullSize", collection.size());
                    jspContext.setAttribute("defaultOrder", "ascending");
                    jspContext.setAttribute("defaultSort", null);
                }
            }
            else {
                jspContext.setAttribute("pagesize", 0);
                jspContext.setAttribute("sort", "list");
                jspContext.setAttribute("partialList", Boolean.FALSE);
                jspContext.setAttribute("fullSize", collection.size());
                jspContext.setAttribute("defaultOrder", "ascending");
                jspContext.setAttribute("defaultSort", null);
            }

            int numRows = collection.size();

            // dislay tag library requires the data collection to be in request scope
            request.setAttribute(tableId + "_data", collection);

            // if there is no PrintTemplateVo, set an empty one to try and prevent NullPointerExceptions
            if (printTemplate == null) {
                printTemplate = new gov.va.med.pharmacy.peps.common.vo.printtemplate.PrintTemplateVo();
                jspContext.setAttribute("printTemplate", printTemplate);
            }

            
            String flowUrl =  gov.va.med.pharmacy.peps.presentation.common.utility.UrlUtility
                .createMvcExecutionUrl(request, sortExportLinkParameters);
 
            jspContext.setAttribute("flowUrl", flowUrl);

            if (multiselectButtonKey == null || multiselectButtonKey.trim().length() <= 0) {
                multiselectButtonKey = "button.edit";
                jspContext.setAttribute("multiselectButtonKey", multiselectButtonKey);
            }

            if (multiselectButtonAction == null || multiselectButtonAction.trim().length() <= 0) {
                multiselectButtonAction = "retrieve";
                jspContext.setAttribute("multiselectButtonAction", multiselectButtonAction);
            }

            gov.va.med.pharmacy.peps.common.vo.FieldKey firstFieldKey = printTemplate.getFields().get(0).getFieldKey();

            boolean multiselect = gov.va.med.pharmacy.peps.common.vo.FieldKey.SELECT.equals(firstFieldKey);

            if (multiselect && numRows > 0) {
%>
<form
    id="editMultiple"
    method="post"
    action="<%=gov.va.med.pharmacy.peps.presentation.common.utility.UrlUtility.createMvcExecutionUrl(request)%>"
    onsubmit="return disableSubmit(this.id);">
    <input type="hidden" name="entityType" value="<%=((ManagedItemVo) dataModel.toArray()[0]).getEntityType()%>" />
<%
}
%>
<display:table
    name="${tableId}_data"
    export="${export}"
    pagesize="${pagesize}"
    uid="${tableId}"
    requestURI="${flowUrl}"
    excludedParams="*"
    sort="${sort}"
    partialList="${partialList}"
    size="${fullSize}"
    defaultorder="${defaultOrder}"
    defaultsort="${defaultSort}"
    frame="box"
    rules="cols" 
    decorator="gov.va.med.pharmacy.peps.presentation.common.displaytag.SortTitleTableDecorator">
    <display:setProperty
        name="export.csv.filename"
        value="${tableId}.csv" />
    <display:setProperty
        name="export.excel.filename"
        value="${tableId}.tab" />
    <display:setProperty
        name="export.xml.filename"
        value="${tableId}.xml" />
    <display:setProperty
        name="export.pdf.filename"
        value="${tableId}.pdf" />
    <display:setProperty
        name="export.rtf.filename"
        value="${tableId}.rtf" />
    <%
                    for (int i = 0; i < columns.size(); i++) {
                    gov.va.med.pharmacy.peps.common.vo.printtemplate.Column column = (gov.va.med.pharmacy.peps.common.vo.printtemplate.Column) columns
                        .get(i);
                    //System.out.println("column: "+column);
                   

                    jspContext.setAttribute("fieldIndex", i);
                    java.lang.Integer rowNum = (Integer) jspContext.getAttribute(tableId + "_rowNum");

                    if (rowNum == null) {
                        rowNum = new Integer(0);
                    }

                    int dataIndex = rowNum - 1;
                    jspContext.setAttribute("dataIndex", dataIndex);
                   

                    Boolean fieldSortable = column.isSortable();
                    gov.va.med.pharmacy.peps.common.vo.FieldKey currentFieldKey = column.getFieldKey();

                    String pepsFieldKey = null;

                    if (currentFieldKey != null) { // localizable columns won't have FieldKeys
                        pepsFieldKey = currentFieldKey.getKey();
                    }

                    jspContext.setAttribute("pepsFieldKey", pepsFieldKey);

                    String columnTitle = null;

                    if (currentFieldKey != null)                        
                        columnTitle = currentFieldKey.getLocalizedAbbreviation(request.getLocale());                    
                    else if (columnTitle == null) {
                        columnTitle = JspTagUtility.getText(request, "column."+(String) printTemplate.getFields().get(i).getFieldKey().getKey());
                    }

                    jspContext.setAttribute("columnTitle", columnTitle);

                    if (collection instanceof gov.va.med.pharmacy.peps.common.vo.PaginatedList) {
                        jspContext.setAttribute("sortProperty", pepsFieldKey);
                    }
                    else {
                        jspContext.setAttribute("sortProperty", "");
                    }
                    
                    // ability to define specific column widths in search results tables 
                    // only need a few, and values will be different than those that could be pulled from fieldKey.properties
                    String newkey; 
                    String thwidth = "";
                    newkey = currentFieldKey.getKey();
                    
                    if (newkey != null && newkey.equals("ndc")) {
                        thwidth = "width: 100px";
                    }
                   
                    %>
    <display:column
        title="<%=columnTitle%>"
        sortable="<%=fieldSortable%>"
        scope="col"
        headerScope="col"
        style="<%=thwidth%>"
        comparator="gov.va.med.pharmacy.peps.presentation.common.displaytag.NumericComparator"
        sortName="<%=pepsFieldKey%>">
        <%
        if (column.isTextColumn()) {
            //System.out.println("pepsFieldKey: "+pepsFieldKey);
            // center the content for these data fields
            if (pepsFieldKey.equals("displayable.ingredient.unit") || 
                            pepsFieldKey.equals("cmop.id") ||
                            pepsFieldKey.equals("primary.drug.class2") ||
                            pepsFieldKey.equals("transmit.to.cmop") ||
                            pepsFieldKey.equals("local.use") ||
                            pepsFieldKey.equals("item.status") ||
                            pepsFieldKey.equals("request.item.status") ||
                            pepsFieldKey.equals("formulary")) {
            	 
        %><center>
        
        <peps:text
            key="<%=pepsFieldKey%>"
            item="<%=dataModel.toArray()[dataIndex]%>" /></center>
            
        <%
            }
            else {
                %>
                <peps:text
                    key="<%=pepsFieldKey%>"
                    item="<%=dataModel.toArray()[dataIndex]%>" />
                    
                    
                <%  
//                 System.out.println("is text column "+pepsFieldKey);
//                 System.out.println("DATA MODEL "+dataModel.toArray()[0]);
            }
                        }
                        else if (column.isInputColumn()) {
                            if (gov.va.med.pharmacy.peps.common.vo.FieldKey.SELECT.equals(column.getFieldKey())) {
        %>
        <input id="<%=((ManagedItemVo) dataModel.toArray()[dataIndex]).getId()%>" 
               class="checkbox columnCheckbox" 
               title="Select multiple items" 
               name="itemIds" 
               value="<%=((ManagedItemVo) dataModel.toArray()[dataIndex]).getId()%>" 
               type="checkbox">
        <%
                            }
                            else {
        %>
        <peps:input
            key="<%=pepsFieldKey%>"            
            item="${dataModel}[${dataIndex}]"
            labelPosition="none" />
        <%
        
                        }
                        }
                        else if (column.isLinkColumn()) {
        %>
        <%
                            gov.va.med.pharmacy.peps.common.vo.printtemplate.LinkColumn linkColumn = (gov.va.med.pharmacy.peps.common.vo.printtemplate.LinkColumn) column;

                            java.util.Map<String, String> linkParameters = new java.util.LinkedHashMap<String, String>(
                                    linkColumn.getParameters().size());                            

                            // Display tag library sorts by table cell contents, including href attribute of anchor tag, so force
                            // href to have the displayed value in it to sort by, using dummy "_sort" parameter.
                            // Except for localizable flow links, whose text are all the same.
                            if (!column.isLocalizableLinkColumn()) {
 								
								Object displayObject = gov.va.med.pharmacy.peps.presentation.common.utility.JspTagUtility
								.getFieldValue(dataModel.toArray()[dataIndex], currentFieldKey);								
								
								//System.out.println("displayObject String: "+displayObject.toString());
								//System.err.println(currentFieldKey);

                                String displayString = "";

                                if (displayObject != null) {
                                    if (displayObject instanceof gov.va.med.pharmacy.peps.common.vo.datafield.DataFields) {
                                        gov.va.med.pharmacy.peps.common.vo.datafield.DataFields dfs = 
                                            (gov.va.med.pharmacy.peps.common.vo.datafield.DataFields) displayObject;
                                        //System.out.println("dfs String: "+dfs.toString());
                                        gov.va.med.pharmacy.peps.common.vo.datafield.DataField df = 
                                            (gov.va.med.pharmacy.peps.common.vo.datafield.DataField) dfs.getDataField(currentFieldKey);
                                        //System.out.println("dfs String: "+df.toString());
                                        if (df == null) {
                                            throw new UnsupportedOperationException("No support for displaying field key: " + currentFieldKey);
                                        }
                                        displayString = (df.getValue() != null ? df.getValue().toString() : "");                                        
                                    }
                                    else if (displayObject instanceof gov.va.med.pharmacy.peps.common.vo.ValueObject) {
                                        displayString = ((gov.va.med.pharmacy.peps.common.vo.ValueObject) displayObject)
                                            .toShortString();
                                    }
                                    else {
                                        displayString = displayObject.toString();
                                    }                                    
                                }

                                linkParameters.put("_sort", java.net.URLEncoder.encode(displayString, "UTF-8"));
                            }

                            // Add remaining link parameters
                            for (java.util.Map.Entry<String, Object> entry : linkColumn.getParameters().entrySet()) {

                                String parameterValue;

                                if (entry.getValue() instanceof gov.va.med.pharmacy.peps.common.vo.FieldKey) {
                                	gov.va.med.pharmacy.peps.common.vo.FieldKey tempKey = (gov.va.med.pharmacy.peps.common.vo.FieldKey) entry
                                    .getValue();
                                	parameterValue = String.valueOf(gov.va.med.pharmacy.peps.presentation.common.utility.JspTagUtility
                                			.getFieldValue(dataModel.toArray()[dataIndex], tempKey));									
									
                                }
                                else {
                                    parameterValue = String.valueOf(entry.getValue());
                                }
                                //System.out.println("parameterValue: "+parameterValue);
                                linkParameters.put(entry.getKey(), parameterValue);
                                
                            }

                            if (column.isLinkColumn()) {
                                Object dataValue = dataModel.toArray()[dataIndex];
                            
        %>
        <peps:link
        id="${pepsFieldKey}${dataIndex}"
        key="<%=pepsFieldKey%>"
        item="<%=dataValue%>"
        event="<%=linkColumn.getEvent()%>"        
        input="<%=linkParameters%>"
        />
        
        <%
                            }
                            else if (column.isLocalizableLinkColumn()) {
                                Object dataValue = dataModel.toArray()[dataIndex];
                               
                                
                                
        %>
        <peps:link
            id="${columnTitle}${dataIndex}"
            text="<%=columnTitle%>"
            item="<%=dataValue%>"
            event="<%=linkColumn.getEvent()%>"
            input="<%=linkParameters%>" />
        <%
                            }
                            else if (column.isLinkColumn()) {
                                Object dataValue = dataModel.toArray()[dataIndex];
                                
                                /* removed ${dataIndex} from below so that _sort would work correctly */
                                // center the content for these data fields
                                if (pepsFieldKey.equals("ndc.count") ||
                                    pepsFieldKey.equals("product.count")) {
        %><center>
        <peps:link
            id="${pepsFieldKey}"
            key="<%=pepsFieldKey%>"
            item="<%=dataValue%>"
            event="<%=linkColumn.getEvent()%>"
            input="<%=linkParameters%>" /></center>
        <%
                            }
  
                            else {
                                
        %>
        <peps:link
            id="${pepsFieldKey}"
            key="<%=pepsFieldKey%>"
            item="<%=dataValue%>"
            event="<%=linkColumn.getEvent()%>"
            input="<%=linkParameters%>" />
        <%                                      
                                }
                            }
  
                            else {  
                                Object dataValue = dataModel.toArray()[dataIndex];
                                
        %>
        <peps:link
            id="${pepsFieldKey}${dataIndex}"
            key="<%=pepsFieldKey%>"
            item="<%=dataValue%>"
            event="<%=linkColumn.getEvent()%>"
            input="<%=linkParameters%>" />
        <%
                        }
                        }  
                        
                        else if (column.isPopupLinkColumn()) {
                            Object dataValue = dataModel.toArray()[dataIndex];
                            
                            gov.va.med.pharmacy.peps.common.vo.printtemplate.PopupLinkColumn popup = (gov.va.med.pharmacy.peps.common.vo.printtemplate.PopupLinkColumn) column;
                            
                            jspContext.setAttribute("text", gov.va.med.pharmacy.peps.presentation.common.utility.JspTagUtility
                                .getFieldValue(dataValue, popup.getFieldKey()));
                            jspContext.setAttribute("viewedBy", gov.va.med.pharmacy.peps.presentation.common.utility.JspTagUtility
                                .getFieldValue(dataValue, popup.getOtherKey()));

                            
    %>
    <peps:link
        id="viewed.by.count"
        event="popupField"
        text="${text}"
        item="<%=dataValue%>"
        onclick="return popupField(this.href, this.id);"
        tooltip="${fieldLinkAltText} ${text}"
        viewedBy="${viewedBy}"
        disabled="true" />
    <%
                        }
        %>
    </display:column>
    <%
    }
    %>

</display:table>

<%
if (multiselect && numRows > 0) { // do not display select/edit all buttons if table is empty
%>
<div
    id="buttons"
    class="panel">
<span class="floatLeft">
<spring:message code="select.all" var="selectText"/>
<spring:message code="unselect.all" var="unselectText"/>
<input type="button" name="select.all.button" id="select.all.button" class="button" value="${selectText}" onclick="checkall('itemIds'); return false;"/>  
<input type="button" name="unselect.all.button" id="unselect.all.button" class="button" value="${unselectText}" onclick="checkall('itemIds'); return false;" style="display:none;"/>    
<peps:submit
    key="${multiselectButtonKey}"
    onclick="return verifySelection('itemIds'); return false;" />
</span>
</div>

</form>
<%
}
%>