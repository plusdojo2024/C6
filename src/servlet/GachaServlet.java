package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CollectionsDAO ;
import model.Collections;

@WebServlet("/GachaServlet")
public class GachaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/gacha.jsp");
		dispatcher.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {

		// 検索結果をリクエストスコープに格納する
		req.setAttribute("cardList", cardList);
		//リクエストパラメータを取得する
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("id");
		String label = req.getParameter("users_id");
		String name = req.getParameter("item_id");


		//String型をInt型に変換
		int id = Integer.parseInt(id);
		int users_id = Integer.parseInt(users_id);
		int item_id = Integer.parseInt(item_id);

		// 処理を行う
		CollectionsDAO uDao = new CollectionsDAO();
		//beanにセット
		Collections u=new Collections();
		u.setgacha(id);
		u.setgacha(users_id);
		u.setgacha(item_id);

		uDAO.gacha(u);

}