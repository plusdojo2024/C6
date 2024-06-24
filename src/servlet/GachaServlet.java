package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CollectionsDAO;
import dao.UsersDAO;

@WebServlet("/GachaServlet")
public class GachaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int motivation = 0;

		//セッションスコープからnameの値を取得する。
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");

		//更新前だったら。ガチャ引けない
		UsersDAO uDAO = new UsersDAO();
		motivation = uDAO.selectMotivation(name);

		if (0 != motivation) {
			//ガチャ引ける
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/gacha.jsp");
			dispatcher.forward(req, res);
		}else {
			//ガチャを引けない。ユーザー情報を更新させる
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/user.jsp");
			dispatcher.forward(req, res);

		}


	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try {
			//セッションスコープからnameの値を取得する。
			HttpSession session = req.getSession();
			String name = (String) session.getAttribute("name");

			// リクエストパラメータを取得する
			req.setCharacterEncoding("UTF-8");
			String gachaRandom = req.getParameter("gachaRandom");

			//uDAOのselectIdからIDを取得
			UsersDAO uDAO = new UsersDAO();
			int users_id = uDAO.selectId(name);

			//intに変換
			int Items_id = Integer.parseInt(gachaRandom);

			// インスタンス生成
			model.Collections c = new model.Collections();
			c.setUsers_id(users_id);
			c.setItems_id(Items_id);

			CollectionsDAO.insertGacha(users_id, c);

			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/collection.jsp");
			dispatcher.forward(req, res);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}