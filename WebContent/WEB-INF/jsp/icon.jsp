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
<img src="/c6/img/icon.png">
</h1>
<img src="/c6/img/icon2.png">
<form method="post" action="/c6/IconServlet">
  <div>
    <label for="file">写真をアップロードしてください。</label>
    <input type="file" id="file" name="file" multiple />
  </div>
  <div>
    <button>登録</button>
  </div>
</form>
<script src= "icon.js"></script>
</body>
</html>