package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// リクエストパラメータを取得する
		req.setCharacterEncoding("UTF-8");
		String hide = req.getParameter("hidden");
        String name = req.getParameter("name");
        String icon = req.getParameter("icon");

        // hiddenをStringからintに変換
        int hid = Integer.parseInt(hide);

        // Friendsオブジェクトを作成
        Friends friend = new Friends();
        friend.setHidden(hidden);
        friend.setName(name);
        friend.setIcon(icon);

        // DAOを使用してデータベース操作
        FriendsDAO dao = new FriendsDAO();

        try {
            // フレンドリストに追加する
            if (req.getParameter("cansellation") != null) {
                dao.insert(friend);
            }

            // データを削除する
            if (req.getParameter("delete") != null) {
                dao.delete(hidden);
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