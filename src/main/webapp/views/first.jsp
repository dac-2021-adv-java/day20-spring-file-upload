<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:tomato">First JSP</h1>


<img alt="" src="http://localhost:8080/11.jpg">

<div>Another Image</div>

<img alt="" src="/11.jpg">

<div>
	Another Way
</div>
<img alt="" src="${pageContext.request.contextPath}/11.jpg">


<div>HBD</div>
<img src="http://localhost:8080/images/hbd.jpg" style="height:400px">

<div>Recommended Way</div>
<img src="${pageContext.request.contextPath}/images/hbd.jpg" style="height:300px" >

</body>
</html>