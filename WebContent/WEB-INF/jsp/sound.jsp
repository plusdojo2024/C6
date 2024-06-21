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
	<ul class="circles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><img src="/c6/img/sound.png" width="400" height="250">
	<form method="post" action="/c6/SoundServlet">
		<br><br><br><br><br><br><br><br><br><br><br><br><br>

		<input type = "button"  id="player" class="playvolume" value = "再生"><br>
		<input type="range" id="volume" min="0" max="100" step="10"><br>
		<input type = "submit" id="volume" class = "submitbutton" value ="registration">
	</form>
	<script src= "set.js"></script>
	<script src= "./js/common.js"></script>
</body>
</html>