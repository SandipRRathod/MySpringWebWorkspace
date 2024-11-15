<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First Java Server Page</title>
</head>
<body>

<% String name="Sandip Raju Rathod";
out.print(name);
%>
<h1>Hello This Is <%=name%></h1>
<%= "this is current time and Date "+LocalDateTime.now()%>
</body>
</html>