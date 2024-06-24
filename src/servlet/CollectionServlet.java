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

import dao.CollectionsDAO;
import dao.UsersDAO;
import model.Items;

@WebServlet("/CollectionServlet")
public class CollectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/collection.jsp");
		dispatcher.forward(req, res);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			//セッションスコープからnameの値を取得する。
			HttpSession session = req.getSession();
			String name = (String) session.getAttribute("name");

			//uDAOのselectIdからIDを取得
			UsersDAO uDAO = new UsersDAO();
			int users_id = uDAO.selectId(name);
			CollectionsDAO cDAO = new CollectionsDAO();

			List<Items> cardList = cDAO.selectGacha(users_id);

			req.setAttribute("cardList", cardList);

			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/collection.jsp");
			dispatcher.forward(req, res);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
