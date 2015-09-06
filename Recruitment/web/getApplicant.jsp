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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="#" />
<meta name="keywords" content="#" />
<meta name="author" content="#" />

<title>Recruitment</title>
</head>
    <body>
    <div class="page_wrap clearfix">
      <sql:setDataSource
            driver="sun.jdbc.odbc.JdbcOdbcDriver"
            var="myconn"
            url="jdbc:odbc:recruitment"
            scope="session"
        />

        <sql:query var="vacancy"  dataSource="${myconn}"  sql="SELECT applicant.Aid,fname,lname,sex,dob,email,address,city,state,pin,phone,mobile,
stdx.yrp as yrpx, stdx.board as boardx, stdx.marks as marksx, stdxii.yrp as yrpxii, stdxii.board as boardxii, stdxii.marks as marksxii,
graduation.degree, graduation.branch, graduation.college, graduation.university, graduation.yrp as yrpg, graduation.marks as marksg
FROM ((applicant INNER JOIN stdx ON applicant.Aid = stdx.Aid) INNER JOIN stdxii ON stdx.Aid = stdxii.Aid) INNER JOIN graduation ON stdxii.Aid = graduation.Aid
WHERE (((applicant.Aid) In (select Aid from applicant_vacancy where Vid=?)));">

            <sql:param value="${param.vid}"/>
        </sql:query>
           
            
       
        <center>
            <table border="1" bordercolor="#000000" bgcolor="#FFFFFF" align="left">
            <thead>
                <tr>
                    <th>Aid</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Sex</th>
                    <th>Date of Birth</th>
                    <th>email</th>
                    <th>Address</th>
                    <th>City</th>
                    <th>State</th>
                    <th>Pin code</th>
                    <th>Phone No.</th>
                    <th>Mobile No.</th>
                    <th>Year of Passing(X)</th>
                    <th>Board(X)</th>
                    <th>Marks(X)</th>
                    <th>Year of Passing(XII)</th>
                    <th>Board(XII)</th>
                    <th>marks(XII)</th>
                    <th>Degree</th>
                    <th>Stream</th>
                    <th>College</th>
                    <th>University</th>
                    <th>Year of Passing(Graduation)</th>
                    <th>Marks(CGPA/%)</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${vacancy.rows}" var="vac" varStatus="stat">
                <tr>
                    <td bordercolor="#666666">${vac.Aid}</td>
                    <td bordercolor="#666666">${vac.fname}</td>
                    <td bordercolor="#666666">${vac.lname}</td>
                    <td bordercolor="#666666">${vac.sex}</td>
                    <td bordercolor="#666666">${vac.dob}</td>
                    <td bordercolor="#666666">${vac.email}</td>
                    <td bordercolor="#666666">${vac.address}</td>
                    <td bordercolor="#666666">${vac.city}</td>
                    <td bordercolor="#666666">${vac.state}</td>
                    <td bordercolor="#666666">${vac.pin}</td>
                    <td bordercolor="#666666">${vac.phone}</td>
                    <td bordercolor="#666666">${vac.mobile}</td>
                    <td bordercolor="#666666">${vac.yrpx}</td>
                    <td bordercolor="#666666">${vac.boardx}</td>
                    <td bordercolor="#666666">${vac.marksx}</td>
                    <td bordercolor="#666666">${vac.yrpxii}</td>
                    <td bordercolor="#666666">${vac.boardxii}</td>
                    <td bordercolor="#666666">${vac.marksxii}</td>
                    <td bordercolor="#666666">${vac.degree}</td>
                    <td bordercolor="#666666">${vac.branch}</td>
                    <td bordercolor="#666666">${vac.college}</td>
                    <td bordercolor="#666666">${vac.university}</td>
                    <td bordercolor="#666666">${vac.yrpg}</td>
                    <td bordercolor="#666666">${vac.marksg}</td>
                    
                    
                </tr>
                </c:forEach>
            </tbody>
        </table>
            <a href="/Recruitment">Go back Home</a>
        </center>


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