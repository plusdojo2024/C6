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
<form method="post" action="/c6/GachaServlet">
</form>
<div ><img src ="/c6/img/gacha.gif" class ="gachamain" id="main"></div>
<input type = "button"  id="gacha"  class = "submitbutton" value = "ガチャを引く" onClick="start();">
</main>
<script src= "./js/gacha.js"></script>
<%@ include file="/WEB-INF/jsp/common.jsp" %>
</body>
</html>