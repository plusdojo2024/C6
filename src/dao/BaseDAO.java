package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {

	public static Connection conn() throws ClassNotFoundException {
		Connection conn = null;

		//connectionの作成
		Class.forName("org.h2.Driver");

		try {
			String dbUrl = "jdbc:h2:file:C:/pleiades/workspace/data/c6";
			String dbName = "sa";
			String dbPw = "";
//			Connection conn;

			conn = DriverManager.getConnection(dbUrl, dbName, dbPw);
//			return conn;

		} catch (Exception e) {
			e.printStackTrace();
//			throw e;
		}
		return conn;

	}
}
