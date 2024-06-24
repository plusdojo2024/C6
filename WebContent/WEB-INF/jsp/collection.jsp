<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>collection</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/collection.css">

</head>
<body>
	<ul class="circles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
<main>

<form action="/c6/CollectionsServlet" method="post" >
	<c:forEach var="Items" items="${cardList}">
		<img src="/c6/img/${Items.label}.png"><br>
		名前<br>
		${Items.name}<br>
		詳細<br>
		${Items.memo}<br>
	</c:forEach>
</form>

</main>
<%@ include file="/WEB-INF/jsp/common.jsp" %>
<script src= "./js/collection.js"></script>
<script src= "./js/common.js"></script>
<script src="./js/jquery3.7.1.min.js"></script>



</body>
</html>