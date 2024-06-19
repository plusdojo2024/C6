<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フレンド一覧</title>
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
	<img src="/c6/img/friend.png" width="500" height="100">
	<a href = "/c6/FriendAddServlet"><img src="img/friendAddicon.png" width="70" height="70"></a>
	</div>

	<div><img src="/c6/img/mystatus.png" width="500" height="100"></div>

	<tr>
		<td>icon</td>
		<td>nickname</td>
		<td>飲みベ</td>
		<td>誕生日</td>
		<td>場所</td>
		<td>メモ</td>
	</tr>

	<tr>
		<td>${Users.icon }</td>
		<td>${Users.name }</td>
		<td>${Users. motivation}</td>
		<td>${Users.birthday }</td>
		<td>${Users. location}</td>
		<td>${USers.start }</td>
		<td>${Users.finish}</td>
		<td>${Users.remarks}</td>
	</tr>

	<h1>friend list</h1>
	<p>ニックネーム</p>
	<a>アイコン</a>
	<a>☆</a>
	<a>メモあり！</a>
	<input type="date" name="birthday" placeholder="誕生日">
	<a>open</a>

	<c:forEach var="Friends" items="${friendList}">

		<a>${Friends.icon}</a>
		<td>${Friends.favorite}</td>
		<td><input type="button" name="hidden">
		<td>${Friends.name }</td>
		<td>${Friends.motivation }</td>

	</c:forEach>
</body>
<%@ include file="/WEB-INF/jsp/common.jsp" %>
</html>