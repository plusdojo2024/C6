package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsersDAO;
import model.Users;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/user.jsp");
		dispatcher.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {

			req.setCharacterEncoding("UTF-8");

			// 6時チェック
			if (req.getParameter("clock") != null) {
			    UsersDAO.update6clock();
			}else {
				UsersDAO.update6clock();
			}

			//セッションからnameを取得する
			HttpSession session = req.getSession();
			String name = (String) session.getAttribute("name");

			//リクエストパラメーターを取得する
			String motivation = req.getParameter("motivation");
			String location = req.getParameter("location");
			String start = req.getParameter("start");
			String finish = req.getParameter("finish");
			String remarks = req.getParameter("remarks");

			// 登録処理を行う
			UsersDAO uDAO = new UsersDAO();

			//intに変換
			int motivation1 = Integer.parseInt(motivation);

			// beanにセット
			Users u = new Users();
			u.setName(name);
			u.setMotivation(motivation1);
			u.setLocation(location);
			u.setStart(start);
			u.setFinish(finish);
			u.setRemarks(remarks);

			uDAO.update(u);

			// 登録完了後、フレンドページにフォワードする
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friend.jsp");
			dispatcher.forward(req, res);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
