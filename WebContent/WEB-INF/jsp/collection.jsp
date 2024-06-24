<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>collection</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/collection.css">

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

<!-- ここからコレクション一覧を表示する -->

	<c:forEach var="Items" items="${cardList}">
		<input type= "image" class="label" name="open" src="/c6/img/${Items.label}.png">
			<!-- ここからラベルがクリックされたら詳細を表示する -->
			<div class = "close">
				<div class="${Items.label}">
					<div class = "labelHidden"><img src="/c6/img/${Items.label}.png"></div><br>
					<div class = "name">名前</div><br>
					<div class = "itemsName">${Items.name}</div><br>
					<div class = "memo">詳細</div><br>
					<div class = "itemsMemo">${Items.memo}</div><br>
					<input type= "submit" class="closebt" name="close" value="閉じるボタン">
				</div><!-- ${Items.label} -->
			</div><!-- close -->
			<!-- ここまでラベルがクリックされたら詳細を表示する -->
	</c:forEach>

<!-- ここまでコレクション一覧を表示する -->

</main>
<%@ include file="/WEB-INF/jsp/common.jsp" %>
<script src= "./js/collection.js"></script>
<script src= "./js/common.js"></script>
<script src="./js/jquery3.7.1.min.js"></script>



</body>
</html>