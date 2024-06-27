<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>番号管理</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/set.css">
<link rel="stylesheet" href="/c6/css/number.css">
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
	<div><img src="img/number.png" width="500px" height="100px" ></div>
	<form name="numberForm" method="post" action="/c6/NumberServlet"  onsubmit="return validateForm()">
		<div>現在の4number</div>
		<div><input type="text" name="subject" required value="${number}"></div>
		<div>新しい4number</div>
		<div><input type="text" name="newsubject" required></div>

			<input type="submit" class="submitbutton" value="registration">

	</form>
<%@ include file="/WEB-INF/jsp/common.jsp" %>
<script src= "./js/number.js"></script>
<script src= "./js/common.js"></script>
<script src="./js/jquery-3.7.1.min.js"></script>
</body>
</html>