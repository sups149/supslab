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
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="description" content="#" />
<meta name="keywords" content="#" />
<meta name="author" content="#" />
<link rel="stylesheet" type="text/css" href="recruitment_css.css" media="screen" />
<link rel="stylesheet" type="text/css" href="print.css" media="print" />
<link rel="stylesheet" href="calendar.css">
<script language="JavaScript" src="calendar_us.js"></script>
<title>Recruitment</title>
<style type="text/css">
<!--
.style1 {color: #FF0000}
.style2 {
	color: #000000;
	font-weight: bold;
}
.style4 {color: #666666}
.style6 {color: #339933; font-weight: bold; }
-->
</style>
<script type="text/javascript">
    /*
    function setCheckedValue() {
        radioObj=document.forms['form1'].elements['sex']
	if(!radioObj)
		return;
	var radioLength = radioObj.length;
	if(radioLength == undefined) {
            radioObj.checked = (radioObj.value == ${inf1.sex}.toString());
		return;
	}
	for(var i = 0; i < radioLength; i++) {
		radioObj[i].checked = false;
		if(radioObj[i].value == ${inf1.sex}.toString()) {
			radioObj[i].checked = true;
		}
	}
}
*/
</script>
</head>

<body>
<div class="page_wrap clearfix">
  <div class="header_text">
    <h1>&nbsp;</h1>
  </div>
  <div class="topnav" id="nav"> 
    <ul>
      <li><a href="/Recruitment">Home</a></li>
      <li><a href="EditDetail.jsp">Edit Profile</a></li>
      <li><a href="ApplyJobs.jsp">Apply Jobs</a></li>
      <li><a href="changePassword.jsp">Change password</a></li>
      <li><a href="ApplicantInterviewDate.jsp">Interview Date</a></li>
      <li><a href="logout.jsp">Logout</a></li>
    </ul>
  </div>

    <sql:setDataSource
            driver="sun.jdbc.odbc.JdbcOdbcDriver"
            var="myconn"
            url="jdbc:odbc:recruitment"
            scope="session"
        />
    <sql:query var="apps"  dataSource="${myconn}"  sql="SELECT * from applicant where Aid=?">
            <sql:param value="${Aid}"/>
    </sql:query>

    <sql:query var="stdx"  dataSource="${myconn}"  sql="SELECT * from stdx where Aid=?">
            <sql:param value="${Aid}"/>
    </sql:query>

    <sql:query var="stdxii"  dataSource="${myconn}"  sql="SELECT * from stdxii where Aid=?">
            <sql:param value="${Aid}"/>
    </sql:query>

    <sql:query var="graduation"  dataSource="${myconn}"  sql="SELECT * from graduation where Aid=?">
            <sql:param value="${Aid}"/>
    </sql:query>


        <center>
        

        </center>
  <div class="container clearfix">
    <h2 align="left">general information </h2>
    <p align="center">&nbsp;</p>
		<form action="Controller" method="get" name="form1" id="form1">
                    <c:forEach items="${apps.rows}" var="inf1">
		  <table width="95%" height="198" border="0" align="center" cellpadding="8" bordercolor="#9EB874" on>
            <tr> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top">
              <td height="46" align="center" valign="middle" class="LabelColor" style="text-align: right"><div align="left"><strong>First Name:</strong><span class="style1">*</span> </div></td>
              <td width="24%" valign="middle" class="TitleColor"><label for="first"></label>
                  
                  <input type="text" id="fname" name="fname" value="${inf1.fname}"/>
              </td>
              <td width="60%" valign="middle" class="TitleColor"><label for="last"><strong>Last Name: </strong><span class="style1">*</span> </label>
                  <input type="text" id="lname" name="lname" value="${inf1.lname}"/>
              </td>
            </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top">
              <td valign="middle" class="LabelColor" style="text-align: right"><div align="left"><strong>Sex</strong><span class="style1"><span class="style2">:</span> *</span></div></td>
              <td colspan="2"><p class="TitleColor" >

                  <label for="male">Male </label>
                  <input type="radio" id="male" name="sex" value="Male" />
                  <label for="female">Female </label>
                  <input type="radio" id="female" name="sex" value="Female" />
              </p></td>
            </tr>
            <tr style="vertical-align: top">
              <td align="left" class="LabelColor" style="text-align: right"><div align="left"><strong>Date of Birth:</strong> <span class="style1">*</span> </div></td>
              <td colspan="2"><!-- calendar attaches to existing form element -->
                  <input type="text" name="dob" value="${inf1.dob}"/>
                  <script language="JavaScript">
	new tcal ({
		// form name
		'formname': 'form1',
		// input name
		'controlname': 'dob'
	});

	        </script>
                  <br />
                  <span class="style4">mm/dd/yyyy</span> </td>
            </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top" class="FooterColor"> </tr>
          </table>
		  <p>&nbsp;</p>
  <h2 align="left">Contact Details</h2>
  <p align="left">&nbsp;</p>
  <table width="722" border="0" align="center">
    <tr>
      <td width="70"><div align="left"><strong>E-mail:</strong> <span class="style1">*</span> </div></td>
      <td width="239"><div align="left">
        <input name="email" type="text" value="${inf1.email}" size="30">
      </div></td>
    </tr>
    <tr>
      <td><div align="left"><strong>Address line: </strong><span class="style1">*</span> </div></td>
      <td>
        <div align="left">
          <textarea name="address" rows="4" cols="23" >${inf1.address}</textarea>
        </div></td>
    </tr>
	<tr>
		<td width="70"><div align="left"><strong>City:</strong> <span class="style1">*</span> </div></td>
		<td width="239"><div align="left">
		  <div align="left">
		    <input name="city" type="text" size="30" value="${inf1.city}">
		    
            </div></div></td>
	</tr>
	<tr>
      <td width="70"><div align="left"><strong>State:</strong> <span class="style1">*</span> </div></td>
      <td width="239"><div align="left">
        <select name="state" id="state" class="bigselect" style="width:207px;">
					<option value="0">--Select--</option>
					<option value="AN    ">Andaman and Nicobar Islands   </option>
					<option value="AP    ">Andhra Pradesh                </option>
					<option value="AR    ">Arunachal Pradesh             </option>
					<option value="AS    ">Assam                         </option>
					<option value="BR    ">Bihar                         </option>
					<option value="CH    ">Chandigarh (UT)               </option>
					<option value="CT    ">Chhattisgarh                  </option>
					<option value="DD    ">Daman and Diu (UT)            </option>
					<option value="DL    ">Delhi (UT)                    </option>
					<option value="DN    ">Dadra and Nagar Haveli (UT)   </option>
					<option value="GA    ">Goa                           </option>
					<option value="GJ    ">Gujarat                       </option>
					<option value="HP    ">Himachal Pradesh              </option>
					<option value="HR    ">Haryana                       </option>
					<option value="JH    ">Jharkhand                     </option>
					<option value="JK    ">Jammu and Kashmir             </option>
					<option value="KA    ">Karnataka                     </option>
					<option value="KL    ">Kerala                        </option>
					<option value="LA    ">Lashwadeep(UT)                </option>
					<option value="MH    ">Maharashtra                   </option>
					<option value="ML    ">Meghalaya                     </option>
					<option value="MN    ">Manipur                       </option>
					<option value="MP    ">Madhya Pradesh                </option>
					<option value="MZ    ">Mizoram                       </option>
					<option value="NG    ">Nagaland                      </option>
					<option value="OR    ">Orissa                        </option>
					<option value="PB    ">Punjab                        </option>
					<option value="PY    ">Pondicherry (UT)              </option>
					<option value="RJ    ">Rajasthan                     </option>
					<option value="SK    ">Sikkim                        </option>
					<option value="TN    ">Tamil Nadu                    </option>
					<option value="TR    ">Tripura                       </option>
					<option value="UP    ">Uttar Pradesh                 </option>
					<option value="UT    ">Uttaranchal                   </option>
					<option value="WB    ">West Bengal                   </option>

			  </select>
      </div></td>
    </tr>
	<tr>
      <td width="70"><div align="left"><strong>PIN Code: </strong><span class="style1">*</span> </div></td>
      <td width="239"><div align="left">
        <input name="pin" type="text" value="${inf1.pin}" size="30">
      </div></td>
    </tr>
	
	<tr>
      <td width="70" valign="top"><div align="left"><strong>Phone with Area Code: </strong></div></td>
      <td width="239" valign="bottom"><div align="left">
        <input name="phone" type="text" value="${inf1.phone}" size="30"><br>
        <span class="style4 style3"><em>Please don't use brackets or hyphen to separate the area code</em></span>      </div></td>
    </tr>
	
	<tr>
      <td width="70" valign="top"><div align="left"><strong>Mobile: </strong><span class="style1">*</span> </div></td>
      <td width="239"><div align="left">
        <input name="mobile" type="text" value="${inf1.mobile}" size="30"><br>
        <span class="style4 style3"><em>ex: 9876543210</em></span>      </div></td>
    </tr>

        
	 <!--<tr style="vertical-align: top" class="FooterColor">
     <td colspan="3">
	  	<input name="Previous" type="button" value="Previous" />
	  	<input type="reset" name="reset" value="Reset">
        <input type="submit" name="Submit" value="Next" />     </td>
    </tr>-->
  </table>
  </c:forEach>
  <c:forEach items="${stdx.rows}" var="inf2">
          <p>&nbsp;</p>
		  <h2 align="left">Academic Qualification</h2>
		  <p align="left">&nbsp;</p>
		  <table width="719" border="0" align="center">
  <tr>
    <td width="713" valign="top"><div align="left" class="style6">  Std X Details</div></td>
  </tr>
</table>

		  <table width="722" border="0" align="center">
    <tr>
      <td width="162" valign="middle"><div align="left"><strong>Year of passing:</strong> <span class="style1">*</span> </div></td>
      <td width="550"><input name="yrp1" type="text" id="yrp1" value="${inf2.yrp}" size="30" /></td>
    </tr>
    <tr>
      <td valign="middle"><div align="left"><strong>Board: </strong><span class="style1">*</span> </div></td>
      <td>
        <div align="left">
          <select name="boardx" class="bigselect" id="boardx" style="width:207px;">
            <option value="0" selected="selected">--Select--</option>
            <option value="state">State Board</option>
            <option value="C.B.S.E">C.B.S.E</option>
            <option value="I.C.S.E">I.C.S.E</option>
              </select>
        </div></td>
    </tr>
	<tr>
		<td width="162" valign="middle"><div align="left"><strong>Percentage:</strong> <span class="style1">*</span> </div></td>
		<td width="550"><div align="left">
		  <div align="left">
		    <input name="marks1" type="text" id="marks1" value="${inf2.marks}" size="30">
          </div></div></td>
	</tr>
  </table>	  

  </c:forEach>
                  <p>&nbsp;</p>

                  <c:forEach items="${stdxii.rows}" var="inf3">
		  <table width="719" border="0" align="center">
            <tr>
              <td width="713" valign="top"><div align="left" class="style6"> Std XII Details</div></td>
            </tr>
          </table>
		  <table width="722" border="0" align="center">
            <tr>
              <td width="162" valign="middle"><div align="left"><strong>Year of passing:</strong> <span class="style1">*</span> </div></td>
              <td width="550"><input name="yrp2" type="text" id="yrp2" value="${inf3.yrp}" size="30" /></td>
            </tr>
            <tr>
              <td valign="middle"><div align="left"><strong>Board: </strong><span class="style1">*</span> </div></td>
              <td><div align="left">
                  <select name="boardxii" class="bigselect" id="boardxii" style="width:207px;">
                    <option value="0" selected="selected">--Select--</option>
                    <option value="state">State Board</option>
                    <option value="C.B.S.E">C.B.S.E</option>
                    <option value="I.S.C">I.S.C</option>
                </select>
              </div></td>
            </tr>
            <tr>
              <td width="162" valign="middle"><div align="left"><strong>Percentage:</strong> <span class="style1">*</span> </div></td>
              <td width="550"><div align="left">
                  <div align="left">
                    <input name="marks2" type="text" id="marks2" value="${inf3.marks}" size="30" />
                </div></div></td>
            </tr>
          </table>
                  </c:forEach>
		  <p align="left">&nbsp; </p>
		  <p>&nbsp;</p>
          <h2 align="left">Graduation</h2>
		  <p align="left">&nbsp;</p>

                  <c:forEach items="${graduation.rows}" var="inf4">
		  <table width="722" border="0" align="center">
    <tr>
      <td width="162" valign="middle"><div align="left"><strong>Degree:</strong> <span class="style1">*</span> </div></td>
      <td width="550"><select name="degree" class="bigselect" id="degree" style="width:207px;">
        <option value="0" selected="selected">--Select--</option>
        <option value="BTech">B Tech</option>
        <option value="Bsc">Bsc</option>
          </select></td>
    </tr>
    <tr>
      <td valign="middle"><div align="left"><strong>Branch: </strong><span class="style1">*</span> </div></td>
      <td>
        <div align="left">
          <select name="branch" class="bigselect" id="branch" style="width:207px;">
            <option value="0" selected="selected">--Select--</option>
            <option value="CSE">Computer Sc. &amp;  Engg.</option>
            <option value="IT">Information Technology</option>
            <option value="EE">Electrical Engg.</option>
            <option value="ECE">Electronics &amp; Comm. Engg</option>
              </select>
        </div></td>
    </tr>
	<tr>
		<td width="162" valign="middle"><div align="left"><strong>College:</strong> <span class="style1">*</span> </div></td>
		<td width="550"><div align="left">
		  <div align="left">
		    <input name="college" type="text" id="college" value="${inf4.college}" size="30">
		    
          </div></div></td>
	</tr>
	<tr>
      <td width="162" valign="middle"><div align="left"><strong>University:</strong> <span class="style1">*</span> </div></td>
      <td width="550"><div align="left">
        <input name="university" type="text" id="university" value="${inf4.university}" size="30" />
      </div></td>
    </tr>
	<tr>
      <td width="162" valign="middle"><div align="left"><strong>Year                                   of passing: </strong><span class="style1">*</span> </div></td>
      <td width="550"><div align="left">
        <input name="yrp3" type="text" id="yrp3" value="${inf4.yrp}" size="30">
      </div></td>
    </tr>
	
	<tr>
      <td width="162" valign="middle"><div align="left"><strong>Mode of education: </strong><span class="style1">*</span></div></td>
      <td width="550" valign="bottom"><div align="left">
        <select name="me" class="bigselect" id="me" style="width:207px;">
          <option value="0" selected="selected">--Select--</option>
          <option value="FT">Full Time</option>
          <option value="PT">Part Time</option>
          <option value="D">Distance</option>
              </select>
        <br>
      </div></td>
    </tr>
	
	<tr>
      <td width="162" valign="middle"><div align="left"><strong>Overall                                   Percentage/CGPA: </strong><span class="style1">*</span> </div></td>
      <td width="550"><div align="left">
        <input name="marks3" type="text" id="marks3" value="${inf4.marks}" size="30">
        <br>
      </div></td>
    </tr>
  </table>
                  </c:forEach>
  		  
		  <div align="center">
                      <input type="hidden" name="req_type" value="1"/>
		    <input type="reset" name="reset" value="Reset">
            <input type="submit" name="Submit" value="Submit" />
          </div>
	</form>
	<p>&nbsp;</p>
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