<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1 style="color:royalblue">FEEDS </h1>


<c:forEach var="item" items="${userList}">
	<div>${item.username} </div>
	<div>${item.profileImage}</div>
	<img alt="" src="${pageContext.request.contextPath}/${item.profileImage}">
</c:forEach>



</body>
</html>