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
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="description" content="#" />
<meta name="keywords" content="#" />
<meta name="author" content="#" />
<link rel="stylesheet" type="text/css" href="recruitment_css.css" media="screen" />
<link rel="stylesheet" type="text/css" href="print.css" media="print" />
<link rel="stylesheet" href="calendar.css">
<script language="JavaScript" src="calendar_us.js"></script>

<script language="JavaScript1.2">

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

var separator= "/";
var minYear=2011;
var maxYear=2050;
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
		alert("The date format should be : MM/DD/YYYY")
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

function compareDates (value1, value2) {
var closedate, int_date;
var month1, month2;
var year1, year2;

month1 = value1.substring (0, value1.indexOf ("/"));
closedate = value1.substring (value1.indexOf ("/")+1, value1.lastIndexOf ("/"));
year1 = value1.substring (value1.lastIndexOf ("/")+1, value1.length);

month2 = value2.substring (0, value2.indexOf ("/"));
int_date = value2.substring (value2.indexOf ("/")+1, value2.lastIndexOf ("/"));
year2 = value2.substring (value2.lastIndexOf ("/")+1, value2.length);

if (year1 > year2) return 1;
else if (year1 < year2) return -1;
else if (month1 > month2) return 1;
else if (month1 < month2) return -1;
else if (closedate > int_date) return 1;
else if (closedate < int_date) return -1;
else return 0;
}


function validateForm(){
closedate=document.createVacancy.closedate
int_date=document.createVacancy.int_date
vdetail=document.createVacancy.vdetail
nov=document.createVacancy.nov

//Get current date
var today = new Date();
var dd = today.getDate();
var mm = today.getMonth()+1;//January is 0!
var yyyy = today.getFullYear();
if(dd<10){dd='0'+dd}
if(mm<10){mm='0'+mm}
var curdate=mm+'/'+dd+'/'+yyyy


if((vdetail.value==null)||(vdetail.value=="")){
alert("please enter vacancy detail")
vdetail.focus()
return false
}
if((closedate.value==null)||(closedate.value=="")){
alert("please enter closing date")
closedate.focus()
return false
}
if (isDate(closedate.value)==false){
closedate.focus()
return false
}
if((compareDates(curdate,closedate.value)==1)||(compareDates(curdate,closedate.value)==0)){
alert("Closing Date must be greater than Today")
closedate.focus()
return false
}
if((int_date.value==null)||(int_date.value=="")){
alert("please enter interview date")
int_date.focus()
return false
}
if (isDate(int_date.value)==false){
int_date.focus()
return false
}
if((compareDates(closedate.value,int_date.value)==1)||(compareDates(closedate.value,int_date.value)==0)){
alert("Interview Date must be greater than Closing Date")
closedate.focus()
return false
}
if((nov.value==null)||(nov.value=="")){
alert("please enter Number of vacancy")
nov.focus()
return false
}
if (isInteger(nov.value)==false){
alert("Please Enter an integer value")
nov.value=""
nov.focus()
return false
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
      <li><a href="viewVacancyHR.jsp">View Vacancy</a></li>
      <li><a href="createVacancyInfo.jsp">Create vacancy</a></li>
      <li><a href="ScheduleInterview.jsp">Schedule</a></li>
      <li><a href="changePassword.jsp">Change password</a></li>
      <li><a href="logout.jsp">logout</a></li>
    </ul>
  </div>
  <div class="container clearfix">
    <form action="Controller" method="post" name="createVacancy" onSubmit="return validateForm()" id="createVacancy">
      <h2 align="left">Create Vacancy</h2>
  <p align="left">&nbsp;</p>
  <table width="722" border="0" align="center">

    <tr>
      <td><div align="left"><strong>Vacancy Detail : </strong><span class="style1">*</span> </div></td>
      <td>
        <div align="left">
          <textarea name="vdetail" cols="23" rows="4" id="vdetail"></textarea>
        </div></td>
    </tr>
	<tr>
	<td align="left" valign="top" class="LabelColor" style="text-align: right"><div align="left"><strong>Closing Date: </strong> <span class="style1">*</span> </div></td>
              <td colspan="2"><!-- calendar attaches to existing form element -->
                  <input name="closedate" type="text" id="closedate" size="25" />
                  <script language="JavaScript">
	new tcal ({
		// form name
		'formname': 'createVacancy',
		// input name
		'controlname': 'closedate'
	});

	        </script>
                  <br />
                  <span class="style4">mm/dd/yyyy</span> </td>
	    </tr>
	<tr>
	<td align="left" valign="top" class="LabelColor" style="text-align: right"><div align="left"><strong>Interview Date: </strong> <span class="style1">*</span> </div></td>
          <td colspan="2"><!-- calendar attaches to existing form element -->
              <input name="int_date" type="text" id="int_date" size="25" />
                  <script language="JavaScript">
	new tcal ({
		// form name
		'formname': 'createVacancy',
		// input name
		'controlname': 'int_date'
	});

	        </script>
                  <br />
                  <span class="style4">mm/dd/yyyy</span></td>
	</tr>
				  
	<tr>
		<td width="70"><div align="left"><strong>Number of Vacancy :</strong> <span class="style1">*</span> </div></td>
		<td width="239"><div align="left">
		  <div align="left">
		    <input name="nov" type="text" id="nov" value="" size="30">
		    
            </div></td>
	</tr>
	
	
	
	
	
	 <!--<tr style="vertical-align: top" class="FooterColor">
     <td colspan="3">
	  	<input name="Previous" type="button" value="Previous" />
	  	<input type="reset" name="reset" value="Reset">
        <input type="submit" name="Submit" value="Next" />     </td>
    </tr>-->
  </table>
          <br>
  		  
		  <div align="center">
                      <input type="hidden" name="req_type" value="3"/>
		    <input type="reset" name="reset" value="Reset">
            <input type="submit" name="Submit" value="Create" />
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
