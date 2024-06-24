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
import model.Friends;
import model.Users;

@WebServlet("/FriendServlet")
public class FriendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//セッションスコープからnameの値を取得する。
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");

		UsersDAO uDAO = new UsersDAO();

		Users u = new Users();

		//自分のステータスを表示させる
		u.setName(name);
		Users bookList = uDAO.select1(u);

		req.setAttribute("bookList", bookList);

		//フレンド一覧を表示させる
		int id = uDAO.selectId(name);
		FriendsDAO fDAO = new FriendsDAO();

		List<Users> cardList = fDAO.selectFriends(id);

		req.setAttribute("cardList", cardList);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friend.jsp");
		dispatcher.forward(req, res);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//セッションからIDを取得する

		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");

		req.setCharacterEncoding("UTF-8");

		//チェックボックスの値を取得
		String favoriteParam = req.getParameter("favorite");
		int favorite = (favoriteParam != null && favoriteParam.equals("on")) ? 1 : 0;

		FriendsDAO fDAO = new FriendsDAO();

		Friends f = new Friends();

		f.setFavorite(favorite);

		fDAO.updateFavorite(favorite, 0);

		// 一覧ページにフォワードする
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friend.jsp");
		dispatcher.forward(req, res);
	}
}
