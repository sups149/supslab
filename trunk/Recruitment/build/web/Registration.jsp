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
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="description" content="#" />
<meta name="keywords" content="#" />
<meta name="author" content="#" />
<link rel="stylesheet" type="text/css" href="recruitment_css.css" media="screen" />
<link rel="stylesheet" type="text/css" href="print.css" media="print" />
<link rel="stylesheet" href="calendar.css">
<script language="JavaScript" src="calendar_us.js"></script>
<script language="Javascript">
var digits = "0123456789";
var phoneNumberDelimiters = "()- ";
var validWorldPhoneChars = phoneNumberDelimiters + "+";
var minDigitsInIPhoneNumber = 10;
function isInteger(s)
	{   var i;
    	for (i = 0; i < s.length; i++)
    	{
        	var c = s.charAt(i);
        	if (((c < "0") || (c > "9"))) return false;
    	}
    	return true;
	}

function checkRadio (Registration, sex) {
 var radios = document[Registration].elements[sex];
 for (var i=0; i <radios.length; i++) {
  if (radios[i].checked) {
   return true;
  }
 }
 return false;
}

var separator= "/";
var minYear=1975;
var maxYear=1990;

function isIntegerDate(s){
	var i;
    for (i = 0; i < s.length; i++){
        // Check that current character is a number or not.
        var c = s.charAt(i);
        if (((c < "0") || (c > "9"))) return false;
    }
    // All characters are numbers.
    return true;
}

function stripCharsInBag(s, bag){
	var i;
    var returnString = "";
    // Search through string's characters one by one.
    // If character is not in bag, append to returnString.
    for (i = 0; i < s.length; i++){
        var c = s.charAt(i);
        if (bag.indexOf(c) == -1) returnString += c;
    }
    return returnString;
}

function daysInFebruary (year){
	// February has 29 days in any year evenly divisible by four,
    // EXCEPT for centurial years which are not also divisible by 400.
    return (((year % 4 == 0) && ( (!(year % 100 == 0)) || (year % 400 == 0))) ? 29 : 28 );
}
function DaysArray(n) {
	for (var i = 1; i <= n; i++) {
		this[i] = 31
		if (i==4 || i==6 || i==9 || i==11) {this[i] = 30}
		if (i==2) {this[i] = 29}
   }
   return this
}

function isDate(dtStr){
	var daysInMonth = DaysArray(12)
	var pos1=dtStr.indexOf(separator)
	var pos2=dtStr.indexOf(separator,pos1+1)
	var strMonth=dtStr.substring(0,pos1)
	var strDay=dtStr.substring(pos1+1,pos2)
	var strYear=dtStr.substring(pos2+1)
	strYr=strYear
	if (strDay.charAt(0)=="0" && strDay.length>1) strDay=strDay.substring(1)
	if (strMonth.charAt(0)=="0" && strMonth.length>1) strMonth=strMonth.substring(1)
	for (var i = 1; i <= 3; i++) {
		if (strYr.charAt(0)=="0" && strYr.length>1) strYr=strYr.substring(1)
	}
	month=parseInt(strMonth)
	day=parseInt(strDay)
	year=parseInt(strYr)
	if (pos1==-1 || pos2==-1){

		return false
	}
	if (strMonth.length<1 || month<1 || month>12){
		alert("Please enter a valid month")
		return false
	}
	if (strDay.length<1 || day<1 || day>31 || (month==2 && day>daysInFebruary(year)) || day > daysInMonth[month]){
		alert("Please enter a valid day")
		return false
	}
	if (strYear.length != 4 || year==0 || year<minYear || year>maxYear){
		alert("Please enter a valid 4 digit year between "+minYear+" and "+maxYear)
		return false
	}
	if (dtStr.indexOf(separator,pos2+1)!=-1 || isIntegerDate(stripCharsInBag(dtStr, separator))==false){
		alert("Please enter a valid date")
		return false
	}
		//alert("Entered date is valid")
		return true
}

function trim(s)
	{   var i;
    	var returnString = "";
    	for (i = 0; i < s.length; i++)
    	{
        	var c = s.charAt(i);
        	if (c != " ") returnString += c;
    	}
    	return returnString;
}

function stripCharsInBag(s, bag)
	{   var i;
    	var returnString = "";
    	for (i = 0; i < s.length; i++)
    	{
        	var c = s.charAt(i);
      	if (bag.indexOf(c) == -1) returnString += c;
    }
    return returnString;
}
/*function yearValidation()
{
var yrmin=2003
var yrmax=2008
if()
}*/
function checkInternationalPhone(strPhone){
	var bracket=3
	strPhone=trim(strPhone)
	if(strPhone.indexOf("+")>1) return false
	if(strPhone.indexOf("-")!=-1)bracket=bracket+1
	if(strPhone.indexOf("(")!=-1 && strPhone.indexOf("(")>bracket)
	return false
	var brchr=strPhone.indexOf("(")
	if(strPhone.indexOf("(")!=-1 && strPhone.charAt(brchr+2)!=")")
	return false
	if(strPhone.indexOf("(")==-1 && strPhone.indexOf(")")!=-1)
	return false
	s=stripCharsInBag(strPhone,validWorldPhoneChars);
	return (isInteger(s) && s.length >= minDigitsInIPhoneNumber);
}

