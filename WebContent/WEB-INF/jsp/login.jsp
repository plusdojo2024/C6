<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/login.css">
</head>
<body>
	<form id="login_form" method="post" action="/c6/LoginServlet" onsubmit="return checkSubmit()">
		<main>
			nickname<br>
			<input type = "text"  id="nickname"><br>
			password<br>
			<input type = "password" required><br>
			<input type = "submit" value="login" ><br>
			<a href = "/c6/NewRegistServlet">初めてご利用の方</a><br>
			<a href = "/c6/SecretServlet">パスワードをお忘れの方</a>
		</main>
	</form>
	<script src= "./js/common.js"></script>
	<script src= "./js/login.js"></script>
</body>

</html>