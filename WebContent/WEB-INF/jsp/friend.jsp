<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フレンド一覧</title>
</head>
<body>
	<h1>friend list</h1>
	<input type="button" value="friend add" onclick="location.href='http://localhost:8080/c6/FriendAddServlet'">

	<p>my stats</p>
	ニックネーム<br>
	<p><input type="text" name="subject" placeholder="ニックネーム"></p>
	誕生日<br>
	<p><input type="date" name="birthday" placeholder="誕生日"></p>
	場所<br>
	<p>東京</p>
	時間帯<br>

	メモ<br>
	<input type="text" name="subject" placeholder="メモ">

	<h1>friend list</h1>
	<p>ニックネーム</p>
	<a>アイコン</a>
	<a>☆</a>
	<a>メモあり！</a>
	<input type="date" name="birthday" placeholder="誕生日">
	<a>open</a>
</body>
</html>