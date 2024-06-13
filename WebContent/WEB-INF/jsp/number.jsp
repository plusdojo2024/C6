<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>番号管理</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/number.css">
</head>

<body>
<h1>4ナンバー</h1>
<form method="post" action="/c6/NumberServlet">
<p>
現在の4number<br>
<input type="text" name="subject">
</p>

<p>
新しい4number<br>
<input type="text" name="subject">
</p>

<p class="submit">
	<input type="submit" value="registration">
</p>
</form>
</body>
</html>