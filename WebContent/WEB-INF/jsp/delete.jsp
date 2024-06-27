<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/delete.css">
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
	<div class="container">
	<img src="/c6/img/deletion.png" width="900" height="250">
	<form method="post" action="/c6/DeleteServlet">
		<input type = "submit" class = "submit" value ="deletion" onclick="return confirm('本当に削除しますか？');">
	</form>
	 </div>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<script src= "delete.js"></script>
<script src= "./js/common.js"></script>
<script src="./js/jquery-3.7.1.min.js"></script>
</body>

</html>