<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フレンド一覧</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/friend.css">
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

	<div>
		<img src="/c6/img/friend.png" width="500" height="100"> <a
			href="/c6/FriendAddServlet"><img src="img/friendAddicon.png"
			width="70" height="70"></a>
	</div>

	<div>
		<img src="/c6/img/mystatus.png" width="500" height="100">
	</div>




	<table >

		<tr>
			<td>${bookList.icon}</td>
			<td>${bookList.name}</td>
			<td>${bookList.motivation}</td>
			<td>${bookList.birthday}</td>
			<td>${bookList.location}</td>
			<td>${bookList.start}</td>
			<td>時</td>
			<td>～</td>
			<td>${bookList.finish}</td>
			<td>時</td>
			<td>${bookList.remarks}</td>
		</tr>

	</table>

	<h1>friend list</h1>

	<table>
		<c:forEach var="Friends" items="${cardList}">

			<tr><th>icon</th><td>${Friends.icon}</td></tr>
			<tr>
				<th>favorite</th>
					<td><input type="checkbox" class="favorite" ></td>
			</tr>
			<tr><th>hidden</th><td><input type="image" src="/c6/img/hidden.png"width = "40" height = "30"></tr>
			<tr><th>nick name</th><td>${Friends.name }</td></tr>
			<tr><th>飲みベ</th><td>${Friends.motivation }</td></tr>
			<tr><th>時間</th><td>${Friends.start}</td><td>～</td><td>${Friends.finish}</td></tr>
			<tr><th>誕生日</th><td>${Friends.birthday}</td></tr>
		</c:forEach>
	</table>
</body>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
</html>