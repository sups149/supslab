<%-- 
    Document   : index
    Created on : Feb 1, 2011, 11:13:42 PM
    Author     : sups
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
try{
        HttpSession mysession=request.getSession(false);
        String utype=(String)mysession.getAttribute("utype");
        if(mysession!=null){
        if(utype.equals("applicant"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/UnauthorisedUser.jsp"));
        if(utype.equals("interviewer"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/UnauthorisedUser.jsp"));

    if(utype.equals("HR")){
   
%>

<html>
<head>
    <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
    <%@ taglib uri='http://java.sun.com/jsp/jstl/sql' prefix='sql'%>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="description" content="#" />
<meta name="keywords" content="#" />
<meta name="author" content="#" />
<link rel="stylesheet" type="text/css" href="recruitment_css.css" media="screen" />
<link rel="stylesheet" type="text/css" href="print.css" media="print" />
<link rel="stylesheet" href="calendar.css">
<script language="JavaScript" src="calendar_eu.js"></script>
<title>Recruitment</title>
<style type="text/css">
<!--
.style1 {color: #FF0000}
.style2 {
	color: #000000;
	font-weight: bold;
}
.style4 {color: #666666}
.style6 {color: #339933; font-weight: bold; }
-->
</style>

<script type="text/javascript">
/*function showEmp(vac_value)
{
	if(document.getElementById("vid").value!="0")
	{
 xmlHttp=GetXmlHttpObject()
if (xmlHttp==null)
 {
 alert ("Browser does not support HTTP Request")
 return
 }
var url="getinterviewer.jsp"
url=url+"?vid="+vac_value

xmlHttp.onreadystatechange=stateChanged;
xmlHttp.open("GET",url,true);
xmlHttp.send(null);

	}
	else
	{
		 alert("Please Select Employee Id");
	}
}
*/
function showEmp(vac_id){
      if (typeof XMLHttpRequest != "undefined"){
      xmlHttp= new XMLHttpRequest();
      }
      else if (window.ActiveXObject){
      xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
      }
      if (xmlHttp==null){
      alert("Browser does not support XMLHTTP Request")
      return;
      }
      var url="getinterviewer.jsp"
      
      url=url+"?vid="+vac_id
      //url=url+"?vid=V003"
      xmlHttp.onreadystatechange = stateChanged;
      xmlHttp.open("GET", url, true);
      xmlHttp.send(null);
      }

function stateChanged() //callback
{
	//document.getElementById("ename").value ="";
	//document.getElementById("eid").value ="";
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 {

  document.getElementById("eid").innerHTML=xmlHttp.responseText;

 }
}

function GetXmlHttpObject()
{
var xmlHttp=null;
try
 {
 // Firefox, Opera 8.0+, Safari
 xmlHttp=new XMLHttpRequest();
 }
catch (e)
 {
 //Internet Explorer
 try
  {
  xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
  }
 catch (e)
  {
  xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
 }
return xmlHttp;
}
</script>
<script type="text/javascript">

function validateForm(){
    var vid=document.form1.vid
    var eid=document.form1.eid
    if(vid.selectedIndex=="")
     {
      alert("Please select a Vacancy");
      vid.focus();
      return false;
     }
     
     if(eid.selectedIndex=="")
     {
      alert("Please select an Interviewer");
      eid.focus();
      return false;
     }
return true
}
</script>
</head>
<body>
<div class="page_wrap clearfix">
  <div class="header_text">
    <h1>&nbsp;</h1>
  </div>
  <div class="topnav" id="nav"> 
    <ul>
      <li><a href="/Recruitment">Home</a></li>
      <li><a href="viewVacancyHR.jsp">View Vacancy</a></li>
      <li><a href="createVacancyInfo.jsp">Create vacancy</a></li>
      <li><a href="ScheduleInterview.jsp">Schedule</a></li>
      <li><a href="changePassword.jsp">Change password</a></li>
      <li><a href="logout.jsp">logout</a></li>
    </ul>
  </div>
  <div class="container clearfix">
    <h2 align="left">Interview Schedule </h2>
    <p align="center">&nbsp;</p>


    <sql:setDataSource
            driver="sun.jdbc.odbc.JdbcOdbcDriver"
            var="myconn"
            url="jdbc:odbc:recruitment"
            scope="session"
    />

    <sql:query var="ints"  dataSource="${myconn}"  sql="select * from vacancy"/>

		<form action="Controller" method="post" name="form1" id="form1" onSubmit="return validateForm()">
		  <table width="95%" height="198" border="0" align="center" cellpadding="8" bordercolor="#9EB874">
            <tr> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top"> </tr>
            
            <tr style="vertical-align: top"> </tr>
            <tr>
      <td valign="middle"><div align="left"><strong>Vacancies: </strong><span class="style1">*</span> </div></td>
      <td>
        <div align="left">

            <select name="vid" id="vid"  style="width:207px;" onchange="showEmp(this.value);">
            <option value="" selected="selected">--Select--</option>
            <c:forEach items="${ints.rows}" var="intsche1" varStatus="stat">
            <option value="${intsche1.Vid}">${intsche1.vdetail}</option>
            </c:forEach>
           </select>
            
        </div></td>
    </tr>
    
	<tr>
      <td valign="middle"><div align="left"><strong>Interviewer: </strong><span class="style1">*</span> </div></td>
      <td>
          <div align="left">
          <div id="eid" style="width:207px;">
              <%--<option value="0" selected="selected">--Select--</option>--%>
            </div>
        </div></td>
    </tr>
            <tr style="vertical-align: top">
              
            </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top" class="FooterColor"> </tr>
          </table>
		  
  		  
		  <div align="center">
                      <input type="hidden" name="req_type" value="4"/>
		    <input type="reset" name="reset" value="Reset">
            <input type="submit" name="Submit" value="Submit" />
          </div>
	</form>
	<p>&nbsp;</p>
    <p>&nbsp;</p>
  </div>
  <div class="footer" id="footer"></div>
</div>
</body>
</html>
<%
    }
  }
}
   catch(java.lang.NullPointerException e){
   response.sendRedirect("/Recruitment/loginRequired.jsp");
}
%>

