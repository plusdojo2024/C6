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
/*import dao.FriendsDAO;
import model.Friends;*/
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

		//自分のステータスを表示させる
		UsersDAO uDAO= new UsersDAO();

		Users u= new Users();

		u.setName(name);
		Users bookList = uDAO.select1(u);

		req.setAttribute("bookList", bookList);

		//フレンド一覧を表示させる
		FriendsDAO fDAO=new FriendsDAO();

		List<Friends> cardList=fDAO.select(new Friends());

		req.setAttribute("cardList", cardList);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friend.jsp");
		dispatcher.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = req.getSession();

		if (session.getAttribute("id") == null) {
			res.sendRedirect("/c6/LoginServlet");
			return;
	}


;

// 一覧ページにフォワードする
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friend.jsp");
		dispatcher.forward(req, res);
	}
}
