<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "generateBilling" method="post">

<div>
<input type = "text" name = "name" placeholder = "enter the name">
</div>
<br>
<div>
<input type = "email" name="emailId" placeholder = "enter email">
</div>
<br>
<div>
<input type = "tel" name = "number" placeholder = "enter the number">
</div>
<br>
<div>
<input type = "text" name = "productName" placeholder = "enter the productname">
</div>
<br>
<div>
<input type = "number" name = "quantity" placeholder = "enter the quantity">
</div>
<br>
<select  name = "productType" >
  <option selected>select type</option>
  <option value="grocery">grocery</option>
  <option value="cloth">cloth</option>
  <option value="others">others</option>
</select>

<input type = "submit" class = "btn btn-primary">

</form>



</body>
</html>