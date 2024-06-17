package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		dispatcher.forward(req, res);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// リクエストパラメータを取得する
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
/*
		// ログイン処理を行う
		UsersDAO uDAO = new UsersDAO();
		if (uDAO.isLoginOK(new Users(name, password))) {

		// セッションスコープにIDを格納する
		HttpSession session = req.getSession();
		session.setAttribute("name", new LoginUser(name));
*/
		// ログインに成功したら、スマホならマイページのuserサーブレットにリダイレクトする
		res.sendRedirect("/WEB-INF/jsp/user.jsp");
		}


}
