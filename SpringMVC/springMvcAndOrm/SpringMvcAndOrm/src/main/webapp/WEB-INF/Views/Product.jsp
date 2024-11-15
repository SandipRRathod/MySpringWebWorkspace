
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table  {
	border: 2px solid black;
	padding: 10px;
}

</style>
</head>
<body>

	<table>
		<tr>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Product MFG</th>
			<th>Product Expiry</th>
		</tr>
		<tr>
			<td>${product.pName}</td>
			<td>${product.pPrice}</td>
			<td>${product.pMfg}</td>
			<td>${product.pExpiry}</td>
		</tr>
	</table>

</body>
</html>