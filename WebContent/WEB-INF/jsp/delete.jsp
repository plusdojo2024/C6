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
<br><br><br><br><br><br><br><br><br><img src="/c6/img/deletion.png" width="650" height="250"><br><br><br><br><br><br><br><br><br>
<form method="post" action="/c6/DeleteServlet">
<input type = "submit" class = "submitbutton" value ="registration" onclick="return confirm('本当に削除しますか？');">
</form>
<script src= "delete.js"></script>
</body>
</html>