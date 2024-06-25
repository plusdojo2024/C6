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
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");

		req.setCharacterEncoding("UTF-8");
		String friendsIdStr = req.getParameter("friends_id");
        String favoriteStr = req.getParameter("favorite");

		// DAOを使用してデータベース操作
		UsersDAO uDAO = new UsersDAO();
		FriendsDAO fDAO = new FriendsDAO();

		//ログインしているユーザーのidを取得
		int id = uDAO.selectId(name);

        int friendsId = Integer.parseInt(friendsIdStr);
        int favorite = (favoriteStr != null) ? 1 : 0;

        // Friendsオブジェクトを作成
        Friends friend = new Friends();
        friend.setFavorite(favorite);

        // DAOを呼び出してデータベースを更新
        FriendsDAO dao = new FriendsDAO();
        dao.updateFavorite(friendsId, friend);

		// 一覧ページにフォワードする
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friend.jsp");
		dispatcher.forward(req, res);
	}
}










