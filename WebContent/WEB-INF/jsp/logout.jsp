<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/logout.css">
</head>
<body>
<h1>logout</h1>
<h2>ログアウトしますか？</h2>
<a href="/c6/LogoutServlet" onclick="return confirm('本当にログアウトしますか？');">ログアウト</a>
<script src= "logout.js"></script>
</body>
</html>