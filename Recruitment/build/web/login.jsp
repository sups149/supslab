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
    <h2 align="center">please enter userid &amp; password to login</h2>
    <p align="center">&nbsp;</p>
	<center>
            <form action="Controller" method="post">
								    <p>&nbsp;</p>
								    <table width="240" height="82" bordercolor="#000000" background="../rsz_copy_of_picture1.jpg" bgcolor="#CFD9BE">
                                    <tbody>
                                      <tr>
                                          <td width="81" align="left" class="style8"><strong>User ID:</strong> </td>
                                        <td width="134">                                          <input name="uid" type="text" id="uid" size="18" />                                        </td>
                                      </tr>
                                      <tr>
                                        <td align="left" valign="middle"><strong>Password:</strong></td>
                                        <td><input name="password" type="password" id="password" value="" size="18" /></td>
                                      </tr>
                                      <tr>
                                        <td align="left" valign="middle"><strong>User type:</strong></td>
                                        <td><select name="utype" class="bigselect" id="utype" style="width:135px;">
                                          <option value="0" selected="selected">--Select--</option>
                                          <option value="applicant">Applicant</option>
                                          <option value="interviewer">Interviewer</option>
                                          <option value="HR">HR</option>
                                                                                </select></td>
                                      </tr>
                                    </tbody>
        </table>
	    <br>
		
								    <input type="submit" name="submit" value="login">
									  <input type="reset" name="reset" value="reset">
									  <input type="hidden" name="req_type" value="2"/>
	  </form>
    </center>
	<p align="center">
    <p>&nbsp;</p>
  </div>
  <div class="footer" id="footer"></div>
</div>
</body>
</html>
<%
}
%>