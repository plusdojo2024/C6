package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {

	public static Connection conn() throws Exception {
		//connectionの作成
		Class.forName("org.h2.Driver");

		String dbUrl = "jdbc:h2:file:C:/pleiades/workspace/data/simpleBC";
		String dbName = "sa";
		String dbPw = "";
		Connection conn;

		try {
			conn = DriverManager.getConnection(dbUrl, dbName, dbPw);
			return conn;

		} catch (Exception e) {
			throw e;
		}
	}
}
