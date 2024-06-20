<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>secret</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/newsecret.css">
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
	<div><img src="img/sercretquestion.png" width="400px" height="200px" ></div>
	<span class="label label-danger">${message}</span>
	<form  method="post" action="/c6/SecretServlet">
		nickname<br>
		<input type = "text"  name="name"><br>
		母親の旧姓は？<br>
		<input type = "text"  name="secret" required><br>
		<input type = "submit" class="submitbutton" value="registration" ><br>
		<a href = "/c6/LoginServlet">ログイン画面に戻る</a>
	</form>
	</main>
</body>
<script src= "secret.js"></script>
</html>