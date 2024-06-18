<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String filename=(String)request.getAttribute("filename");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>トプ画</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/icon.css">
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
	<h1>
		<img src="/c6/img/icon.png" width="400" height="250"><br><br><br><br><br>
	</h1>
	<img src="/c6/upload/<%=filename%>"><br><br><br><br><br>
	<form method="post" action="/c6/IconServlet" enctype=multipart/form-data>
		<div>
			<label for="file">写真をアップロードしてください。</label><br><br>
			<input type="file" name="file"  size = "200">
		</div>
		<div>
			<input type = "submit" class = "submitbutton" value ="registration">
		</div>
	</form>
<script src= "./js/icon.js"></script>
</body>
</html>
