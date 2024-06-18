<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/hidden.css">
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
		<form method="post" action="/c6/HiddenServlet">
			<h1>hidden</h1>
			<span>
				<img src="画像のURL" alt="管理">
				<a>ニックネーム</a>
				<button type="submit">cansellation</button>
				<button type="submit">delete</button>
			</span>
		</form>
	</main>
</body>
</html>