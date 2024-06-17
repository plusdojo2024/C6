package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsersDAO;
import model.Users;

@WebServlet("/SecretServlet")
public class SecretServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/secret.jsp");
    dispatcher.forward(req, res);
 }

protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	//リクエストパラメータを取得する
	req.setCharacterEncoding("UTF-8");
	String secret = req.getParameter("secret");

	// 処理を行う
	UsersDAO uDao = newUsersDAO();
	if (uDao.isLoginOK(new Users(secret))) {	// ログイン成功


	// 成功したら、パスワードサーブレットにリダイレクトする
    res.sendRedirect("/WEB-INF/jsp/password.jsp");
	}
}
}


