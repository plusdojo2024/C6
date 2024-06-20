<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

<table>
	<tr>
		<td>icon</td>
		<td>nickname</td>
		<td>飲みベ</td>
		<td>誕生日</td>
		<td>場所</td>
		<td>メモ</td>
	</tr>
</table>


<table>

	<tr>
		<td>${bookList.icon} </td>
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
	<p>ニックネーム</p>
	<a>アイコン</a>
	<a>☆</a>
	<a>メモあり！</a>
	<input type="date" name="birthday" placeholder="誕生日">
	<a>open</a>

	<!-- <c:forEach var="Friends" items="${friendList}">

		<a>${Friends.icon}</a>
		<td>${Friends.favorite}</td>
		<td><input type="button" name="hidden">
		<td>${Friends.name }</td>
		<td>${Friends.motivation }</td>

	</c:forEach>-->
</body>
<%@ include file="/WEB-INF/jsp/common.jsp" %>
</html>