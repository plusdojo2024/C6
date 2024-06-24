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
import model.common;

@WebServlet("/NewRegistServlet")
public class NewRegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/newRegist.jsp");
		dispatcher.forward(req, res);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			int number4=0;
			// リクエストパラメータを取得する
			req.setCharacterEncoding("UTF-8");
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			String birthday = req.getParameter("birthday");
			String secret = req.getParameter("secret");

			// 登録処理
			UsersDAO uDAO = new UsersDAO();

			//4numberを取得する
			number4=common.number4();

			//beanにセット
			Users u = new Users();
			u.setName(name);
			u.setPassword(password);
			u.setBirthday(birthday);
			u.setSecret(secret);
			u.setNumber(number4);

			uDAO.insert(u);

			// 登場完了後、ログイン画面に遷移する
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
			dispatcher.forward(req, res);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
