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
	<h1>sound</h1>
	<form method="post" action="/c6/SoundServlet">
		<input type="range" min="0" max="100" step="10">
		<button>登録</button>
	</form>
	<script src= "sound.js"></script>
</body>
</html>