package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.FriendsDAO;
import dao.UsersDAO;
import model.Users;

@WebServlet("/HiddenServlet")
public class HiddenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//セッションからnameを取得する
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");

		// DAOを使用してデータベース操作
		UsersDAO uDAO = new UsersDAO();
		FriendsDAO fDAO = new FriendsDAO();

		//ログインしているユーザーのidを取得
		int id = uDAO.selectId(name);

		//非表示フレンド一覧を取得
		List<Users> hiddenList = fDAO.selectHiddenFriends(id);

		req.setAttribute("hiddenList", hiddenList);

		// 非表示ページにフォワードする
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/hidden.jsp");
		dispatcher.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try {
			/*//もしもログインしていなかったらログインサーブレットにリダイレクトする
			HttpSession session = req.getSession();
			if (session.getAttribute("id") == null) {
				res.sendRedirect("/c6/LoginServlet");
				return;
			}
			*/

			//セッションからnameを取得する
			HttpSession session = req.getSession();
			String name = (String) session.getAttribute("name");


			// リクエストパラメータを取得する
			req.setCharacterEncoding("UTF-8");
			String hiddenName = req.getParameter("name");
			String submit = req.getParameter("submit");

			// DAOを使用してデータベース操作
			UsersDAO uDAO = new UsersDAO();
			FriendsDAO fDAO = new FriendsDAO();

			//ログインしているユーザーのidを取得
			int id = uDAO.selectId(name);
			//処理を行いたいユーザーのidを取得
			int hiddenId = uDAO.selectId(hiddenName);

			if("") {

			}



			// 非表示ページにフォワードする
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/hidden.jsp");
			dispatcher.forward(req, res);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}