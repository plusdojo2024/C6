<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" href="/C6/css/common.css">
<link rel="stylesheet" href="/C6/css/login.css">
</head>
<body>
  <form id="login_form" method="post" action="/c6/LoginServlet">
<main>
nickname<br>
	<input type = "text" ><br>
password<br>
	<input type = "password" ><br>
	<input type = "submit" value="login"><br>
<a href = "/C6/newRegist.jsp">初めてご利用の方</a><br>
<a href = "/C6/secret.jsp">パスワードをお忘れの方</a>
</main>
<script src= "login.js"></script>
</form>
</body>
</html>