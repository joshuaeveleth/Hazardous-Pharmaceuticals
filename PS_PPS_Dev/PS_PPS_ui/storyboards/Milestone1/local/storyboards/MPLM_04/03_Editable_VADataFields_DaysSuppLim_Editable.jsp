<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="java.io.*, java.net.*, java.util.*"%>

<%!
    private String[] dataFields = {"Dispense Via CMOP,Hazardous to Patient,Non-Renewable", "Do Not Handle if Pregnant,High-Risk,Patient Specific Label", "Do Not Mail,Local Use,Protect From Light", "Follow-Up Time,Long Term Out of Stock,Refrigeration", "Hazardous to Dispense,Low Safety Margin,Transmit to CMOP", "Hazardous to Handle,Narcotic,Witness to Administration"};
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>VA Data Fields</title>
<link href="../css/ProductDetail.css" rel="stylesheet" type="text/css" />
<link href="../css/AddItemContent.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
.style1 {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 24px;
	color: #FFFFFF;
}
-->
</style>
<script type="text/javascript">
<!--
function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}
function MM_popupMsg(msg) { //v3.0
  alert(msg);
}
function MM_confirmMsg(msg) { //v3.0
  window.confirm(msg);
}

function MM_openBrWindow(theURL,winName,features) { //v3.0
  window.open(theURL,winName,features);
}

function MM_callJS(jsStr) { //v2.0
  return eval(jsStr)
}
//-->
</script>
</head>

<body>
<div class="highestLevel">
<fieldset class="set"><legend>Item Details</legend>
		<div class="new_text_column1">
                
                Orderable Item:
                <br />
                CMOP ID:
                <br />
                DEA Schedule:
				<br />
                Product Type: 
				<br/>
                Formulary:
                <br />
                Approved for Splitting:
                <br/>
                Application Package Use:            </div col1>
            <div class="text_column2">
                <input name="OrderableItem2" type="text" id="OrderableItem2" value="Orderable"/>
          <br />
          <input name="CMOPID" type="text" id="CMOPID" value="R0023"/>
          <br />
          <select name="DefaultMailSvc" id="DefaultMailSvc"  >
              <option>Not Selected</option>
              </select>
                <br/>
                 <select name="DEASchedule" id="DEASchedule" >
              <option>Not Selected</option>
                </select>
                <br/>
                <select name="ProductType" id="ProductType">
              <option>Not Selected</option>
                </select>
                <br/>
                <select name="ApprovedSplitting" id="ApprovedSplitting">
              <option>Not Selected</option>
              <option>Yes</option>
              <option>No</option>
                </select>
                <br/>
                <select name="ApplicationPkgUse" size="3" id="ApplicationPkgUse">
                <option>Inpatient</option>
                    <option selected="selected">Outpatient</option>
                </select>
                <a href="#" class="edit">edit</a>
            </div col2>
            <div class="text_column3">
            	Dispense Quantity Limit:
                <br />
                Quantity Dispense Msg:
                <br/>
                Days Supply Limit:
                <br />
                Number of Doses: 
                <br/>
				Default Mail Service: 
				<br/>
                Recall Level:
                </div col3>
          <div class="text_column4">
          <input name="DQL1" type="text" id="DQL1" value="2"  style="text-align:right" size="2"/>
            <select name="DispenseUnit"  id="DispenseUnit">
              <option>Not Selected</option>
                    <option>CAP</option>
                    <option selected>TAB</option>
                </select>
                per
	        	<input type="text" name="DQL2" id="DQL2" size="2"  style="text-align:right" value="14"/>
                days
                <br />
                <input name="QtyDispMsg" type="text" id="QtyDispMsg" size="35" value="Dispensed for 30 days at a time"/>
                <a href="#" class="edit">edit</a>
                <br/>
                <input type="text" name="DSL" id="DSL" size="3" style="text-align:right" value="30"/>
                days
                <a href="#" class="edit">edit</a>
                <br />
                <select name="RecallLevel" id="RecallLevel">
              <option>Not Selected</option>
                </select>
                <br/>
                <select name="Formulary" id="Formulary">
              <option>Not Selected</option>
                </select>
                <br/>
                 <select name="NumDoses" id="NumDoses">
              <option>Not Selected</option>
                </select>
                </div col4>
    </fieldset>
    <fieldset><legend>Item Specifications</legend>
        <div id="booleanDataFields">
            <table width="100%" border="0" cellpadding="3" cellspacing="0">
            <%
                int k=0;
                for (int i=0; i<dataFields.length; i++)
                {
                    StringTokenizer token = new StringTokenizer(dataFields[i], ",");
            %>
                    <tr>
                        <div class="checkbox_column1">
                            <td><input name="input" type="image" src="../images/editable.gif" ><input name="chkBox" type="checkbox"><%=token.nextToken()%></td>
                        </div>
                        <div class="checkbox_column4">
                            <td><input name="input" type="image" src="../images/editable.gif" ><input name="chkBox" type="checkbox"><%=token.nextToken()%></td>
                        </div>
                        <div class="checkbox_column4">
                            <td><input name="input" type="image" src="../images/editable.gif" ><input name="chkBox" type="checkbox"><%=token.nextToken()%></td>
                        </div>
                    </tr>
            <%
                }
            %>
            </table>
        </div booleanDataFields>
    </fieldset>
    </fieldset>
          <fieldset><legend>Labs and Vitals</legend>
          <div class="labVital_column1">
                Labs: <br/>
                Vitals: <br/>
            </div col1>
            <div class="labVital_column2">
                Order Entry<BR />
                <select name="LabEntry" id="LabEntry">
                  <option selected="selected">INR/Plasma</option>
                  <option>Pulse (Heart Rate)</option>
                </select>
            <br/>
                <select name="VitalsEntry" id="VitalsEntry">
              <option selected="selected">Pulse (Heart Rate)</option>
              </select>
            </div col1>

			<div class="labVital_column2">
                Order Finish<BR />
                <select name="LabFinish" id="LabFinish">
                  <option selected="selected">INR/Plasma</option>
                  <option>Pulse (Heart Rate)</option>
                </select>
            <br/>
                <select name="VitalsEntry" id="VitalsEntry">
              <option selected="selected">Pulse (Heart Rate)</option>
              </select>
            </div col2>
            
            <div class="labVital_column2">
                Administration <BR />
                <select name="LabAdmin" id="LabAdmin">
              <option selected="selected">INR/Plasma</option>
              <option>Pulse (Heart Rate)</option>
              </select><br/>
                <select name="VitalsAdmin" id="VitalsAdmin">
              <option>Pulse (Heart Rate)</option>
                </select>
            </div col3>
            </fieldset>
           </div highest level>
</body>
</html>
