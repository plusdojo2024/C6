//users_id items_id　トランザクション

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Collections;
import model.Items;

public class CollectionsDAO {

	// 引数paramで検索項目を指定し、検索結果のリストを返す
	public  List<Items> selectGacha(int users_id) throws Exception {
		Connection conn = null;
		List<Items> cardList = new ArrayList<Items>();

		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			String sql = "SELECT DISTINCT items_id,label,name,memo  FROM Collections INNER JOIN Items ON Items_id = items.id WHERE Users_id = 0 ORDER BY items_id ASC";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setInt(1, users_id);

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				Items bean = new Items();
				bean.setLabel(rs.getString("label"));
				bean.setName(rs.getString("name"));
				bean.setMemo(rs.getString("memo"));
				cardList.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			cardList = null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			cardList = null;
		} finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					cardList = null;
				}
			}
		}

		// 結果を返す
		return cardList;
	}

	//ガチャ結果のINSERT文
	public static void insertGacha(int users_id, Collections c) throws Exception {
		Connection conn = null;
		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			String sql = "INSERT INTO Collections (users_id, items_id) VALUES (?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setInt(1, c.getUsers_id());
			pStmt.setInt(2, c.getItems_id());

			// SQL文を実行する
			pStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// データベースを切断
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}
}