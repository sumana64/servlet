<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "travelling" method="post">
  <div class="row mb-3">
    <label for="inputName3" class="col-sm-2 col-form-label">Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" placeholder="enter the name">
    </div>
  <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="inputEmail3">
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputPhoneNo3" class="col-sm-2 col-form-label">PhoneNo</label>
    <div class="col-sm-10">
      <input type="tel" class="form-control" id="inputPhoneNo3">
    </div>
      <div class="row mb-3">
    <label for="inputFrom3" class="col-sm-2 col-form-label">From</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputFrom3">
    </div>
      <div class="row mb-3">
    <label for="inputTo3" class="col-sm-2 col-form-label">To</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputTo3">
    </div>
  </div>
  <button type="submit" class="btn btn-primary">submit</button>
</form>

</body>
</html>