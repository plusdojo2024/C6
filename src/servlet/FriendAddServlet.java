package servlet;

import java.io.IOException;

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

@WebServlet("/FriendAddServlet")
public class FriendAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friendAdd.jsp");
		dispatcher.forward(req, res);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			int userId = 0;
			int friendId = 0;

			//セッションスコープからnameの値を取得する。
			HttpSession session = req.getSession();
			String userName = (String) session.getAttribute("name");

			// リクエストパラメータを取得する
			req.setCharacterEncoding("UTF-8");
			String friendName = req.getParameter("name");
			String num = req.getParameter("number");

			//numberをStringからintにする
			int number = Integer.parseInt(num);

			// 友達追加処理を行う
			UsersDAO uDAO = new UsersDAO();
			FriendsDAO fDAO = new FriendsDAO();

			//beanのインスタンスを生成
			Users u = new Users();
			Friends f = new Friends();

			//UserBeanにセット
			u.setName(friendName);
			u.setNumber(number);

			//フレンド追加したい相手が正しい情報かチェックする

			if (uDAO.checkFriend(u)) {
				//ユーザーとフレンドのidを取得する
				friendId = uDAO.selectId(friendName);
				userId = uDAO.selectId(userName);
				//FriendsBeanにセット
				f.setUsers_id(userId);
				f.setFriends_id(friendId);
				//ユーザーとフレンドをお互いフレンド追加する
				fDAO.insertFriend(f);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/user.jsp");
				dispatcher.forward(req, res);
			} else {
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friendAdd.jsp");
				dispatcher.forward(req, res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
