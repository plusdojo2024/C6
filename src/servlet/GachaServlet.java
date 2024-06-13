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

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/gacha.jsp");
		dispatcher.forward(req, res);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = req.getSession();
		if (session.getAttribute("id") == null) {
			res.sendRedirect("/c6/GachaServlet");
			return;
		}

		// 検索ページにフォワードする
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/gacha.jsp");
		dispatcher.forward(req, res);
	}

	/*
		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		//int number = request.getParameter("number"); 	//主キー
		String name = request.getParameter("name"); //氏名

		// 検索処理を行う
		BcDAO bDao = new BcDAO();
		List<Bc> cardList = bDao.select(new Bc(0, name, address, company, department, position, zipcode, phone, fax,
				email, remarks, sessonId, timestamp));

		// 検索結果をリクエストスコープに格納する
		request.setAttribute("cardList", cardList);


	}*/
}