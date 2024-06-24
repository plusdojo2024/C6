<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>newRegist</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/newRegist.css">
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
	<main>
		<div><img src="img/signup.png" width="300px" height="200px" ></div>
		  <% if (request.getAttribute("message") != null) { %>
        <span class="label label-danger"><%= request.getAttribute("message") %></span>
    <% } %>
		<form  method="post" action="/c6/NewRegistServlet" onsubmit="return checkBirth()">
			nickname<br>
			<input type = "text"  name="name"><br>
			password<br>
			<input type = "password"  id="password"><br>
			<input type = "password"  name="password" ><br>
			birthday<br>
			<select id="birthday" name="birthday" >
			<option value="">-- 選択してください --</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            </select><br>

			母親の旧姓は？<br>
			<input type = "text"   name="secret"  required><br>
			<input type = "submit" class="submitbutton" value="registration"><br>
			<a href = "/c6/LoginServlet">ログイン画面に戻る</a>
		</form>
	</main>
	<script src= "./js/newRegist.js"></script>
</body>
</html>