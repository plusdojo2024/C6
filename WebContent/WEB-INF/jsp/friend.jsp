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
	<table>
		<tr>
			<td><input type= "image" src="${bookList.icon}" class="img_icon"></td>
			<td>${bookList.name}</td>
			<td>
			<c:choose>
					<c:when test="${bookList.motivation==0}">
						<div><input type="image" src="/c6/img/ComingSoon.png" class="outline img_coming"></div>
					</c:when>
					<c:when test="${bookList.motivation==1}">
						<div><input type="image" src="/c6/img/open.png" class="outline img_motivation"></div>
					</c:when>
					<c:when test="${bookList.motivation==2}">
						<div><input type="image" src="/c6/img/close.png" class="outline img_motivation"></div>
					</c:when>
					<c:otherwise>
						<div><input type="image" src="/c6/img/now.png" class="outline img_motivation"></div>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr>
			<td>${bookList.birthday}月生まれ</td>
			<td>${bookList.location}</td>
			<td>${bookList.start}</td>
			<td></td>
			<td>～</td>
			<td>${bookList.finish}</td>
			<td></td>
			<td>${bookList.remarks}</td>
		</tr>
	</table>
	<div>
		<img src="/c6/img/friendList.png" width="500" height="100">
	</div>
		<c:forEach var="Friends" items="${cardList}">
			<form action="/c6/FriendServlet" method="post">
				<table>
					<tr>
						<td><input type= "image" src="${Friends.icon}" class="img_icon"></td>
						<td><input type="checkbox" class="favorite outline" id="friends" name="favorite"></td>
						<td><input type="image" src="/c6/img/hidden.png" class="outline" width="40"  height="30">
						<td>${Friends.name }</td>
						<td><input type="hidden" name="friendName" src="${Friends.name}"></td>
						<td>
						<c:choose>
								<c:when test="${Friends.motivation==0}">
									<div><input type="image" src="/c6/img/ComingSoon.png" class="outline img_motivation"></div>
								</c:when>
								<c:when test="${Friends.motivation==1}">
									<div><input type="image" src="/c6/img/open.png" class="outline img_motivation" ></div>
								</c:when>
								<c:when test="${Friends.motivation==2}">
									<div><input type="image" src="/c6/img/close.png" class="outline img_motivation" ></div>
								</c:when>
								<c:otherwise>
									<div><input type="image" src="/c6/img/now.png" class="outline img_motivation"></div>
								</c:otherwise>
							</c:choose>
						</td>
						<td rowspan="2">
							<input type="submit" value="Update" name="Update" class="submitbutton">
						</td>
					</tr>
					<tr>
						<td colspan="2">${Friends.birthday}月生まれ</td>
						<td>${Friends.start}</td>
						<td>～</td>
						<td>${Friends.finish}</td>
					</tr>
				</table>
				<br>
			</form>
		</c:forEach>
</body>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<script src="./js/common.js"></script>
<script src="./js/jquery3.7.1.min.js"></script>
</html>