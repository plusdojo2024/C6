package servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import dao.UsersDAO;

@WebServlet("/IconServlet")
@MultipartConfig
public class IconServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/icon.jsp");
		dispatcher.forward(req, res);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uploadPath = "c6/WebContent/upload"; // 画像を保存するディレクトリのパス
        Part filePart = req.getPart("file"); // HTML フォームから送信されたファイル部品

        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // ファイル名の取得
        String filePath = uploadPath + File.separator + fileName; // 保存するファイルのパス

        // 画像をディスクに保存
        try (InputStream input = filePart.getInputStream()) {
            Files.copy(input, Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);//ファイルが既にある場合は上書き
        } catch (IOException ex) {
            ex.printStackTrace();
        }

      //セッションから名前を取得する
      HttpSession session = req.getSession();
      String name = (String) session.getAttribute("name");

      UsersDAO uDAO = new UsersDAO();
      try {
		uDAO.updateIcon(name, "/c6/upload/"+fileName);



     // リダイレクト
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/icon.jsp");
		dispatcher.forward(req, res);
      } catch (ClassNotFoundException e) {
  		// TODO 自動生成された catch ブロック
  		e.printStackTrace();
  	}
    }
}



		/*name属性がfileのファイルをPartオブジェクトとして取得
		Part part=req.getPart("file");
		//ファイル名を取得
		String filename=Paths.get(part.getSubmittedFileName()).getFileName().toString();
		//アップロードするフォルダ
		String path=getServletContext().getRealPath("/upload");
		//実際にファイルが保存されるパス確認
		System.out.println(path);
		//書き込み
		part.write(path+File.separator+filename);
		req.setAttribute("filename", filename);*/


		/*セッションから名前を取得する
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");

		UsersDAO uDAO = new UsersDAO();

		//アイコンを変更
		try {
			uDAO.updateIcon(name, path);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		//doGet(req, res);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/friend.jsp");
		dispatcher.forward(req, res);

	}*/
