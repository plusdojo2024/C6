package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Friends;

public class FriendsDao {
	Connection conn = null;

	// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(Friends card) throws Exception {
		Connection conn = null;
		boolean result = false;

		try {
			//Connctionする
			 conn = BaseDAO.conn();
			// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
			String sql = "INSERT INTO Friends VALUES (?, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (card.getId() != 0 && card.getId() != 0) {
				pStmt.setInt(1, card.getId());
			}
			if (card.getUsers_id() != 0 && card.getUsers_id() != 0) {
				pStmt.setInt(2, card.getUsers_id());
			} else {
				pStmt.setInt(2, 0);
			}
			if (card.getFriends_id() != 0 && card.getFriends_id() != 0) {
				pStmt.setInt(3, card.getFriends_id());
			} else {
				pStmt.setInt(3,0);
			}
			if (card.getHidden() != 0 && card.getHidden() != 0) {
				pStmt.setBoolean(4, card.getHidden());
			} else {
				pStmt.setBoolean(4, 0);
			}
			if (card.getFavorite() != 0 && card.getFavorite() != 0) {
				pStmt.setBoolean(5, card.getFavorite());
			} else {
				pStmt.setBoolean(5,0);
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
	public boolean update(Friends card) throws Exception {
		Connection conn = null;
		boolean result = false;

		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			String sql = "UPDATE Friends SET hidden=?, favorite=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (card.getHidden() != 0 && card.getHidden() != 0) {
				pStmt.setBoolean(1, card.getHidden());
			} else {
				pStmt.setBoolean(1,0);
			}
			if (card.getFavorite() != 0 && card.getFavorite() != 0) {
				pStmt.setBoolean(2, card.getFavorite());
			} else {
				pStmt.setBoolean(2,0);
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

	// 引数numberで指定されたレコードを削除し、成功したらtrueを返す
	public boolean delete(int hidden) throws Exception {
		Connection conn = null;
		boolean result = false;

		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			String sql = "DELETE FROM Friends WHERE hidden=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setInt(1, hidden);

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






