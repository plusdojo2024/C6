<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gacha</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/gacha.css">
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
<main>
<form id="gachaform" method="post" action="/c6/GachaServlet">
<div><img src ="/c6/img/gachatop.gif" class ="gachamain" id="main"></div>
<input type = "button"  id="gacha"  class = "submitbutton" value = "ガチャを引く" onClick="start();"><br>
<input type = "hidden" id="gachaRandom"  name="gachaRandom"><br>
<input type = "submit" id="gachaSubmit" style="display:none;"><!-- cssでhiddenにする -->
<div><img src ="/c6/img/gachaResult.png" class ="gachaAfter" id="after"></div>
</form>
</main>

<%@ include file="/WEB-INF/jsp/common.jsp" %>
<script src= "./js/gacha.js"></script>
<script src= "./js/common.js"></script>
<script src="./js/jquery3.7.1.min.js"></script>
</body>
</html>