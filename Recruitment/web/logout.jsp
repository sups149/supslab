<%-- 
    Document   : index
    Created on : Feb 1, 2011, 11:13:42 PM
    Author     : sups
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
HttpSession mysession=request.getSession(false);
mysession.invalidate();
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
</head>
    <body>
<div class="page_wrap clearfix">
  <div class="header_text">
    <h1>&nbsp;</h1>
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
    <h2 align="center">you are successfully logged out</h2>
    <p align="center">
      <a href="login.jsp"><input type="button" name="login" value="login again"></a>
    </p>
    <p align="center">&nbsp;</p>
	<center>
            
    </center>
	
  </div>
  <div class="footer" id="footer"></div>
</div>
</body>
</html>