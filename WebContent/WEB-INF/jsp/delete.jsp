<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/delete.css">
</head>
<body>
<h1>account deletion</h1>
<form method="post" action="/c6/DeleteServlet">
<input type = "submit" value ="delete" onclick="return confirm('本当に削除しますか？');">
</form>
<script src= "delete.js"></script>
</body>
</html>