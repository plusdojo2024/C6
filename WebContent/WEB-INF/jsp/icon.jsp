<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>トプ画</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/icon.css">
</head>
<body>
<h1>
<br><br><br><br><br><br><br><br><br><img src="/c6/img/icon.png" width="400" height="250"><br><br><br><br><br>
</h1>
<img src="/c6/img/icon2.png" width="250" height="200"><br><br><br><br><br>
<form method="post" action="/c6/IconServlet">
  <div>
    <label for="file">写真をアップロードしてください。</label><br><br>
    <input type="file"  size = "200" id="file" name="file" multiple />
  </div>
  <div>
    <input type = "submit" class = "submitbutton" value ="registration">
  </div>
</form>
<script src= "icon.js"></script>
</body>
</html>