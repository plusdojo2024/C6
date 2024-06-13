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
	<main>
	<form  method="post" action="/c6/NewRegistServlet">
		nickname<br>
		<input type = "text" ><br>
		password<br>
		<input type = "password" ><br>
		<input type = "password" ><br>
		birthday<br>
		<input type = "text" ><br>
		secret question<br>
		母親の旧姓は？<br>
		<input type = "text" ><br>
		<input type = "submit" value="registration"><br>
		<a href = "/c6/LoginServlet">ログイン画面に戻る</a>
	</form>
	</main>
	<script src= "newRegist.js"></script>
</body>
</html>