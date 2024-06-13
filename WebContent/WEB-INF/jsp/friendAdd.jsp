<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フレンド追加</title>
<link rel="stylesheet" href="/c6/css/common.css">
</head>
<body>
	<h1>friend</h1>
	<form method="post" action="/c6/FriendAddServlet">
		<div>add friend</div>
		<div>nickname
			<input type = "text"  required >
		</div>
		<div>4number
			<input type = "text" required >
		</div>
		<div>
			<input type="submit" name="change" value="registration">
		</div>
	</form>
</body>
<%@ include file="/WEB-INF/jsp/common.jsp" %>
</html>