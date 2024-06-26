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
		try {
		//セッションからnameを取得する
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");

		//チェックボックスの値を取得
		req.setCharacterEncoding("UTF-8");
		String favoriteName=req.getParameter("friendName");
		//String checkbox=req.getParameter("favorite");

		FriendsDAO fDAO = new FriendsDAO();
		UsersDAO uDAO = new UsersDAO();

		//ログインしているユーザーのidを取得
		int id = uDAO.selectId(name);
		//処理を行いたいユーザーのidを取得
		int favoriteId = uDAO.selectId(favoriteName);

		Users u=new Users();



			fDAO.updateFavorite(id,favoriteId);

		//自分のステータスを表示させる
		u.setName(name);
		Users bookList = uDAO.select1(u);

		req.setAttribute("bookList", bookList);

		List<Users> cardList = fDAO.selectFriends(id);

		req.setAttribute("cardList", cardList);


		//フレンド一覧を表示させる

		List<Users> cardList1 = fDAO.selectFriends(id);

		req.setAttribute("cardList", cardList1);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friend.jsp");
		dispatcher.forward(req, res);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}










