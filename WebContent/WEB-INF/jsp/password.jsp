<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>パスワード変更</title>
<<<<<<< Updated upstream
<link rel="stylesheet" href="/c6/css/common.css">
</head>
<body>
	<h1>new password</h1>
	<form  method="post" action="/c6/PasswordServlet">
=======
<link rel="stylesheet" href="/C6/css/common.css">
</head>
<body>
	<h1>new password</h1>
>>>>>>> Stashed changes
		<div>password</div>
		<div>
			<input type="text" name="passwordUp" >
		</div>
		<div>
			<input type="text" name="passwordDown" >
		</div>
		<div>
<<<<<<< Updated upstream
			<input type="submit" name="change" value="registration">
		</div>
	</form>
	<div>
		<a href="/c6/LoginServlet"  >ログイン画面に戻る</a>
	</div>
=======
			<input type="button" name="change" value="registration">
		</div>
		<div>
			<a href="/C6/LoginServlet"  >ログイン画面に戻る</a>
		</div>
>>>>>>> Stashed changes
</body>
</html>