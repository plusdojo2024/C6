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

@WebServlet("/SecretServlet")
public class SecretServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/secret.jsp");
		dispatcher.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			//リクエストパラメータを取得する
			req.setCharacterEncoding("UTF-8");
			String name = req.getParameter("name");
			String secret = req.getParameter("secret");

			//セッションスコープにnameの値を格納する。
			HttpSession session = req.getSession();
			session.setAttribute("name", name);

			//秘密の質問の処理
			UsersDAO uDao = new UsersDAO();
			//インスタンス生成
			Users u = new Users();
			u.setName(name);
			u.setSecret(secret);

			if (uDao.checkSecret(u)) {
				// 成功したら、パスワードサーブレットにフォワードする
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/password.jsp");
				dispatcher.forward(req, res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
