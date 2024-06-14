<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>サウンド</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/sound.css">
</head>
<body>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><img src="/c6/img/sound.png" width="400" height="250"><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<form method="post" action="/c6/SoundServlet">
		<input type="range" min="0" max="100" step="10"><br>
		<input type = "submit" class = "submitbutton" value ="registration">
	</form>
	<script src= "sound.js"></script>
</body>
</html>