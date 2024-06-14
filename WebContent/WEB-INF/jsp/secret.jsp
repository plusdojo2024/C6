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
	<main>
	<form  method="post" action="/c6/SecretServlet">
		<div><img src="img/sercretquestion.png" width="300px" height="80px" ></div>
		nickname<br>
		<input type = "text" ><br>
		母親の旧姓は？<br>
		<input type = "text"  required><br><br>
		<input type = "submit" class="submitbutton" value="registration" ><br><br>
		<a href = "/c6/LoginServlet">ログイン画面に戻る</a>
	</form>
	</main>
</body>
<script src= "secret.js"></script>
</html>