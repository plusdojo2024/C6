package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsersDAO;
import model.Users;

@WebServlet("/PasswordServlet")
public class PasswordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/password.jsp");
        dispatcher.forward(req, res);
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
        // リクエストパラメータを取得する
        req.setCharacterEncoding("UTF-8");
        String password = req.getParameter("password");

        // 登録処理を行う
        UsersDAO uDAO = new UsersDAO();

        // インスタンス生成
        Users u = new Users();
        u.setPassword(password);

        uDAO.insert(u);


        // ログインページにフォワードする
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
        dispatcher.forward(req, res);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
