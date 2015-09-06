

<%@page import="recruit.functions.ChooseHome"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="org.apache.naming.factory.SendMailFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
/*HttpSession mysession=request.getSession(false);
if(!mysession.isNew()){
    //=null;
    response.sendRedirect("/Recruitment/ChooseHome");
    //RequestDispatcher rd=request.getRequestDispatcher("/ChooseHome");
    //rd.forward(request, response);
    }
 */
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
.style2 {
	font-size: 1em;
	color: #A80810;
	font-weight: bold;
}
.style4 {font-size: 1.5em}
.style5 {color: #A80810}
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
    <h2 class="style4">SPND Technology, creating new world    </h2>
    <p>
      <!-- <p><em class="grey">Update: You're looking at an updated version of this design. Thanks to everyone who provided feedback for the update, especially Andreas. A list of details on what was done is listed further down.</em></p> -->
    </p>
    <table width="100%" border="0">
      <tr>
        <td width="33%" height="314" valign="top"><p class="style5">&nbsp;&nbsp;<strong> Welcome to the  SPND Technology  Domain.   We are a fast growing Software Development Company and our rapid  expansion opens up an array of employment opportunities for professionals at  various levels. We are on look out for the right candidate to accelerate the  growth of the company into the next generation.</strong></p>
        <p class="style2">&nbsp;&nbsp;It is rightly said -  &quot;The joy of work is contained in two words - Excellence and Fun!&quot; The  ambience here helps one feel right at home. That is why SPND Technology is considered a  home away from home - a place where the latent creative talents and abilities  of every individual is realized so effortlessly, that excellence is now a built  in trait of every insider.</p></td>
        <td width="67%"><img src="images/homepic.jpg" width="597" height="409" longdesc="images/homepic.jpg"></td>
      </tr>
    </table>
    <p>&nbsp;     </p>
    <h2>&nbsp;</h2>
	</div>
  <div class="footer" id="footer"></div>
</div>
    </body>
</html>
