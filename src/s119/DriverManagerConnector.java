package s119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerConnector {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe"; // 1521 è il numero di porta. Standard per
																				// Oracle.
	private static final String USER = "me";
	private static final String PASSWORD = "password";

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connected as " + conn.getSchema());

			String user = conn.getSchema();
			if (user == null) {
				user = conn.getCatalog();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}