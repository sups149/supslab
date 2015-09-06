<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : Feb 1, 2011, 11:13:42 PM
    Author     : sups
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

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
      <li><a href="viewVacancyHR.jsp">View Vacancy</a></li>
      <li><a href="createVacancyInfo.jsp">Create vacancy</a></li>
      <li><a href="ScheduleInterview.jsp">Schedule</a></li>
      <li><a href="changePassword.jsp">Change password</a></li>
      <li><a href="logout.jsp">logout</a></li>
    </ul>
  </div>
  <div class="container clearfix">
    <h2 align="center">interview scheduled </h2>
    <p>&nbsp;</p>
	<sql:setDataSource
            driver="sun.jdbc.odbc.JdbcOdbcDriver"
            var="myconn"
            url="jdbc:odbc:recruitment"
            scope="request"
        />

        <%-- <sql:update dataSource="${requestScope.myconn}">
            insert into int_schedule (Vid, Eid, int_date) values (?,?,?)
              <sql:param value="${param.vid}"/>
              <sql:param value="${param.eid}"/>
              <sql:param value="${param.int_date}"/>
              
        </sql:update>
        --%>
              <sql:update var="intsch" scope="request" dataSource="${myconn}">
                  INSERT INTO int_schedule (Vid, Eid)
                  VALUES (?,?)
                  <sql:param value="${param.vid}"/>
              <sql:param value="${param.eid}"/>
              
              </sql:update>
  </div>
  <div class="footer" id="footer"></div>
</div>
    </body>
</html>