<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/c6/css/common.css">
</head>
<body>

<!-- ここからハンバーガーリスト-->
<div id="wrapper">
    <header>
    <div class="container">
        <div class="title-block">

        </div>
        <div class="hamburger" id="open_nav">
            <img src="img/hamberger.png" alt="ハンバーガーの写真">
        </div>
    </div><!-- /.container -->
    </header>
</div>
<nav id="nav">
    <ul>
        <li><input type="image" value="my page" onclick="location.href='http://localhost:8080/c6/UserServlet'" src="/c6/img/set_mypage.png" width = "1200" height = "300"></li>
        <li><input type="image" value="icon" onclick="location.href='http://localhost:8080/c6/IconServlet'"src="/c6/img/set_icon.png" width = "1400" height = "300"></li>
        <li><input type="image" value="fourNumber" onclick="location.href='http://localhost:8080/c6/NumberServlet'"src="/c6//img/set_fournumber.png" width = "1200" height = "300"></li>
        <li><input type="image" value="sound" onclick="location.href='http://localhost:8080/c6/SoundServlet'"src="/c6/img/set_sound.png" width = "1400" height = "300"></li>
        <li><input type="image" value="favorite" onclick="location.href='http://localhost:8080/c6/HiddenServlet'"src="/c6/img/set_hiddenlist.png" width = "1100" height = "300"></li>
        <li><input type="image" value="accountdeletion" onclick="location.href='http://localhost:8080/c6/DeleteServlet'"src="/c6/img/set_accountdeletion.png" width = "1100" height = "300"></li>
		<li><input type="image" value="delete" onclick="location.href='http://localhost:8080/c6/DeleteServlet'"src="/c6/img/set_logout.png" width = "1400" height = "300"></li>

    </ul>
</nav>

<!-- ここまでハンバーガーリスト -->

<table class="footericon">
  <tr>
      	<td><li><a href = "/c6/UserServlet"><img src="img/myicon.png" alt="マイページ" width="300" height="400"></a></li></td>
      	<td><li><a href = "/c6/FriendServlet"><img src="img/friendicon.png" alt="フレンド" width="300" height="270"></a></li></td>
  		<td><li><a href = "/c6/GachaServlet"><img src="img/gachaicon.png" alt="ガチャ" width="300" height="270"></a></li></td>
  		<td><li><a href = "/c6/CollectionServlet"><img src="img/collectionicon.png" alt="コレクション" width="300" height="270"></a></li></td>
  </tr>
</table>
<script src="./js/jquery-3.7.1.min.js"></script>


</body>
</html>