package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CollectionsDAO ;
import model.Collections;

@WebServlet("/GachaServlet")
public class GachaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CollectionsDAO uDAO;
	private Object cardList;
	private Object gacha;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/gacha.jsp");
		dispatcher.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		try {

		 // インスタンス生成
		Collections u = new Collections();
		u.setGacha(gacha);

        uDAO.select(u);

		// 検索結果をリクエストスコープに格納する
		req.setAttribute("cardList", cardList);
		//リクエストパラメータを取得する
		req.setCharacterEncoding("UTF-8");
		String strId = req.getParameter("id");
		String strUsers_id = req.getParameter("users_id");
		String strItems_id = req.getParameter("items_id");


		//String型をInt型に変換
		int id = Integer.parseInt(strId);
		int users_id = Integer.parseInt(strUsers_id);
		int items_id = Integer.parseInt(strItems_id);

		// 処理を行う
		CollectionsDAO uDAO = new CollectionsDAO();
		//beanにセット
		//Collections u=new Collections();
		u.setId(id);
		u.setUsers_id(users_id);
		u.setItems_id(items_id);


			uDAO.select(u);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}