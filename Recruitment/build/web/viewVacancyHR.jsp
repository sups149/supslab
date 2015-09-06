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
      <li><a href="viewVacancyHR.jsp">View Vacancy</a></li>
     <li><a href="createVacancyInfo.jsp">Create vacancy</a></li>
      <li><a href="ScheduleInterview.jsp">Schedule</a></li>
      <li><a href="changePassword.jsp">Change password</a></li>
      <li><a href="logout.jsp">logout</a></li>
    </ul>
  </div>
  <div class="container clearfix">
      <h2><center>Vacancy table</center></h2>
    <p>&nbsp;</p>
	
  </div>

        <sql:setDataSource
            driver="sun.jdbc.odbc.JdbcOdbcDriver"
            var="myconn"
            url="jdbc:odbc:recruitment"
            scope="session"
        />

        <sql:query var="vacancy"  dataSource="${myconn}"  sql="select * from vacancy where closedate>=Date()"/>
        <center>
        <table border="1" bordercolor="#000000" bgcolor="#FFFFFF">
            <thead>
                <tr>
                    <th>Vid</th>
                    <th>Detail</th>
                    <th>No. of Vacancy</th>
                    <th>Opening date</th>
                    <th>Closing date</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${vacancy.rows}" var="vac" varStatus="stat">
                <tr>
                    <td bordercolor="#666666">${vac.Vid}</td>
                    <td bordercolor="#666666">${vac.vdetail}</td>
                    <td bordercolor="#666666">${vac.nov}</td>
                    <td bordercolor="#666666">${vac.opendate}</td>
                    <td bordercolor="#666666">${vac.closedate}</td>
                    <td>${vac.vstatus}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        </center>


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