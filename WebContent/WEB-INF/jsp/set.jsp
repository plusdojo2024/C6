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
<div class = " buttonimage_css ">
	<input type="image" value="my page" onclick="location.href='http://localhost:8080/c6/UserServlet'" src="/c6/img/set_mypage.png" ><br>
	<input type="image" value="icon" onclick="location.href='http://localhost:8080/c6/IconServlet'"src="/c6/img/set_icon.png"><br>
	<input type="image" value="fourNumber" onclick="location.href='http://localhost:8080/c6/NumberServlet'"src="/c6//img/set_fournumber.png"><br>
	<input type="image" value="sound" onclick="location.href='http://localhost:8080/c6/SoundServlet'"src="/c6/img/set_sound.png"><br>
	<input type="image" value="favorite" onclick="location.href='http://localhost:8080/c6/HiddenServlet'"src="/c6/img/set_hiddenlist.png"><br>
	<input type="image" value="accountdeletion" onclick="location.href='http://localhost:8080/c6/DeleteServlet'"src="/c6/img/set_accountdeletion.png"><br>
	<input type="image" value="delete" onclick="location.href='http://localhost:8080/c6/DeleteServlet'"src="/c6/img/set_logout.png">
</main>
</body>
</html>