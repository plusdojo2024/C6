<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>newRegist</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/newRegist.css">
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
		<div><img src="img/signup.png" width="300px" height="200px" ></div>
		<form  method="post" action="/c6/NewRegistServlet" onsubmit="return checkBirth()">
			nickname<br>
			<input type = "text"  name="name"><br>
			password<br>
			<input type = "password" ><br>
			<input type = "password"  name="password" ><br>
			birthday<br>
			<input type = "text" id="birthday"   name="birthday"><br>
			secret question<br>
			母親の旧姓は？<br>
			<input type = "text"   name="secret"><br>
			<input type = "submit" class="submitbutton" value="registration"><br>
			<a href = "/c6/LoginServlet">ログイン画面に戻る</a>
		</form>
	</main>
	<script src= "newRegist.js"></script>
</body>
</html>