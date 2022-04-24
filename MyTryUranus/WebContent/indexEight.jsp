<%@page import="model.Employee"%>
<%     



if (request.getParameter("m") != null) 
{ 
Employee empObj = new Employee(); 
String stsMsg = empObj.insertLeave(request.getParameter("m"), 
request.getParameter("n"), 
request.getParameter("o"), 
request.getParameter("p"),
request.getParameter("q"));

session.setAttribute("statusMsgFour", stsMsg); 
} 









if (request.getParameter("m") != null) 
{ 
 session.setAttribute("m", request.getParameter("m")); 
 session.setAttribute("n", request.getParameter("n")); 
 session.setAttribute("o", request.getParameter("o")); 
 session.setAttribute("p", request.getParameter("p")); 
 
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

<form action="http://localhost:8087/MyTryUranus/myService/Items/four" method="post">
 <h1>Leave Information</h1>
  <input type="text" id="abe" name="m" placeholder="Employee Email"><br>
  <input type="text" id="abl" name="n" placeholder="Leave Description"><br>
  <input type="text" id="abf" name="o" ><br>
  <input type="text" id="abt" name="p" ><br>
   <textarea type="text" id="abl" name="q" placeholder="Leave status"></textarea><br>
 
  <input type="submit" value="Submit">
</form> <br>

<%
 out.print(session.getAttribute("statusMsgFour")); 
%>



</body>
</html>