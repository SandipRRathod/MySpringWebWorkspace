<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="productForm" method="post">
Enter Product Name : <input type="text" name="pName"><br><br>
Enter Product Price : <input type="text" name="pPrice"><br><br>
Enter Product MFG Date : <input type="date" name="pMfg"  placeholder="MM/dd/yyyy"><br><br>
Enter Product Expiry Date : <input type="date" name="pExpiry" placeholder="MM/dd/yyyy"><br><br>
<button type="submit">Add Product</button>

</form>
</<%-- <p>${Desc}</p> --%>
</body>
</html>