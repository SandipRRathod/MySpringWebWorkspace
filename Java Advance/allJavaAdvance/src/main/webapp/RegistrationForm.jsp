<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
form {
	width: 250px;
	height: auto;
	background-color: green;
	position: relative;
	left: 40%;
	padding: 15px;
	color: white;
	border-radius: 15px;
}

input {
	width: 240px;
	outline: none;

	
}
.button {
	margin-left: 90px;
	margin-top: 20px;
	width: 70px;
	border: 1px solid black;
	border-radius: 5px;
}

.button:hover{
background-color: yellow;
	border: none;
}

.gender{
width: 30px;
}

select {
	outline: none;
}

h2 {
	margin-left: 41%;
	color: gray;
}

</style>
</head>
<body>

<h2>Simple Registration Page</h2>
	<form action="registrationForm" method="post">
		Name : <input type="text" name="User_Name"> <br><br>
		Email : <input type="text" name="User_Email"><br><br>
		 Password : <input	type="password" name="User_Password"> <br><br>
		 Gender : Male<input class="gender"	type="radio" value="male" name="User_gender">&nbsp;
		 Female<input class="gender" type="radio" value="Female" name="User_gender"> <br><br>
			City : <select name="User_City">
			<option>select</option>
			<option>Jalna</option>
			<option>sandip</option>
			<option>Ghar</option>
			<option>Pathrud</option>
		</select><br><br>
		<input type="submit" value="Submit" class="button">
	<br><br>	 <a href="Login.jsp">Click For login</a>
	</form>
</body>
</html>