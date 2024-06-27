<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/logout.css">
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
	<img src="/c6/img/logout.png" width="400" height="250">
	<h2>ログアウトしますか？</h2>
	<form method="post" action="/c6/LogoutServlet">
		<input type = "submit" class = "submitbutton" value ="logout" onclick="return confirm('本当にログアウトしますか？');">
	</form>
<%@ include file="/WEB-INF/jsp/common.jsp" %>
<script src= "./js/logout.js"></script>
<script src= "./js/common.js"></script>
<script src="./js/jquery3.7.1.min.js"></script>
</body>
</html>