

<%@page import="model.Employee"%>
<% if (request.getParameter("i") != null) 
{ 
Employee empObj = new Employee(); 
String stsMsg = empObj.insertSalary(request.getParameter("i"), 
request.getParameter("j"), 
request.getParameter("k"), 
request.getParameter("l"));

session.setAttribute("statusMsgThree", stsMsg); 
} %>





<%     
if (request.getParameter("i") != null) 
{ 
 session.setAttribute("i", request.getParameter("i")); 
 session.setAttribute("j", request.getParameter("j")); 
 session.setAttribute("k", request.getParameter("k")); 
 session.setAttribute("l", request.getParameter("l")); 
 
} 
    
   
 %>






<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="http://localhost:8087/MyTryUranus/myService/Items/three" method="post">
 <h1>Salary Information</h1>
  <input type="text" id="myEmail" name="i" placeholder="Your email.."><br>
  <input type="text" id="myMonth" name="j" placeholder="Your month.."><br>
  <input type="text" id="myYear" name="k" ><br>
  <input type="text" id="myAmount" name="l" placeholder="Your amount"><br>
  
 
  <input type="submit" value="Submit">
</form> <br>

<%
 out.print(session.getAttribute("statusMsgThree")); 
%>
</body>
</html>