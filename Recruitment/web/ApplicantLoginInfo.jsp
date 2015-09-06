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
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/RegisteredApplicantHome.jsp"));

    if(utype.equals("HR"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/HRHome.jsp"));

    if(utype.equals("interviewer"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/InterviewerHome.jsp"));
    }
        }
   catch(java.lang.NullPointerException e){
   //response.sendRedirect("/Recruitment/home.jsp");
   //}
%>
<html>
<head>
    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="#" />
<meta name="keywords" content="#" />
<meta name="author" content="#" />
<link rel="stylesheet" type="text/css" href="recruitment_css.css" media="screen" />
<link rel="stylesheet" type="text/css" href="print.css" media="print" />
<title>Recruitment</title>
<style type="text/css">
<!--
.style1 {
	color: #FF0000;
	font-weight: bold;
}
-->
</style>
</head>
    <body>
        <div class="page_wrap clearfix">
  <div class="header_text">
    
  </div>
  <div class="topnav" id="nav"> 
    <ul>
      <li><a href="/Recruitment">Home</a></li>
        <li><a href="login.jsp">Login</a></li>
	<li><a href="Registration.jsp">Register</a></li>
        <li><a href="about.html">About Us</a></li>
    </ul>
  </div>
  <div class="container clearfix">

    <h2 align="center">Your login informaion:</h2>
    <p align="left" class="style1">Your User Id is: ${nextId}</p>
    <p align="left" class="style1">You password is: ${GenInf.dob}</p>
    <p>&nbsp;</p>
	
  </div>
  <div class="footer" id="footer"></div>
</div>
    </body>
</html>
<%
}
%>