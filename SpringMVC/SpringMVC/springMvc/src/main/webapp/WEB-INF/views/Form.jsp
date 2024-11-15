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
<form action="registrationForm" method="post">
 Enter Name : <input type="text" name="User_name"><br><br>
Enter Email : <input type="text" name="User_email"><br><br>
Enter Password : <input type="text" name="User_pass"><br><br> 
<!-- Enter Dob : <input type="file" name="date"> -->
<p>${Desc}</p>
<button type="submit">Submit</button>
</form>
</body>
</html>