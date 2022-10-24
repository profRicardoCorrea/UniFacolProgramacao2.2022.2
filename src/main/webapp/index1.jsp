<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Actions Example</title>
</head>
<body>

<h1> Student Registration Page</h1>
 <form action="<%= request.getContextPath() %>/TimeAddServlet" method="get">
  Nome: <input type="text" name="nome">
  <br> <br> 
  
  Tecnico: <input type="text" name="tecnico">
  <br> <br> 
    
  
  <br> 
  <input type="submit" value="register">
 </form>
</body>
</html>