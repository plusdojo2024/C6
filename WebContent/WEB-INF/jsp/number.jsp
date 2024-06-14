<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>番号管理</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/set.css">
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
	<div><img src="/c6/img/number.png" width="500" height="100"></div>
	<form name="numberForm" method="post" action="/c6/NumberServlet"  onsubmit="return validateForm()">
		<div>現在の4number</div>
		<div><input type="text" name="subject" required></div>
		<div>新しい4number</div>
		<div><input type="text" name="newsubject" required></div>
		<div class="submit">
			<input type="submit" value="registration">
		</div>
	</form>
<script src= "./js/number.js"></script>
</body>
</html>