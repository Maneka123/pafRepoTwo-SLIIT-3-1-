



<%@page import="model.Employee"%>
<% 
if (request.getParameter("r") != null) 
{ 
Employee empObj = new Employee(); 
String stsMsg = empObj.insertTimesheet(request.getParameter("r"), 
request.getParameter("s"), 
request.getParameter("t"), 
request.getParameter("u"),
request.getParameter("v"));

session.setAttribute("statusMsgFive", stsMsg); 
} %>

<%     
if (request.getParameter("i") != null) 
{ 
 session.setAttribute("r", request.getParameter("r")); 
 session.setAttribute("s", request.getParameter("s")); 
 session.setAttribute("t", request.getParameter("t")); 
 session.setAttribute("u", request.getParameter("u")); 
 session.setAttribute("v", request.getParameter("v")); 
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


<form action="http://localhost:8087/MyTryUranus/myService/Items/five" method="post">
 <h1>TimeSheet Information</h1>
  <input type="text" id="ta" name="r" placeholder="Employee Email"><br>
  <input type="text" id="tb" name="s" placeholder="work title"><br>
  <textarea type="text" id="tc" name="t" placeholder="work description"></textarea><br>
  <input type="text" id="td" name="u" placeholder="total working hours"><br>
  <input type="text" id="td" name="v" ><br>
 
  <input type="submit" value="Submit">
</form> <br>

<%
 out.print(session.getAttribute("statusMsgFive")); 
%>
</body>
</html>