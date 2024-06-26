<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>user</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/user.css">
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
	<h1><img src="img/mypagelogo.png"  width="800" height="200"></h1>
	<form method="post" action="/c6/UserServlet" >
		<h2><img src="img/status.png" width="1000" height="150"></h2>
		<p class="automatic">&lt;自動更新：　AM6:00&gt;</p>
		<p class="automatic">&lt;Status登録後、ガチャが引けます&gt;</p>
		<div class="radio-group">
        <p class="div-open active"></p>
		<input type="radio" id="motivation1" name="motivation" value="1" onchange="toggleLocation();" required>
		<label for="motivation1" class="label">open</label>
		<p class="nav-open active"></p>
        <input type="radio" id="motivation2" name="motivation" value="2" onchange="toggleFormSection()" required>
		<label for="motivation2" class="label">close</label>
        <p class="nav-open active"></p>
        <input type="radio" id="motivation3" name="motivation" value="3" onchange="toggleFormSection()" required>
		<label for="motivation3" class="label">now</label>
		<div class="div-open" onclick="changeDisplay()"></div>
        </div>
		<div id="formSection" class="hidden">
		<h2><img src="img/plase.png" width="500" height="150"></h2>
        <select id="formlocation" name="location" >
            <option value="">-- 選択してください --</option>
            <option value="北海道">北海道</option>
            <option value="青森県">青森県</option>
            <option value="岩手県">岩手県</option>
            <option value="宮城県">宮城県</option>
            <option value="秋田県">秋田県</option>
            <option value="山形県">山形県</option>
            <option value="福島県">福島県</option>
            <option value="茨城県">茨城県</option>
            <option value="栃木県">栃木県</option>
            <option value="群馬県">群馬県</option>
            <option value="埼玉県">埼玉県</option>
            <option value="千葉県">千葉県</option>
            <option value="東京都">東京都</option>
            <option value="神奈川県">神奈川県</option>
            <option value="新潟県">新潟県</option>
            <option value="富山県">富山県</option>
            <option value="石川県">石川県</option>
            <option value="福井県">福井県</option>
            <option value="山梨県">山梨県</option>
            <option value="長野県">長野県</option>
            <option value="岐阜県">岐阜県</option>
            <option value="静岡県">静岡県</option>
            <option value="愛知県">愛知県</option>
            <option value="三重県">三重県</option>
            <option value="滋賀県">滋賀県</option>
            <option value="京都府">京都府</option>
            <option value="大阪府">大阪府</option>
            <option value="兵庫県">兵庫県</option>
            <option value="奈良県">奈良県</option>
            <option value="和歌山県">和歌山県</option>
            <option value="鳥取県">鳥取県</option>
            <option value="島根県">島根県</option>
            <option value="岡山県">岡山県</option>
            <option value="広島県">広島県</option>
            <option value="山口県">山口県</option>
            <option value="徳島県">徳島県</option>
            <option value="香川県">香川県</option>
            <option value="愛媛県">愛媛県</option>
            <option value="高知県">高知県</option>
            <option value="福岡県">福岡県</option>
            <option value="佐賀県">佐賀県</option>
            <option value="長崎県">長崎県</option>
            <option value="熊本県">熊本県</option>
            <option value="大分県">大分県</option>
            <option value="宮崎県">宮崎県</option>
            <option value="鹿児島県">鹿児島県</option>
            <option value="沖縄県">沖縄県</option>
        </select>
        <input type = "reset" class = "submitbutton" value ="reset">

        <br>
        <br>
        <h2><img src="img/time.png" width="500" height="150"></h2>

        <input type="time" id="start" name="start" >
        ～
        <input type="time" id="finish" name="finish" >


        <input type = "reset" class = "submitbutton" value ="reset">

        <br>
        <br>

        <h2 class="h22"><img src="img/remarks.png" width="1000" height="200"></h2>
        <input type="text" id="remarks" name="remarks">

        <br>
        <br>
        </div>


		<br>
		<br>
        <input type = "submit" class = "submitbutton" value ="registration">
        <input type="submit" id="clock">
    </form>

</body>

<%@ include file="/WEB-INF/jsp/common.jsp" %>

<script src= "./js/user.js"></script>
<script src= "./js/common.js"></script>
<script src="./js/jquery3.7.1.min.js"></script>
</html>