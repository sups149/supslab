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
        if(utype.equals("HR"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/UnauthorisedUser.jsp"));
        if(utype.equals("interviewer"))
    response.sendRedirect(response.encodeRedirectURL("/Recruitment/UnauthorisedUser.jsp"));

    if(utype.equals("applicant")){

%>

<html>
<head>
    <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
    <%@ taglib uri='http://java.sun.com/jsp/jstl/sql' prefix='sql'%>
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
      <li><a href="ApplyJobs.jsp">Apply Jobs</a></li>
      <li><a href="changePassword.jsp">Change password</a></li>
      <li><a href="ApplicantInterviewDate.jsp">Interview Date</a></li>
      <li><a href="logout.jsp">Logout</a></li>
    </ul>
      

    </ul>
  </div>
  <div class="container clearfix">
       <sql:setDataSource
            driver="sun.jdbc.odbc.JdbcOdbcDriver"
            var="myconn"
            url="jdbc:odbc:recruitment"
            scope="request"
        />

       <sql:query var="app" dataSource="${myconn}">
           select fname from applicant where Aid = ?
           <sql:param value="${Aid}"/>
       </sql:query>
           <h2>Welcome, <c:forEach items="${app.rows}" var="appls">
                   ${appls.fname}
               </c:forEach></h2>
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