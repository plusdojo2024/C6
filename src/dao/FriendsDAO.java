//Users_id,friends_id トランザクション

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Friends;

public class FriendsDAO {
	Connection conn = null;

	// 引数paramで検索項目を指定し、検索結果のリストを返す
	public List<Friends> select(Friends card) throws Exception {
		Connection conn = null;
		List<Friends> cardList = new ArrayList<Friends>();

		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			String sql = "SELECT * FROM Collections WHERE users_id LIKE ? AND friends_id LIKE ? AND hidden LIKE ? AND favorite LIKE? ORDER BY id";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる

			if (card.getUsers_id() != 0) {
				pStmt.setString(1, "%" + card.getUsers_id() + "%");
			} else {
				pStmt.setString(1, "%");
			}
			if (card.getFriends_id() != 0) {
				pStmt.setString(2, "%" + card.getFriends_id() + "%");
			} else {
				pStmt.setString(2, "%");
			}
			if (card.getHidden() != 0) {
				pStmt.setString(3, "%" + card.getHidden() + "%");
			} else {
				pStmt.setString(3, "%");
			}
			if (card.getFavorite() != 0) {
				pStmt.setString(4, "%" + card.getFavorite() + "%");
			} else {
				pStmt.setString(4, "%");
			}

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Friends record = new Friends(
						rs.getInt("id"),
						rs.getInt("users_id"),
						rs.getInt("friends_id"),
						rs.getInt("hidden"),
						rs.getInt("favorite"));
				cardList.add(record);
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
				pStmt.setInt(3, 0);
			}
			if (card.getHidden() != 0 && card.getHidden() != 0) {
				pStmt.setInt(4, card.getHidden());
			} else {
				pStmt.setInt(4, 0);
			}
			if (card.getFavorite() != 0 && card.getFavorite() != 0) {

				if (card.getFavorite() != 0) {

					pStmt.setInt(5, card.getFavorite());
				} else {
					pStmt.setInt(5, 0);
				}

				// SQL文を実行する
				if (pStmt.executeUpdate() == 1) {
					result = true;
				}
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
			if (card.getHidden() != 0) {
				pStmt.setInt(4, card.getHidden());
			} else {
				pStmt.setInt(4, 0);
			}
			if (card.getFavorite() != 0) {
				pStmt.setInt(5, card.getFavorite());
			} else {
				pStmt.setInt(5, 0);
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

	//友達を追加する
	//TODO トランザクション処理が必要か確認
	public void insertFriend(Friends card) throws Exception {
		Connection conn = null;

		try {
			//Connctionする
			conn = BaseDAO.conn();
			// ユーザーに友達を追加
			String sql = "INSERT INTO Friends VALUES (null,?, ?,0,0)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setInt(1, card.getUsers_id());
			pStmt.setInt(2, card.getFriends_id());

			// SQL文を実行する
			pStmt.executeUpdate();

			// 友達にユーザーを追加
			sql = "INSERT INTO Friends VALUES (null,?, ?,0,0)";
			pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setInt(1, card.getFriends_id());
			pStmt.setInt(2, card.getUsers_id());

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
