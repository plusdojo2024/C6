package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GachaServlet")
public class GachaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = req.getSession();
		if (session.getAttribute("id") == null) {
			res.sendRedirect("/C6/LoginServlet");
			return;
		}
		// ガチャページにフォワードする
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/set.jsp");
		dispatcher.forward(req, res);
	}

}
