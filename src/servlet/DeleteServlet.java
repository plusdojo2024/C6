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

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/delete.jsp");
		dispatcher.forward(req, res);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/newRegist.jsp");
			dispatcher.forward(req, res);
			int id = 0;
			// セッションから名前を取得する
			HttpSession session = req.getSession();
			String name = (String) session.getAttribute("name");
			//idを取得する
			UsersDAO uDAO = new UsersDAO();

			id = uDAO.selectId(name);

		//アカウントを削除する
			uDAO.updateUnknown(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
