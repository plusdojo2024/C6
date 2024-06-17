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

@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/number.jsp");
		dispatcher.forward(req, res);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			UsersDAO uDAO = new UsersDAO();

			//セッションから名前を取得する
			HttpSession session = req.getSession();
			//セッションスコープからニックネームチェックの値を取得する。
			String name = (String) session.getAttribute("name");

			// リクエストパラメータを取得する
			req.setCharacterEncoding("UTF-8");
			String strSubject = req.getParameter("subject");
			String strNewsubject = req.getParameter("newsubject");

			//subjectをStringからintにする
			int subject = Integer.parseInt(strSubject);
			int newsubject = Integer.parseInt(strNewsubject);

			// ナンバー更新処理
			//ナンバーとニックネームが一致するか
			if (uDAO.checkNumber(name,subject)) {
				//ナンバーとニックネームが一致したら、新しいナンバーの更新処理を行う
				uDAO.updateNumber(name, newsubject);
			} else {
				//ナンバーとニックネームが一致しなかったら、ナンバー変更画面に戻る
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/number.jsp");
				dispatcher.forward(req, res);
			}

			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/user.jsp");
			dispatcher.forward(req, res);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
