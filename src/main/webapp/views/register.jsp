<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>

<h1>Register Page</h1>

<form method="post" action="upload-demo-v2" enctype="multipart/form-data">
	<div>
		<input class="form-control mb-1" type="text" name="username" placeholder="Username...">
	</div>	
	<div>
		<input class="form-control mb-1" type="password" name="password" placeholder="Password...">
	</div>
	<div>
		<input class="form-control mb-1" type="text" name="email" placeholder="Email...">
	</div>
	<div>
		<input class="form-control mb-1" type="text" name="mobile" placeholder="Mobile...">
	</div>
	
	<div>
		<input class="form-control" type="file" name="myfile" placeholder="Upload Image...">
	</div>
	
	<div>
		<input class="btn btn-primary btn-block" type="submit" value="Register">
	</div>
</form>


</body>
</html>