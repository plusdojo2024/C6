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
            <h1>ドロ</h1>
            <h2>ミング</h2>
        </div>
        <div class="hamburger" id="open_nav">
            <img src="img/hamberger.png" alt="ハンバーガーの写真">
        </div>
    </div><!-- /.container -->
    </header>
</div>
<nav id="nav">
    <div class="logo"><img src="logo.svg" alt=""></div>
    <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">今月の特集</a></li>
        <li><a href="#">ホテル検索</a></li>
        <li><a href="#">カフェ検索</a></li>
        <li><a href="#">お問い合わせ</a></li>
    </ul>
</nav>

<!-- ここまでハンバーガーリスト -->

<table class="footericon">
  <tr>
      	<td><li><a href = "/c6/UserServlet"><img src="img/myicon.png" alt="マイページ" width="100" height="90"></a></li></td>
      	<td><li><a href = "/c6/FriendServlet"><img src="img/friendicon.png" alt="フレンド" width="70" height="70"></a></li></td>
  		<td><li><a href = "/c6/GachaServlet"><img src="img/gachaicon.png" alt="ガチャ" width="70" height="70"></a></li></td>
  		<td><li><a href = "/c6/CollectionServlet"><img src="img/collectionicon.png" alt="コレクション" width="70" height="70"></a></li></td>
  </tr>
</table>
<script src="./js/jquery-3.7.1.min.js"></script>


</body>
</html>