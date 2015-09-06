function common()
{
if((fname.value==null)||(fname.value=="")){
		alert("Please enter your first name")
		name.focus()
		return false
	}
      else  if((lname.value==null)||(lname.value=="")){
		alert("Please enter your last name")
		name.focus()
		return false
	}
        else if((email.value==null)||(email.value=="")) {
		alert("Please enter your E-mail address")
		email.focus()
		return false
        }

else if (echeck(email.value)==false){
		email.value=""
		email.focus()
		return false
	}


	else if((address.value==null)||(address.value=="")) {
		alert("Please enter your address")
		address.focus()
		return false
	}
        else if((city.value==null)||(city.value=="")) {
		alert("Please enter your City")
		city.focus()
		return false
	}
        else if((pin.value==null)||(pin.value=="")) {
		alert("Please enter pincode")
		pin.focus()
		return false
	}
        else if((mobile.value==null)||(mobile.value=="")) {
		alert("Please enter mobile number")
	         mobile.focus()
		return false
	}
         else if((yrp1.value==null)||(yrp1.value=="")) {
		alert("Please enter year of passing of your X th standard")
	         yrp1.focus()
		return false
	}
        else if((marks1.value==null)||(marks1.value=="")) {
		alert("Please percentage of marks in X th standard")
	         marks1.focus()
		return false
	}
         else if((yrp2.value==null)||(yrp2.value=="")) {
		alert("Please enter year of passing of your XII th standard")
	         yrp2.focus()
		return false
	}
          
         else if((marks2.value==null)||(marks2.value=="")) {
		alert("Please percentage of marks in XII th standard")
	         marks2.focus()
		return false
         }
        else if((college.value==null)||(college.value=="")) {
		alert("Please enter name of your college")
	         college.focus()
		return false
         }

        else if((university.value==null)||(university.value=="")) {
		alert("Please enter name of your university")
	        university.focus()
		return false
         }

else if((yrp3.value==null)||(yrp3.value=="")) {
		alert("Please enter year of passing of your graduation")
	         yrp3.focus()
		return false
         }

 else if((marks3.value==null)||(marks3.value=="")) {
		alert("Please enter your overall percentage/CGPA")
	        marks3.focus()
		return false
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

function phonecheck(s)
	{   var i;
          if(s.length!=10)
          {
           return fase

           } 
   
    	for (i = 0; i < s.length; i++)
    	{
        	var c = s.charAt(i);
        	if (((c < "0") || (c > "9"))) return false;
    	}
    	return true;
	}

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
}

function pincheck(s)
{
           var i;
          if(s.length!=6)
          {
           return false;

           } 
   
    	for (i = 0; i < s.length; i++)
    	{
        	var c = s.charAt(i);
        	if (((c < "0") || (c > "9"))) return false;
    	}
    	return true;

}

function marksvaild(marks)
{
 int i;
for (i = 0; i < s.length; i++)
    	{
        	var c = marks.charAt(i);
        	if (((c < "0") || (c > "9"))
                 alert("invalid marks")
    	}
    	

if((marks.value)<0||(marks.value)>100)
{
alert("invalid marks")

return false;
}
}


}