<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>パスワード変更</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/password.css">
</head>
<body>
	<div><img src="img/newpassword.png" width="500px" height="100px" ></div>
	<form method="post" action="/c6/PasswordServlet">
		<div>
			<input type="text" name="passwordUp" >
		</div>
		<div>
			<input type="text" name="passwordDown" >
		</div>
		<div>
			<input type="submit" class="submitbutton" name="change" value="registration">
		</div>
	</form>
	<div>
		<a href="/c6/LoginServlet"  >ログイン画面に戻る</a>
	</div>
		<div>

		</div>
</body>
</html>