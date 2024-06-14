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
		<input type="range" class = "soundrange" id = "sound" list = "markers" min="0" max="100" step="10"><br>
		<input type = "submit" class = "submitbutton" value ="registration">
		<datalist id="markers">
  			<option value="0" label = "0"></option>
  			<option value="" label = "10"></option>
 			 <option value="" label = "20"></option>
 			 <option value="" label = "30"></option>
 			 <option value="" label = "40"></option>
 			 <option value="" label = "50"></option>
 			 <option value="" label = "60"></option>
 			 <option value="" label = "70"></option>
 			 <option value="" label = "80"></option>
 			 <option value="" label = "90"></option>
 			 <option value="100" label = "100"></option>
		</datalist>
	</form>
	<script src= "sound.js"></script>
</body>
</html>