package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Items;

public class ItemsDao {
	Connection conn = null;

	// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(Items card) throws Exception {
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
			} else {
				pStmt.setInt(1, 0);
			}
			if (card.getTypes_id() != 0 && card.getTypes_id() != 0) {
				pStmt.setInt(2, card.getTypes_id());
			} else {
				pStmt.setInt(2, 0);
			}
			if (card.getLabel() != null) {
				pStmt.setString(3, "%" + card.getLabel() + "%");
			}
			else {
				pStmt.setString(3, "%");
			}
			if (card.getName() != null) {
				pStmt.setString(4, "%" + card.getName() + "%");
			}
			else {
				pStmt.setString(4, "%");
			}
			if (card.getMemo() != null) {
				pStmt.setString(5, "%" + card.getMemo() + "%");
			}
			else {
				pStmt.setString(5, "%");
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
	public boolean update(Items card) throws Exception {
		Connection conn = null;
		boolean result = false;

		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			String sql = "UPDATE Friends SET hidden=?, favorite=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (card.getId() != 0 && card.getId() != 0) {
				pStmt.setInt(1, card.getId());
			} else {
				pStmt.setInt(1, 0);
			}
			if (card.getTypes_id() != 0 && card.getTypes_id() != 0) {
				pStmt.setInt(2, card.getTypes_id());
			} else {
				pStmt.setInt(2, 0);
			}
			if (card.getLabel() != null) {
				pStmt.setString(3, "%" + card.getLabel() + "%");
			}
			else {
				pStmt.setString(3, "%");
			}
			if (card.getName() != null) {
				pStmt.setString(4, "%" + card.getName() + "%");
			}
			else {
				pStmt.setString(4, "%");
			}
			if (card.getMemo() != null) {
				pStmt.setString(5, "%" + card.getMemo() + "%");
			}
			else {
				pStmt.setString(5, "%");
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
			String sql = "DELETE FROM Items WHERE hidden=?";
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
