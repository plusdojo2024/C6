package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

				// 一覧ページにフォワードする
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friend.jsp");
				dispatcher.forward(req, res);

				//リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");
				Int users_id=request.getParameter("users_id");
				Int friends_id=request.getParameter("friends_id");
				Int hidden=request.getParameter("hidden");
				Int favorite=request.getParameter("favorite");
	}

}
