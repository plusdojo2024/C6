package servlet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/IconServlet")
@MultipartConfig
public class IconServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/icon.jsp");
		dispatcher.forward(req, res);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//name属性がfileのファイルをPartオブジェクトとして取得
		Part part=req.getPart("file");
		//ファイル名を取得
		//String filename=part.getSubmittedFileName();//ie対応が不要な場合
		String filename=Paths.get(part.getSubmittedFileName()).getFileName().toString();
		//アップロードするフォルダ
		String path=getServletContext().getRealPath("/upload");
		//実際にファイルが保存されるパス確認
		System.out.println(path);
		//書き込み
		part.write(path+File.separator+filename);
		req.setAttribute("filename", filename);

		//doGet(req, res);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/icon.jsp");
		dispatcher.forward(req, res);

	}

}
