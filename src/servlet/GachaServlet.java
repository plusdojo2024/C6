package servlet;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CollectionsDAO ;

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

		// jSリクエストボディからデータを取得
        String reqData = req.getReader().readLine();
        // ここでDAOにデータを渡す処理を実行
        CollectionsDAO CollectionDAO = new CollectionsDAO();
        boolean success = CollectionDAO.addGachaNumber(reqData); // あとでDAOにデータを追加するからエラー出てる

//
		List<Collection> cardList = uDAO.select(new Collections());
		req.setAttribute("labelAndName", あたい);


	}
}