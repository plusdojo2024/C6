package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsersDAO;
import model.Users;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		dispatcher.forward(req, res);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			// リクエストパラメータを取得する
			req.setCharacterEncoding("UTF-8");
			String name = req.getParameter("name");
			String password = req.getParameter("password");

			// ログイン処理を行う
			UsersDAO uDAO = new UsersDAO();
			Users u = new Users();
			u.setName(name);
			u.setPassword(password);

			if (uDAO.isLoginOK(u)) {
				// セッションオブジェクトを生成し、データを格納
				HttpSession session = req.getSession();
				session.setAttribute("name", name);

				// ログインに成功したら、マイページにフォワードする
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/user.jsp");
				dispatcher.forward(req, res);
			} else {
				// 失敗したらログインページに戻す
				req.setAttribute("message", "IDまたはパスワードが違います");
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
				dispatcher.forward(req, res);
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("message", "内部エラーが発生しました。再度お試しください。");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
			dispatcher.forward(req, res);
		}
	}
}