package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Collections;

public class CollectionsDao {


	// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(Collections card) throws Exception {
		Connection conn = null;
		boolean result = false;

		try {
			//Connctionする
			 conn = BaseDAO.conn();
			// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
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
	}
}