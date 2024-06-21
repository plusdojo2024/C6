<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>I非表示一覧</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/hidden.css">
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
		<form method="post" action="/c6/HiddenServlet">
			<h1>hidden</h1>
		<table>
			<c:forEach var="hiddenList" items="${hiddenList}">
				<tr>
					<td>${hiddenList.icon}</td>
					<td>${hiddenList.name}</td>
					<td><input type = "hidden"  name="name" value="${hiddenList.name}"></td>
					<td><input type = "submit" name="submit" value="cansellation">cansellation></td>
					<td><input type = "submit" name="submit" value="delete">delete></td>
				</tr>
			</c:forEach>
		</table>
		</form>
	</main>
<script src= "./js/common.js"></script>
</body>
</html>