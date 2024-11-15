<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

form {
	width: 200px;
height: auto;
background-color: green;
padding: 15px;
position: relative;
left: 40%;
border-radius:5px; 
}
input {
           width:189px;
	outline: none;
	
}

.button{
position: relative;
left: 54px;
width: 90px;
top: 10px;
}
</style>
</head>
<body>

<form action="login" method="post">
 Enter UserName : <input type="text" name="UserName">
 Enter Password: <input type="text" name="Password"> 
<input type="submit" value="Submit" class="button">
</form>


</body>
</html>