<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user</title>
<link rel="stylesheet" href="/c6/css/common.css">
<link rel="stylesheet" href="/c6/css/user.css">
</head>
<body>
<h1>mypage</h1>
<form method="post" action="/c6/UserServlet">
  <h2>status</h2>
  <p>&lt;自動更新：　AM6:00&gt;</p>
<div>
  <ul>
    <li>open</li>
    <li>close</li>
    <li>now</li>
  </ul>
</div>
<h2>place</h2>
        <select id="prefecture" name="prefecture" >
            <option value="">-- 選択してください --</option>
            <option value="hokkaido">北海道</option>
            <option value="aomori">青森県</option>
            <option value="iwate">岩手県</option>
            <option value="miyagi">宮城県</option>
            <option value="akita">秋田県</option>
            <option value="yamagata">山形県</option>
            <option value="fukushima">福島県</option>
            <option value="ibaraki">茨城県</option>
            <option value="tochigi">栃木県</option>
            <option value="gunma">群馬県</option>
            <option value="saitama">埼玉県</option>
            <option value="chiba">千葉県</option>
            <option value="tokyo">東京都</option>
            <option value="kanagawa">神奈川県</option>
            <option value="niigata">新潟県</option>
            <option value="toyama">富山県</option>
            <option value="ishikawa">石川県</option>
            <option value="fukui">福井県</option>
            <option value="yamanashi">山梨県</option>
            <option value="nagano">長野県</option>
            <option value="gifu">岐阜県</option>
            <option value="shizuoka">静岡県</option>
            <option value="aichi">愛知県</option>
            <option value="mie">三重県</option>
            <option value="shiga">滋賀県</option>
            <option value="kyoto">京都府</option>
            <option value="osaka">大阪府</option>
            <option value="hyogo">兵庫県</option>
            <option value="nara">奈良県</option>
            <option value="wakayama">和歌山県</option>
            <option value="tottori">鳥取県</option>
            <option value="shimane">島根県</option>
            <option value="okayama">岡山県</option>
            <option value="hiroshima">広島県</option>
            <option value="yamaguchi">山口県</option>
            <option value="tokushima">徳島県</option>
            <option value="kagawa">香川県</option>
            <option value="ehime">愛媛県</option>
            <option value="kochi">高知県</option>
            <option value="fukuoka">福岡県</option>
            <option value="saga">佐賀県</option>
            <option value="nagasaki">長崎県</option>
            <option value="kumamoto">熊本県</option>
            <option value="oita">大分県</option>
            <option value="miyazaki">宮崎県</option>
            <option value="kagoshima">鹿児島県</option>
            <option value="okinawa">沖縄県</option>
        </select>
                <button type="reset">リセット</button>
                <br>
                <br>
        <h2>time</h2>

        <!--  input type="time" id="start-time" name="start-time" min="00:00" max="23:59" required>-->
        <input type="time" required>
        ～
        <!-- input type="time" id="end-time" name="end-time" min="00:00" max="23:59" required-->
        <input type="time" required>
        <button type="reset">リセット</button>
        <br>
        <br>
        <h2>remarks</h2>
            <label for="remarks">備考:</label>
            <input type="text" id="remarks" name="remarks">
            <br>
            <br>
              <button type="submit">registration</button>
    </form>
</body>
</html>