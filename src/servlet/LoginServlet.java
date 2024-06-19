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
			//インスタンス生成
			Users u=new Users();
			u.setName(name);
			u.setPassword(password);

				if (uDAO.isLoginOK(u)) {
				//セッションオブジェクトを生成し、データを格納
				HttpSession session = req.getSession();
				session.setAttribute(name,u);

				// ログインに成功したら、スマホならマイページのuserサーブレットにリダイレクトする
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/user.jsp");
				dispatcher.forward(req, res);
				//失敗したらログインページに戻す
				}else {
					RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
					dispatcher.forward(req, res);
				}
		}
		catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}
