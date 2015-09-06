<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : getInformation
    Created on : Feb 4, 2011, 11:30:52 AM
    Author     : sups
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="javax.servlet.RequestDispatcher;"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:useBean class="recruit.beans.GenInformation" id="GenInf" scope="request">
            <jsp:setProperty name="GenInf" property="*"/>
        </jsp:useBean>
        <%--Dob<jsp:getProperty name="GenInf" property="dob"/>
        fname<jsp:getProperty name="GenInf" property="fname"/>
sex<jsp:getProperty name="GenInf" property="sex"/> --%>
        <jsp:useBean class="recruit.beans.ContactDetail" id="Contacts" scope="request">
           <jsp:setProperty name="Contacts" property="*"/>
        </jsp:useBean>

        <jsp:useBean class="recruit.beans.Graduation" id="Grad" scope="request">
           <jsp:setProperty name="Grad" property="*"/>
        </jsp:useBean>

        <jsp:useBean class="recruit.beans.StdX" id="X" scope="request">
           <jsp:setProperty name="X" property="*"/>
        </jsp:useBean>

        <jsp:useBean class="recruit.beans.StdXII" id="XII" scope="request">
           <jsp:setProperty name="XII" property="*"/>
        </jsp:useBean>
        <jsp:forward page="/GetInformation"/>
    </body>
</html>
