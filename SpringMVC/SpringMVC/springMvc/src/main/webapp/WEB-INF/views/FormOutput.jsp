<%@page import="springMvc.models.Student"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>By Using SpringMvc</p><hr>
<h1>Hello, ${student.user_name}</h1>
<h2>Your Email Is :${student.user_email} </h2>
<h2>Your Password Is :${student.user_pass} </h2>
</body>
</html>