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


	//ガチャを引いた時のメモ
	//　jsで数字をランダム生成
	//　jspがサーブレットに数字を送る
	//　サーブレットがDAOにusers_idと数字を送る
	//　＊users_idとitems_id(数字)をインサート＊



	// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(Collections card) throws Exception {
		Connection conn = null;
		boolean result = false;

		try {
			//Connctionする
			 conn = BaseDAO.conn();
			// SQL文を準備する（AUTO_INCREMENTのid列にはNULLを指定する）
			String sql = "INSERT INTO Collections VALUES (NULL, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);


			// SQL文を完成させる


			if (card.getUsers_id() != 0 && card.getUsers_id()!=0) {
				pStmt.setInt(1, card.getUsers_id());
			} else {
				pStmt.setInt(1,0);
			}

			//!card.getItem_id().equals("") →  true  or  false

			//card.getUsers_id() != 0 →　左右の値がちがっていたらtrue 　あっていたら　false
			//card.getUsers_id() == 0 →　左右の値があっていたらtrue 　ちがっていたら　false


			if (card.getItems_id() != 0&& card.getItems_id()!=0) {
				pStmt.setInt(2, card.getItems_id());
			} else {
				pStmt.setInt(2,0);
			}

			// SQL文を実行する
			if (pStmt.executeUpdate() == 1) {
				result = true;
			}
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

		// 結果を返す
		return result;
	}

	// 引数cardで指定されたレコードを更新し、成功したらtrueを返す
	public boolean update(Collections card) throws Exception {
		Connection conn = null;
		boolean result = false;

		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			String sql = "UPDATE Collections SET users_id=?, items_id=?,WHERE id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (card.getUsers_id() != 0 && card.getUsers_id()!=0) {
				pStmt.setInt(1, card.getUsers_id());
			} else {
				pStmt.setInt(1, 0);
			}
			if (card.getItems_id() != 0 && card.getItems_id()!=0) {
				pStmt.setInt(2, card.getItems_id());
			} else {
				pStmt.setInt(2,0);


			pStmt.setInt(6, card.getId());

			// SQL文を実行する
			if (pStmt.executeUpdate() == 1) {
				result = true;
			}
			}
			}catch (SQLException e) {
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

		// 結果を返す
		return result;
	}

	// 引数numberで指定されたレコードを削除し、成功したらtrueを返す
	public boolean delete(int number) throws Exception {
		Connection conn = null;
		boolean result = false;

		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			String sql = "DELETE FROM Collections WHERE id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setInt(1, number);

			// SQL文を実行する
			if (pStmt.executeUpdate() == 1) {
				result = true;
			}
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

		// 結果を返す
		return result;


	//ガチャjsで生成された数字とセッションidをサーブレット経由でインサート
	/*public boolean addGachaNumber(String reqData) {
		Connection conn = null;
		boolean result = false;

		// SQL文を準備する
		String sql = "UPDATE * FROM COLLECTIONS WHERE name =  ? AND password=  ? ";
		PreparedStatement pStmt = conn.prepareStatement(sql);
	*/






	}
}