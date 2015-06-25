<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="java.io.*, java.net.*, java.util.*"%>

<%!
	private String[] tableColumns = {"Date/Time of Change", "Item Type", "Changed By", "Reviewed By", "Location of Change", "Local Use", "Product Name", "Reason", "Item Status", "Type of Change"};
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../css/IAHDetail.css" rel="stylesheet" type="text/css" />
<title>Untitled Document</title>
</head>

<body>
	<div id="auditList" class="ndcList">
        <div id="table" class="searchTable">
        	<%
                    String fileName = "http://localhost:8080/PRE/data/AuditDetail.csv";
                    URL source = new URL(fileName);
                    BufferedReader br = new BufferedReader(new InputStreamReader(source.openStream()));
                    
                    String s = "";
                %>
               <table border="1" cellpadding="2" cellspacing="0" bordercolor="#000000" RULES="COLS" FRAME="box" >
            	<tr>
                	<% 
					for (int i=0; i<tableColumns.length; i++) {
						String col = tableColumns[i];
						%>
							<th><%=col%></th>
						<%
					}
					%>
                </tr>
                <%
                    br.readLine(); //first line of file has no data values
                    String line = "";
					int row=0;
                    while ((line = br.readLine()) != null)
                    {
						row=row+1;
                        StringTokenizer token = new StringTokenizer(line, ",");
						String rowColor = "#FFFFFF";
						if (row%2 == 0) {
							rowColor="#DeeFFF";
						}
                    %>
                    <tr bgcolor=<%=rowColor%>>
                    	<% 
						String t="";
						int col=0;
						while (token.hasMoreTokens()) {
							
							t=token.nextToken();
							
							if (col==0) {
							%>
                            	<td align="right"><%=t%></td>
							<%
							} else if (col==7) {
								System.out.println(t);
								StringBuffer b = new StringBuffer(t);
								b.setLength(5);
								String part = b.toString();
								if (t == null || t.equals("") || t.equals(" ")) {
									part = " ";
								} else {
									part = part + "...";
								}
							%>
								<!--<td><a class="info" href="#"><strong><%=part%></strong><SPAN><%=t%></span></a></td>-->
                               <td> <span><a href="#" title="<%=t%>" target="_blank"><strong><%=part%></strong></a></span></td>
							<%
							} else {
							%>
                            <td align="left"><%=t%></td>
						<%
							}
						col=col+1;
						}
						%>
                  </tr>
                <%
                    }
                    br.close();
                %>
            </table>
        	</div searchTable>
        <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
    </div ndcList>
</body>
</html>
