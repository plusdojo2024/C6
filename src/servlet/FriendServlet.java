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
import model.Friends;
import dao.UsersDAO;
import model.Users;

@WebServlet("/FriendServlet")
public class FriendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FriendsDAO friendDAO;
	private UsersDAO usersDAO;

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

				// 一覧ページにフォワードする
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friend.jsp");
				dispatcher.forward(req, res);
			}

	//自分のステータスを表示させる
		UsersDAO uDAO= new UsersDAO();

		List<Users> cardList=uDAO.select(new Users());

		request.setAttribute("cardList", cardList);

	//フレンド一覧を表示させる　要トランザクション
		FriendsDAO fDAO=new FriendsDAO();

		List<Friends> cardList=fDAO.select(new Friends());

		request.setAttribute("cardList", cardList);

	}


