<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/login.css">
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
	<div><img src="img/glass.png" class="spinningImage"></div>
    <form id="login_form" method="post" action="/c6/LoginServlet" onsubmit="return checkSubmit()">
        <main>
            <div>nickname</div>
            <!-- ニックネームの文字数を仮に20文字に制限 -->
            <input type="text" name="name" id="nickname" maxlength="20" required><br>
            <div>password</div>
            <input type="password" name="password" id="password" required><br>
            <input type="submit" class="submitbutton" value="login"><br>
            <br>
            <a href  ="/c6/NewRegistServlet">初めてご利用の方</a><br>
            <br>
            <a href="/c6/SecretServlet">パスワードをお忘れの方</a>
            <c:if test="${not empty message}">
                <p style="color: red;">${message}</p>
            </c:if>
        </main>
    </form>
	<script src= "./js/common.js"></script>
	<script src= "./js/login.js"></script>
</body>

</html>