<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フレンド追加</title>
<link rel="stylesheet" href="/c6/css/common.css">
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
	<div><img src="img/friend.png" width="500px" height="100px" ></div>
	<form method="post" action="/c6/FriendAddServlet">
	<div><img src="img/addfriend.png" width="300px" height="100px" ></div>
		<div>nickname
			<input type = "text"  required name="name">
		</div>
		<div>4number
			<input type = "text" required name="number">
		</div>
		<div>
			<input type="submit" class="submitbutton" name="change" value="registration">
		</div>
	</form>
</body>
<%@ include file="/WEB-INF/jsp/common.jsp" %>
<script src= "./js/common.js"></script>
<script src="./js/jquery3.7.1.min.js"></script>
</html>