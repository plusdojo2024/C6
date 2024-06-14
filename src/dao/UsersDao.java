package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Users;

public class UsersDao {


	// 引数cardで指定されたレコードを登録し、成功したらtrueを返す
	public boolean insert(Users card) throws Exception {
		Connection conn = null;
		boolean result = false;

		try {
			//Connctionする
			 conn = BaseDAO.conn();
			// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
			String sql = "INSERT INTO Users VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);


			// SQL文を完成させる


			if (!card.getName().equals("") && !card.getName().equals("")) {
				pStmt.setString(1, card.getName());
			} else {
				pStmt.setString(1,("非表示"));
			}

			//!card.getItem_id().equals("") →  true  or  false

			//card.getUsers_id() != 0 →　左右の値がちがっていたらtrue 　あっていたら　false
			//card.getUsers_id() == 0 →　左右の値があっていたらtrue 　ちがっていたら　false


			if (card.getPassword() != null && !card.getPassword().equals("")) {
				pStmt.setString(2, card.getPassword());
			}
			else {
				pStmt.setString(2, "（未設定）");
			}

			if (card.getNumber() != 0&& card.getNumber()!=0) {
				pStmt.setInt(3, card.getNumber());
			} else {
				pStmt.setInt(3,0);
			}

			if (card.getSecret() != null && !card.getSecret().equals("")) {
				pStmt.setString(4, card.getSecret());
			}
			else {
				pStmt.setString(4, "（未設定）");
			}

			if (card.getBirthday() != null&& card.getBirthday().equals("")) {
				pStmt.setString(5, card.getBirthday());
			} else {
				pStmt.setString(5,"（未設定）");
			}

			if (card.getLocation() != null && !card.getLocation().equals("")) {
				pStmt.setString(6, card.getLocation());
			}
			else {
				pStmt.setString(6, "（未設定）");
			}

			if (card.getMotivation() != 0&& card.getMotivation()!=0) {
				pStmt.setInt(7, card.getMotivation());
			} else {
				pStmt.setInt(7,0);
			}

			if (card.getIcon() != null && !card.getIcon().equals("")) {
				pStmt.setString(8, card.getIcon());
			}
			else {
				pStmt.setString(8, "（未設定）");
			}

			if (card.getStart() != 0&& card.getStart()!=0) {
				pStmt.setInt(9, card.getStart());
			} else {
				pStmt.setInt(9,0);
			}

			if (card.getFinish() != 0&& card.getFinish()!=0) {
				pStmt.setInt(10, card.getFinish());
			} else {
				pStmt.setInt(10,0);
			}

			if (card.getRemarks() != null && !card.getRemarks().equals("")) {
				pStmt.setString(11, card.getRemarks());
			}
			else {
				pStmt.setString(11, "（未設定）");
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
	public boolean update(Users card) throws Exception {
		Connection conn = null;
		boolean result = false;

		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			String sql = "UPDATE Users SET name=?, password=?, number=?, secret=?, birthday=?, location=?, motivation=?, icon=?, start=?, finish=?, remarks=? WHERE id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (card.getName() != null && !card.getName().equals("")) {
				pStmt.setString(1, card.getName());
			}
			else {
				pStmt.setString(1, null);
			}
			if (card.getPassword() != null && !card.getPassword().equals("")) {
				pStmt.setString(2, card.getPassword());
			}
			else {
				pStmt.setString(2, null);
			}
			if (card.getNumber() != 0 && card.getNumber()!=0) {
				pStmt.setInt(3, card.getNumber());
			} else {
				pStmt.setInt(3,0);
			}
			if (card.getSecret() != null && !card.getSecret().equals("")) {
					pStmt.setString(4, card.getSecret());
				}
				else {
					pStmt.setString(4, null);
				}
			if (card.getBirthday() != null && !card.getBirthday().equals("")) {
				pStmt.setString(5, card.getBirthday());
			} else {
				pStmt.setInt(5,0);
			}
			if (card.getLocation() != null && !card.getLocation().equals("")) {
				pStmt.setString(6, card.getLocation());
			}
			else {
				pStmt.setString(6, null);
			}
			if (card.getMotivation() != 0 && card.getMotivation()!=0) {
				pStmt.setInt(7, card.getMotivation());
			} else {
				pStmt.setInt(7,0);
			}
			if (card.getIcon() != null && !card.getIcon().equals("")) {
				pStmt.setString(8, card.getIcon());
			}
			else {
				pStmt.setString(8, null);
			}
			if (card.getStart() != 0 && card.getStart()!=0) {
				pStmt.setInt(9, card.getStart());
			} else {
				pStmt.setInt(9,0);
			}
			if (card.getFinish() != 0 && card.getFinish()!=0) {
				pStmt.setInt(10, card.getFinish());
			} else {
				pStmt.setInt(10,0);
			}
			if (card.getRemarks() != null && !card.getRemarks().equals("")) {
				pStmt.setString(11, card.getRemarks());
			}
			else {
				pStmt.setString(11, null);
			}
			pStmt.setInt(12, card.getId());

			// SQL文を実行する
			if (pStmt.executeUpdate() == 1) {
				result = true;
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
