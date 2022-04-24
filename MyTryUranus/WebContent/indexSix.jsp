
<%@page import="model.Employee"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
if (request.getParameter("firstname") != null) 
{ 
Employee empObj = new Employee(); 
String stsMsg = empObj.insertItemOne(request.getParameter("firstname"), 
request.getParameter("lastname"), 
request.getParameter("date"), 
request.getParameter("gender"),
request.getParameter("fatherName"),
request.getParameter("motherName"),
request.getParameter("designation"),
request.getParameter("department") ); 
session.setAttribute("statusMsg", stsMsg); 
} 


if (request.getParameter("a") != null) 
{ 
Employee empObj = new Employee(); 
String stsMsg = empObj.insertEmpTwo(request.getParameter("a"), 
request.getParameter("b"), 
request.getParameter("c"), 
request.getParameter("d"),
request.getParameter("e"),
request.getParameter("f"),
request.getParameter("g"),
request.getParameter("h") ); 
session.setAttribute("statusMsgTwo", stsMsg); 
} 




%>


<%     
if (request.getParameter("firstname") != null) 	
{ 
	
	
	 Employee empObj = new Employee(); 
	 empObj.connect();//For testing the connect method
	
	
 session.setAttribute("firstname", request.getParameter("firstname")); 
 session.setAttribute("lastname", request.getParameter("lastname")); 
 session.setAttribute("date", request.getParameter("date")); 
 session.setAttribute("gender", request.getParameter("gender")); 
 session.setAttribute("fatherName", request.getParameter("fatherName")); 
 session.setAttribute("motherName", request.getParameter("motherName")); 
 session.setAttribute("designation", request.getParameter("designation")); 
 session.setAttribute("department", request.getParameter("department")); 
} 
    
    if (request.getParameter("a") != null) 
    { 
     session.setAttribute("a", request.getParameter("a")); 
     session.setAttribute("b", request.getParameter("b")); 
     session.setAttribute("c", request.getParameter("c")); 
     session.setAttribute("d", request.getParameter("d")); 
     session.setAttribute("e", request.getParameter("ee")); 
     session.setAttribute("f", request.getParameter("f")); 
     session.setAttribute("g", request.getParameter("g")); 
     session.setAttribute("h", request.getParameter("ht")); 
    }%>
 





<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="http://localhost:8087/MyTryUranus/myService/Items/one" method="post" >
 <h1>Official Information</h1>
  <input type="text" id="fname" name="firstname" placeholder="Your first name.."><br>
  <input type="text" id="lname" name="lastname" placeholder="Your last name.."><br>
  <input type="text" id="myDate" name="date" ><br>
  <input type="text" id="myGender" name="gender" placeholder="Your gender"><br>
  <input type="text" id="myFather" name="fatherName" placeholder="Your father's name.."><br>
  <input type="text" id="myMother" name="motherName" placeholder="Your mother's name.."><br>
  <input type="text" id="myDesignation" name="designation" placeholder="Your designation"><br>
  <input type="text" id="myDept" name="department" placeholder="Your department name.."><br>
 
  <input type="submit" value="Submit">
</form> <br>

<%
 out.print(session.getAttribute("statusMsg")); 
%>
<form action="http://localhost:8087/MyTryUranus/myService/Items/two" method="post" >
 <h1>Contact Information</h1>
  <input type="text" id="cAddr" name="a" placeholder="Your current address"><br>
  <input type="text" id="pAddr" name="b" placeholder="Your permanent address.."><br>
  <input type="email" id="eEmail" name="c" placeholder="tour email..."><br>
  <input type="text" id="myContact" name="d" placeholder="Your contact"><br>
  <input type="text" id="myEdu" name="e" placeholder="Your highest education.."><br>
  <input type="text" id="myLang" name="f" placeholder="Language you know.."><br>
  <input type="text" id="myPrimary" name="g" placeholder="Primary skills "><br>
  <input type="text" id="mySecondary" name="h" placeholder="Your secondary skills"><br>
 
  <input type="submit" value="Submit">
</form> <br>

<%
 out.print(session.getAttribute("statusMsgTwo")); 
%>


</body>
</html>