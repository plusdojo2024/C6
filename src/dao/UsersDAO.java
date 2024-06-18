package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import model.Users;

public class UsersDAO {

	// 引数paramで検索項目を指定し、検索結果のリストを返す
	public List<Users> select(Users card) throws Exception {
		Connection conn = null;
		List<Users> cardList = new ArrayList<Users>();

		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			//フレンド一覧でお気に入りver.非表示なってない人ver.自分だけver.のセレクト文？←確認
			//３つ作る　テーブル結合をやる

			//id,pwのも書く
			String sql = "SELECT * FROM Users WHERE name LIKE ? AND password LIKE ? AND number LIKE ? AND secret LIKE? AND birthday LIKE? AND location LIKE? AND motivation LIKE? AND icon LIKE? AND start LIKE? AND finish LIKE? AND remarks LIKE? AND timestamp LIKE? ORDER BY id";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる

			if (card.getName() != null) {
				pStmt.setString(1, "%" + card.getName() + "%");
			} else {
				pStmt.setString(1, "%");
			}
			if (card.getPassword() != null) {
				pStmt.setString(2, "%" + card.getPassword() + "%");
			} else {
				pStmt.setString(2, "%");
			}
			if (card.getNumber() != 0) {
				pStmt.setString(3, "%" + card.getNumber() + "%");
			} else {
				pStmt.setString(3, "%");
			}
			if (card.getSecret() != null) {
				pStmt.setString(4, "%" + card.getSecret() + "%");
			} else {
				pStmt.setString(4, "%");
			}
			if (card.getBirthday() != null) {
				pStmt.setString(5, "%" + card.getBirthday() + "%");
			} else {
				pStmt.setString(5, "%");
			}
			if (card.getLocation() != null) {
				pStmt.setString(6, "%" + card.getLocation() + "%");
			} else {
				pStmt.setString(6, "%");
			}
			if (card.getMotivation() != 0) {
				pStmt.setString(7, "%" + card.getMotivation() + "%");
			} else {
				pStmt.setString(7, "%");
			}
			if (card.getIcon() != null) {
				pStmt.setString(8, "%" + card.getIcon() + "%");
			} else {
				pStmt.setString(8, "%");
			}
			if (card.getStart() != 0) {
				pStmt.setString(9, "%" + card.getStart() + "%");
			} else {
				pStmt.setString(9, "%");
			}
			if (card.getFinish() != 0) {
				pStmt.setString(10, "%" + card.getFinish() + "%");
			} else {
				pStmt.setString(10, "%");
			}
			if (card.getRemarks() != null) {
				pStmt.setString(11, "%" + card.getRemarks() + "%");
			} else {
				pStmt.setString(11, "%");
			}
			if (card.getTimestamp() != null) {
				pStmt.setString(12, "%" + card.getTimestamp() + "%");
			} else {
				pStmt.setString(12, "%");
			}

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			while (rs.next()) {
				Users record = new Users(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("password"),
						rs.getInt("number"),
						rs.getString("secret"),
						rs.getString("birthday"),
						rs.getString("location"),
						rs.getInt("motivation"),
						rs.getString("icon"),
						rs.getInt("start"),
						rs.getInt("finish"),
						rs.getString("remarks"),
						rs.getString("timestamp"));
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
	public boolean insert(Users card) throws Exception {
		Connection conn = null;
		boolean result = false;
		//現在時刻を取得する
		 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		try {
			//Connctionする
			conn = BaseDAO.conn();
			// SQL文を準備する（AUTO_INCREMENTのNUMBER列にはNULLを指定する）
			String sql = "INSERT INTO Users VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる

			if (!card.getName().equals("") && !card.getName().equals("")) {
				pStmt.setString(1, card.getName());
			} else {
				pStmt.setString(1, ("非表示"));
			}

			//!card.getItem_id().equals("") →  true  or  false

			//card.getUsers_id() != 0 →　左右の値がちがっていたらtrue 　あっていたら　false
			//card.getUsers_id() == 0 →　左右の値があっていたらtrue 　ちがっていたら　false

			if (card.getPassword() != null && !card.getPassword().equals("")) {
				pStmt.setString(2, card.getPassword());
			} else {
				pStmt.setString(2, "");
			}

			if (card.getNumber() != 0 && card.getNumber() != 0) {
				pStmt.setInt(3, card.getNumber());
			} else {
				pStmt.setInt(3, 0);
			}

			if (card.getSecret() != null && !card.getSecret().equals("")) {
				pStmt.setString(4, card.getSecret());
			} else {
				pStmt.setString(4, "");
			}

			if (card.getBirthday() != null && card.getBirthday().equals("")) {
				pStmt.setString(5, null);
			} else {
				pStmt.setString(5, card.getBirthday());
			}

			if (card.getLocation() != null && !card.getLocation().equals("")) {
				pStmt.setString(6, card.getLocation());
			} else {
				pStmt.setString(6, "");
			}

			if (card.getMotivation() != 0 && card.getMotivation() != 0) {
				pStmt.setInt(7, card.getMotivation());
			} else {
				pStmt.setInt(7, 0);
			}

			if (card.getIcon() != null && !card.getIcon().equals("")) {
				pStmt.setString(8, card.getIcon());
			} else {
				pStmt.setString(8, "");
			}

			if (card.getStart() != 0 && card.getStart() != 0) {
				pStmt.setInt(9, card.getStart());
			} else {
				pStmt.setInt(9, 0);
			}

			if (card.getFinish() != 0 && card.getFinish() != 0) {
				pStmt.setInt(10, card.getFinish());
			} else {
				pStmt.setInt(10, 0);
			}

			if (card.getRemarks() != null && !card.getRemarks().equals("")) {
				pStmt.setString(11, card.getRemarks());
			} else {
				pStmt.setString(11, "");
			}
			if (card.getTimestamp() != null && !card.getTimestamp().equals("")) {
				pStmt.setString(12, card.getTimestamp());
			} else {
				pStmt.setTimestamp(12,timestamp );
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
			String sql = "UPDATE Users SET name=?, password=?, number=?, secret=?, birthday=?, location=?, motivation=?, icon=?, start=?, finish=?, remarks=?, timestamp=?, WHERE id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			if (card.getName() != null && !card.getName().equals("")) {
				pStmt.setString(1, card.getName());
			} else {
				pStmt.setString(1, null);
			}
			if (card.getPassword() != null && !card.getPassword().equals("")) {
				pStmt.setString(2, card.getPassword());
			} else {
				pStmt.setString(2, null);
			}
			if (card.getNumber() != 0 && card.getNumber() != 0) {
				pStmt.setInt(3, card.getNumber());
			} else {
				pStmt.setInt(3, 0);
			}
			if (card.getSecret() != null && !card.getSecret().equals("")) {
				pStmt.setString(4, card.getSecret());
			} else {
				pStmt.setString(4, null);
			}
			if (card.getBirthday() != null && !card.getBirthday().equals("")) {
				pStmt.setString(5, card.getBirthday());
			} else {
				pStmt.setInt(5, 0);
			}
			if (card.getLocation() != null && !card.getLocation().equals("")) {
				pStmt.setString(6, card.getLocation());
			} else {
				pStmt.setString(6, null);
			}
			if (card.getMotivation() != 0 && card.getMotivation() != 0) {
				pStmt.setInt(7, card.getMotivation());
			} else {
				pStmt.setInt(7, 0);
			}
			if (card.getIcon() != null && !card.getIcon().equals("")) {
				pStmt.setString(8, card.getIcon());
			} else {
				pStmt.setString(8, null);
			}
			if (card.getStart() != 0 && card.getStart() != 0) {
				pStmt.setInt(9, card.getStart());
			} else {
				pStmt.setInt(9, 0);
			}
			if (card.getFinish() != 0 && card.getFinish() != 0) {
				pStmt.setInt(10, card.getFinish());
			} else {
				pStmt.setInt(10, 0);
			}
			if (card.getRemarks() != null && !card.getRemarks().equals("")) {
				pStmt.setString(11, card.getRemarks());
			} else {
				pStmt.setString(11, null);
			}
			if (card.getTimestamp() != null && !card.getTimestamp().equals("")) {
				pStmt.setString(12, card.getTimestamp());
			} else {
				pStmt.setString(12, "currenttimestamp");
			}
			pStmt.setInt(13, card.getId());

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

	//4ナンバーとニックネームが一致しているか判断
	public boolean checkNumber(String name, int subject) throws Exception {
		Connection conn = null;
		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			String sql = "SELECT * FROM Users WHERE name =  ? AND number=  ? ";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// SQL文を完成させる
			pStmt.setString(1, name);
			pStmt.setInt(2, subject);

			// SQL文を実行し、結果表を取得する
			ResultSet rs = pStmt.executeQuery();

			// 結果表をコレクションにコピーする
			if (rs.next()) {
				return true;
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
		return false;
	}

	// ナンバーを新しい番号に更新する
	public void updateNumber(String name, int newsubject) throws Exception {
		Connection conn = null;
		try {
			//Connctionする
			conn = BaseDAO.conn();

			// SQL文を準備する
			String sql = "UPDATE Users SET number=? WHERE name=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SQL文を完成させる
			pStmt.setInt(1, newsubject);
			pStmt.setString(2, name);

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

	public boolean isLoginOK(Users u) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}
