<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>collection</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/collection.css">

<style>
.hamburger {
    flex: 0 0 32px;
    align-self: center;
    margin-left: 16px;
    text-align: center;
    color: #fff;
    width : 10%;
}

</style>

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
<form method="post" action="/c6/CollectionServlet">
</form>
</main>
<script src= "collection.js"></script>
<%@ include file="/WEB-INF/jsp/common.jsp" %>

<script src= "./js/common.js"></script>

<script src= "./js/common.js"></script>

</body>
</html>