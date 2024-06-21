//users_id items_id　トランザクション

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Collections;

public class CollectionsDAO {

	//メモ
	//　Collectionsとitemsテーブルを結合
	//　コレクションページを開いたとき、
	//　　ラベルのみ表示
	//　ラベル押下時、
	//　　ラベルlabel、名前name、詳細memoを表示

	//String query="SELECT items.label,items,name,items,memo FROM Collections INNER JOIN Items ON Collections.items_id = items.id";

	// 引数paramで検索項目を指定し、検索結果のリストを返す
	public List<Collections> select(Collections card) throws Exception {
		Connection conn = null;
		List<Collections> cardList = new ArrayList<Collections>();

		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			String sql = "SELECT * FROM Collections WHERE users_id LIKE ? AND items_id LIKE ? ORDER BY id";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる

			if (card.getUsers_id() != 0) {
				pStmt.setString(1, "%" + card.getUsers_id() + "%");
			}
			else {
				pStmt.setString(1, "%");
			}
			if (card.getItems_id() != 0) {
				pStmt.setString(2, "%" + card.getItems_id() + "%");
			}
			else {
				pStmt.setString(2, "%");
			}

			// SQL文を実行し、結果表を取得する
						ResultSet rs = pStmt.executeQuery();

						// 結果表をコレクションにコピーする
						while (rs.next()) {
							Collections record = new Collections(
							rs.getInt("id"),
							rs.getInt("uses_id"),
							rs.getInt("items_id")
							);
							cardList.add(record);
						}
					}
					catch (SQLException e) {
						e.printStackTrace();
						cardList = null;
					}
					catch (ClassNotFoundException e) {
						e.printStackTrace();
						cardList = null;
					}
					finally {
						// データベースを切断
						if (conn != null) {
							try {
								conn.close();
							}
							catch (SQLException e) {
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