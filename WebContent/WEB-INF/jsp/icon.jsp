<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%String filename=(String)request.getAttribute("filename");%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
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
	<%
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/c6", "sa", "");

            Statement stmt = conn.createStatement();
            String sql = "SELECT icon FROM users";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String filePath = rs.getString("filepath");
    %>
                <p>画像のファイルパス: <%= filePath %></p>
    <%
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
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