function echeck(str) {

		var at="@"
		var dot="."
		var lat=str.indexOf(at)
		var lstr=str.length
		var ldot=str.indexOf(dot)
		if (str.indexOf(at)==-1){
		   alert("Invalid E-mail ID")
		   return false
		}

		if (str.indexOf(at)==-1 || str.indexOf(at)==0 || str.indexOf(at)==lstr){
		   alert("Invalid E-mail ID")
		   return false
		}

		if (str.indexOf(dot)==-1 || str.indexOf(dot)==0 || str.indexOf(dot)==lstr){
		    alert("Invalid E-mail ID")
		    return false
		}

		 if (str.indexOf(at,(lat+1))!=-1){
		    alert("Invalid E-mail ID")
		    return false
		 }

		 if (str.substring(lat-1,lat)==dot || str.substring(lat+1,lat+2)==dot){
		    alert("Invalid E-mail ID")
		    return false
		 }

		 if (str.indexOf(dot,(lat+2))==-1){
		    alert("Invalid E-mail ID")
		    return false
		 }

		 if (str.indexOf(" ")!=-1){
		    alert("Invalid E-mail ID")
		    return false
		 }

 		 return true
	}



function validateForm(){
	 var fname=document.Registration.fname
     var lname=document.Registration.lname
     var sex=document.Registration.sex
	 var dob=document.Registration.dob
     var email=document.Registration.email
     var address=document.Registration.address
     var state=document.Registration.state
     var city=document.Registration.city
     var pin=document.Registration.pin
     var boardx=document.Registration.boardx
     var mobile=document.Registration.mobile
	 var phone=document.Registration.phone
     var yrp1=document.Registration.yrp1
     var marks1=document.Registration.marks1
     var yrp2=document.Registration.yrp2
     var boardxii=document.Registration.boardxii
     var degree=document.Registration.degree
     var branch=document.Registration.branch
     var me=document.Registration.me
     var marks2=document.Registration.marks2
     var college=document.Registration.college
     var university=document.Registration.university
     var yrp3=document.Registration.yrp3
     var marks3=document.Registration.marks3
     var sex=document.Registration.elements.myradio
	if((fname.value==null)||(fname.value=="")){
		alert("Please enter your first name")
		fname.focus()
		return false
	}

	if((lname.value==null)||(lname.value=="")){
		alert("Please enter your last name")
		lname.focus()
		return false
	}

	 if (!checkRadio("Registration","sex")){
       alert("Please select your sex");
       return false
        }

	if (isDate(dob.value)==false){
		alert("The date format should be : MM/DD/YYYY");
		dob.focus()
		return false
	}

	if((email.value==null)||(email.value=="")) {
		alert("Please enter your E-mail address")
		email.focus()
		return false
        }

 	if(echeck(email.value)==false){
		email.value=""
		email.focus()
		return false
     }

	if ((address.value==null)||(address.value=="")){
		alert("Please Enter your Address")
		address.focus()
		return false
	}

	if((city.value==null)||(city.value=="")) {
		alert("Please enter your City")
		city.focus()
		return false
		}

if(state.selectedIndex==0)
     {
      alert("Please select your State");
      state.focus();
      return false;
     }

	 
	if((pin.value==null)||(pin.value=="")) {
		alert("Please enter Pin code")
		pin.focus()
		return false
	}

	if (isInteger(pin.value)==false){
		alert("Please Enter a Valid Pin code")
		pin.value=""
		pin.focus()
		return false
	}

	 if (isInteger(phone.value)==false){
		alert("Please Enter a Valid Phone Number")
		phone.value=""
		phone.focus()
		return false
	}

	if((mobile.value==null)||(mobile.value=="")) {
		alert("Please enter your Mobile Number")
		mobile.focus()
		return false
	}
	if (checkInternationalPhone(mobile.value)==false){
		alert("Please Enter a Valid Mobile Number")
		mobile.value=""
		mobile.focus()
		return false
	}

//sups
  if((yrp1.value==null)||(yrp1.value=="")) {
		alert("Please enter year of passing of your X th standard")
	         yrp1.focus()
		return false
	}
        if(isInteger(yrp1.value)==false)
            {
               alert("Please enter year of passing of your X th standard correctly")
	         yrp1.focus()
		return false
	} 
 
if ((yrp1.value<1990)||(yrp1.value>2007))
{
alert("Please enter valid year of passing of your X th standard")
	         yrp1.focus()
		return false
		}
        if(boardx.selectedIndex==0)
     {
      alert("Please select X board");
      boardx.focus();
      return false;
     }
        if((marks1.value==null)||(marks1.value=="")) {
		alert("Please enter percentage of marks in X th standard")
	         marks1.focus()
		return false
	}
         if(isInteger(marks1.value)==false)
            {
               alert("Please enter valid marks ")
	         marks1.focus()
		return false
	} 
          
         if ((marks1.value<60||marks1.value>100))
            {
                alert("Please enter valid marks between 60 and 100")
                marks1.focus()
                return false
            }
              

         if((yrp2.value==null)||(yrp2.value=="")) {
		alert("Please enter year of passing of your XIIth standard")
	         yrp2.focus()
		return false
	}
        
        if(isInteger(yrp2.value)==false)
            {
               alert("Please enter integer value for XIIth standard ")
	      yrp2.focus()
		return false
	}
if ((yrp2.value<=yrp1.value))
    {
  alert("Please enter valid year of passing of your XIIth standard")
	         yrp2.focus()
		return false
		}
        
     if(boardxii.selectedIndex==0)
     {
      alert("Please select XII board");
      boardxii.focus();
      return false;
     }

         if((marks2.value==null)||(marks2.value=="")) {
		alert("Please enter percentage of marks in XII th standard")
	         marks2.focus()
		return false
         }
         
         if(isInteger(marks2.value)==false)
            {
               alert("Please enter  integer marks for XIIth standard ")
	         marks2.focus()
		return false
	}
          if ((marks2.value<60||marks2.value>100))
            {
                alert("Please enter valid marks between 60 and 100")
                marks2.focus()
                return false
            }
     if(degree.selectedIndex==0)
     {
      alert("Please select degree");
      degree.focus();
      return false;
     }
 if(branch.selectedIndex==0)
     {
      alert("Please select branch");
      branch.focus();
      return false;
     }
        if((college.value==null)||(college.value=="")) {
		alert("Please enter name of your college")
	         college.focus()
		return false
         }

        if((university.value==null)||(university.value=="")) {
		alert("Please enter name of your university")
	        university.focus()
		return false
         }

	if((yrp3.value==null)||(yrp3.value=="")) {
		alert("Please enter year of passing of Graduation")
	         yrp3.focus()
		return false
	}
        
         if(isInteger(yrp3.value)==false)
            {
               alert("Please enter integer value for year of passing of graduation ")
	         yrp3.focus()
		return false
	}
          
          if((yrp3.value<=yrp2.value)) {
		alert("Please enter valid year of passing")
	         yrp3.focus()
		return false
          }
          
  if(me.selectedIndex==0)
     {
      alert("Please select mode of education");
     me.focus();
      return false;
     }

 	if((marks3.value==null)||(marks3.value=="")) {
		alert("Please enter your overall percentage/CGPA")
	        marks3.focus()
		return false
        }
         if(isInteger(marks3.value)==false)
            {
               alert("Please enter integer ")
	         marks3.focus()
		return false
	}
        if(degree.value=="BTech"){
if ((marks3.value<6||marks3.value>10))
            {
                alert("wrong marks")
                marks3.focus()
                return false
            }


        }
        if(degree.value=="Bsc"){
          if ((marks3.value<60||marks3.value>100)){
                alert("wrong marks")
                marks3.focus()
                return false
          }
        }

	return true
}
</script>
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
    <h2 align="left">general information </h2>
    <p align="center">&nbsp;</p>
		<form action="Controller" method="post" name="Registration" id="form1" onSubmit="return validateForm()">
		  <table width="95%" height="198" border="0" align="center" cellpadding="8" bordercolor="#9EB874">
            <tr> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top">
              <td height="46" width="10%" align="center" valign="middle" class="LabelColor" style="text-align: right"><div align="left"><strong>First Name:</strong><span class="style1">*</span> </div></td>
              <td width="12%" valign="middle" class="TitleColor"><label for="first"></label>
                  <input type="text" id="fname" name="fname" />
              </td>
              <td width="30%" valign="middle" class="TitleColor"><strong>Middle Name</strong>
                <input type="text" id="mname" name="mname" /></td>
              <td width="30%" valign="middle" class="TitleColor"><label for="last"><strong>Last Name: </strong><span class="style1">*</span> </label>
                  <input type="text" id="lname" name="lname" />
              </td>
            </tr>
            <tr style="vertical-align: top"> </tr>
            <tr style="vertical-align: top">
              <td valign="middle" class="LabelColor" style="text-align: right"><div align="left"><strong>Sex</strong><span class="style1"><span class="style2">:</span> *</span></div></td>
              <td colspan="3" valign="middle"><p class="TitleColor">
                  <label for="male">Male </label>
                  <input type="radio" id="male" name="sex" value="Male" />
                  <label for="female">Female </label>
                  <input type="radio" id="female" name="sex" value="Female" />
              </p></td>
            </tr>
            <tr style="vertical-align: top">
              <td align="left" class="LabelColor" style="text-align: right"><div align="left"><strong>Date of Birth:</strong><span class="style1">*</span> </div></td>
              <td colspan="3"><!-- calendar attaches to existing form element -->
                  <input type="text" name="dob" />
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
        <input name="email" type="text" value="" size="30">
      </div></td>
    </tr>
    <tr>
      <td><div align="left"><strong>Address line: </strong><span class="style1">*</span> </div></td>
      <td>
        <div align="left">
          <textarea name="address" rows="4" cols="23"></textarea>
        </div></td>
    </tr>
	<tr>
		<td width="70"><div align="left"><strong>City:</strong> <span class="style1">*</span> </div></td>
		<td width="239"><div align="left">
		  <div align="left">
		    <input name="city" type="text" value="" size="30">

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
        <input name="pin" type="text" value="" size="30">
      </div></td>
    </tr>

	<tr>
      <td width="70" valign="top"><div align="left"><strong>Phone with Area Code: </strong></div></td>
      <td width="239" valign="bottom"><div align="left">
        <input name="phone" type="text" value="" size="30"><br>
        <span class="style4 style3"><em>Please don't use any special characters and white spaces</em></span>      </div></td>
    </tr>

	<tr>
      <td width="70" valign="top"><div align="left"><strong>Mobile: </strong><span class="style1">*</span> </div></td>
      <td width="239"><div align="left">
        <input name="mobile" type="text" value="" size="30"><br>
        <span class="style4 style3"><em>ex: 9876543210</em></span>      </div></td>
    </tr>
	 <!--<tr style="vertical-align: top" class="FooterColor">
     <td colspan="3">
	  	<input name="Previous" type="button" value="Previous" />
	  	<input type="reset" name="reset" value="Reset">
        <input type="submit" name="Submit" value="Next" />     </td>
    </tr>-->
  </table>
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
      <td width="550"><input name="yrp1" type="text" id="yrp1" value="" size="30" /></td>
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
		<td width="162" valign="top"><div align="left"><strong>Percentage:</strong> <span class="style1">*</span> </div></td>
		<td width="550"><div align="left">
		  <div align="left">
		    <p>
		      <input name="marks1" type="text" id="marks1" value="" size="30">
		      </p>
		    <p class="style4"><em>Please enter marks in rounded decimal </em></p>
		  </div>
		</div></td>
	</tr>
  </table>
		  <p>&nbsp;</p>
		  <table width="719" border="0" align="center">
            <tr>
              <td width="713" valign="top"><div align="left" class="style6"> Std XII Details</div></td>
            </tr>
          </table>
		  <table width="722" border="0" align="center">
            <tr>
              <td width="162" valign="middle"><div align="left"><strong>Year of passing:</strong> <span class="style1">*</span> </div></td>
              <td width="550"><input name="yrp2" type="text" id="yrp2" value="" size="30" /></td>
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
              <td width="162" valign="top"><div align="left"><strong>Percentage:</strong> <span class="style1">*</span> </div></td>
              <td width="550"><div align="left">
                  <div align="left">
                    <p>
                      <input name="marks2" type="text" id="marks2" value="" size="30" />
                    </p>
                    <p class="style4"><em>Please enter marks in rounded decimal </em> </p>
                  </div>
              </div></td>
            </tr>
          </table>
		  <p align="left">&nbsp; </p>
		  <p>&nbsp;</p>
          <h2 align="left">Graduation</h2>
		  <p align="left">&nbsp;</p>
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
		    <input name="college" type="text" id="college" value="" size="30">

              </div></div></td>
	</tr>
	<tr>
      <td width="162" valign="middle"><div align="left"><strong>University:</strong> <span class="style1">*</span> </div></td>
      <td width="550"><div align="left">
        <input name="university" type="text" id="university" value="" size="30" />
      </div></td>
    </tr>
	<tr>
      <td width="162" valign="middle"><div align="left"><strong>Year                                   of passing: </strong><span class="style1">*</span> </div></td>
      <td width="550"><div align="left">
        <input name="yrp3" type="text" id="yrp3" value="" size="30">
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
      <td width="162" valign="top"><div align="left"><strong>Overall                                   Percentage/CGPA: </strong><span class="style1">*</span> </div></td>
      <td width="550"><div align="left">
        <p>
          <input name="marks3" type="text" id="marks3" value="" size="30">
          </p>
        <p><span class="style4"><em>Please enter marks in rounded decimal </em></span><br>
          </p>
      </div></td>
    </tr>
  </table>

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
%>