
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
try{
        HttpSession mysession=request.getSession(false);
        String utype=(String)mysession.getAttribute("utype");
        if(mysession!=null){
            if(!utype.equals("applicant")||!utype.equals("HR")||!utype.equals("interviewer"))
                {

%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="#" />
<meta name="keywords" content="#" />
<meta name="author" content="#" />
<link rel="stylesheet" type="text/css" href="recruitment_css.css" media="screen" />
<link rel="stylesheet" type="text/css" href="print.css" media="print" />
<%
        //HttpSession mysesssion=request.getSession(false);
        //String password=(String)mysesssion.getAttribute("password");

%>
<script language = "Javascript">
function echeck(str) {
		var conpass=document.frmSample.cnewpass.value
		if(conpass!=str){
		return false
		}
 		return true					
	}
<%--function cpasscheck(str){
    var curpass=document.frmSample.curpass.value
    if(curpass!=str)
        return false
    else
        return true
}
--%>
function ValidateForm(){
	var emailID=document.frmSample.newpass
	var cpass=document.frmSample.cnewpass

	if ((emailID.value==null)||(emailID.value=="")){
		alert("Please Enter your New Password")
		emailID.focus()
		return false
	}
	if (echeck(emailID.value)==false){
		alert("Please Enter your Password correctly")
		emailID.value=""
		cpass.value=""
		emailID.focus()
		return false
	}
     <%--   if(cpasscheck(password)==false){
           alert("current password does not match!")
           return false
}--%>
	return true
 }
</script>
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
      
      <li><a href="changePassword.jsp">Change password</a></li>
      
      <li><a href="logout.jsp">Logout</a></li>
    </ul>
  </div>
  <div class="container clearfix">
    <h2 align="left">Welcome, ${name}</h2>
    <p align="center">&nbsp;</p>
	<center>
            <form name="frmSample" action="Controller" method="post" onSubmit="return ValidateForm()">
								    <p>&nbsp;</p>
								    <table width="302" height="82" bordercolor="#000000" background="../rsz_copy_of_picture1.jpg" bgcolor="#CFD9BE">
                                    <tbody>
									<tr>
                                        <td width="172" align="left" class="style8"><strong>Current password: </strong></td>
                                        <td width="118">                                          <input name="curpass" type="password" id="curpass" size="18" />                                        </td>
                                      </tr>
                                      <tr>
                                        <td width="172" align="left" class="style8"><strong>New password: </strong></td>
                                        <td width="118">                                          <input name="newpass" type="password" id="newpass" size="18" />                                        </td>
                                      </tr>
                                      <tr>
                                        <td align="left" valign="middle"><strong>Confirm password:</strong></td>
                                        <td><input name="cnewpass" type="password" id="cnewpass" size="18" /></td>
                                      </tr>
                                    </tbody>
        </table>
	    <br>
		
								    <input name="change" type="submit" id="change" value="Change">
									  <input type="reset" name="reset" value="reset">
									  <input type="hidden" name="req_type" value="6"/>
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
 }
}
   catch(java.lang.NullPointerException e){
   response.sendRedirect("/Recruitment/loginRequired.jsp");
}
%>