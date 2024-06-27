<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>非表示一覧</title>
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
		<div><img src="img/hiddenList.png"></div>
		<c:forEach var="hiddenList" items="${hiddenList}">
			<form method="post" action="/c6/HiddenServlet">
				<table>
					<tr>
						<td><input type= "image" src="${hiddenList.icon}" class="img_icon"></td>
						<td>${hiddenList.name}</td>
						<td><input type = "hidden"  name="name" value="${hiddenList.name}"></td>
						<td><input type = "submit"  class="submitbutton" name="submit" value="cansellation"></td>
						<td><input type = "submit" class="submitbutton" name="submit" value="delete"></td>
					</tr>
				</table>
			</form>
		</c:forEach>
	</main>
<script src= "./js/common.js"></script>
</body>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
</html>