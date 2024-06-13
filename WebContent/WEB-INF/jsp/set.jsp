<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>set</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/set.css">
</head>
<body>
<main>
<form method="post" action="/c6/SetServlet">
	<input type="button" value="my page" onclick="location.href='/c6/user.jsp'"><br>
	<input type="button" value="icon" onclick="location.href='/c6/icon.jsp'"><br>
	<input type="button" value="fourNumber" onclick="location.href='/c6/number.jsp'"><br>
	<input type="button" value="sound" onclick="location.href='/c6/sound.jsp'"><br>
	<input type="button" value="favorite" onclick="location.href='/c6/favorite.jsp'"><br>
	<input type="button" value="hidden" onclick="location.href='/c6/hidden.jsp'"><br>
	<input type="button" value="delete" onclick="location.href='/c6/delete.jsp'">
</form>
</main>
</body>
</html>