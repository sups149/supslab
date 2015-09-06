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
      <li><a href="ViewInterviewerSchedule.jsp">Interview Schedule</a></li>
      <li><a href="viewApplicant.jsp">View applicant</a></li>
      <li><a href="changePassword.jsp">Change password</a></li>
      <li><a href="logout.jsp">logout</a></li>

    </ul>
  </div>
  <div class="container clearfix">
      <h2>Welcome, Mr. ${name}</h2>
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