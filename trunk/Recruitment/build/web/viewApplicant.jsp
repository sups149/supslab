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
        if(utype.equals("HR"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/UnauthorisedUser.jsp"));

    if(utype.equals("interviewer")){
   
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


</head>
<body>
<div class="page_wrap clearfix">
  <div class="header_text">
    <h1>&nbsp;</h1>
  </div>
  <div class="topnav" id="nav"> 
    <ul>
      <li><a href="/Recruitment">Home</a></li>
      <li><a href="ViewInterviewerSchedule.jsp">Interview Schedule</a></li>
      <li><a href="viewApplicant.jsp">View applicant</a></li>
      <li><a href="changePassword.jsp">Change password</a></li>
      <li><a href="logout.jsp">logout</a></li>
    </ul>
  </div>
  <div class="container clearfix">
    <h2 align="left">Select Vacancy to view Applicant </h2>
    <p align="center">&nbsp;</p>


    <sql:setDataSource
            driver="sun.jdbc.odbc.JdbcOdbcDriver"
            var="myconn"
            url="jdbc:odbc:recruitment"
            scope="session"
    />

    <sql:query var="ints"  dataSource="${myconn}"  sql="select Vid from int_schedule where Eid=?">
         <sql:param value="${Eid}"/>
    </sql:query>
    
		<form action="getApplicant.jsp" method="post" name="form1" id="form1">
		  <table width="95%" height="40" border="0" align="center" cellpadding="8" bordercolor="#9EB874">
            <tr> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr>
              <td valign="middle"><div align="left"><strong>Vacancies: </strong><span class="style1">*</span> </div></td>
              <td><div align="left">
                  <select name="vid" id="vid"  style="width:207px;" >
                    <option value="" selected="selected">--Select--</option>
                    <c:forEach items="${ints.rows}" var="intsche1" varStatus="stat">
                      <option value="${intsche1.Vid}">${intsche1.Vid}</option>
                    </c:forEach>
                  </select>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" name="Submit" value="Search"/>
              </div></td>
            </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top" class="FooterColor"> </tr>
          </table>
		  <div align="center">
                      <input type="hidden" name="req_type" value="7"/>
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

