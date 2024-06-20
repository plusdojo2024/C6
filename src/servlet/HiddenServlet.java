package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.FriendsDAO;
import model.Friends;

@WebServlet("/HiddenServlet")
public class HiddenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/hidden.jsp");
		dispatcher.forward(req, res);

	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO

		/*//もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = req.getSession();
		if (session.getAttribute("id") == null) {
			res.sendRedirect("/c6/LoginServlet");
			return;
		}
		*/

		//セッションからnameを取得する
			HttpSession session = req.getSession();
			String name = (String) session.getAttribute("name");

		// リクエストパラメータを取得する
		req.setCharacterEncoding("UTF-8");
		String hidden = req.getParameter("hidden");
        String icon = req.getParameter("icon");

		// hiddenをStringからintに変換
        int hidden1 = Integer.parseInt(hidden);

        // Friendsオブジェクトを作成
        Friends f = new Friends();
        f.setHidden(hidden1);
        f.setName(name);
        f.setIcon(icon);

        // DAOを使用してデータベース操作
        FriendsDAO dao = new FriendsDAO();

        try {
            // フレンドリストに追加する
            if (req.getParameter("cansellation") != null) {
                dao.insert(f);
            }

            // データを削除する
            if (req.getParameter("delete") != null) {
                dao.delete(hidden1);
            }

            // 必要に応じて他の操作もここに追加
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 非表示ページにフォワードする
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/hidden.jsp");
        dispatcher.forward(req, res);
    }
}