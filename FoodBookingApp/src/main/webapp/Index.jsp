<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "foodBilling" method="post">

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
<input type = "text" name = "address" placeholder = "enter the address">
</div>
<br>
<div>
<input type = "text" name = "foodName" placeholder = "enter the food">
</div>
<br>
<div>
<input type = "number" name = "quantity" placeholder = "enter the quantity">
</div>
<br>
<select  name = "location" >
  <option selected>select type</option>
  <option value="bengaluru">bengaluru</option>
  <option value="mysore">mysore</option>
  <option value="tumkur">tumkur</option>
</select>

<input type = "submit" class = "btn btn-primary">

</form>

</body>
</html>