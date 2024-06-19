package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*import dao.FriendsDAO;
import model.Friends;*/
import dao.UsersDAO;
import model.Users;

@WebServlet("/FriendServlet")
public class FriendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
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




//自分のステータスを表示させる
		UsersDAO uDAO= new UsersDAO();



		Users bookList = uDAO.select(new Users());

		req.setAttribute("bookList", bookList);



	//フレンド一覧を表示させる　要トランザクション
		/*FriendsDAO fDAO=new FriendsDAO();

		List<Friends> friendList=fDAO.select(new Friends());

		req.setAttribute("friendList", friendList);*/

// 一覧ページにフォワードする
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friend.jsp");
		dispatcher.forward(req, res);
	}
}
