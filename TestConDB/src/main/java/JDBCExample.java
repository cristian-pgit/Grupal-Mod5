import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCExample {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection
					(
							"jdbc:oracle:thin:@localhost:1521:xe",
							"usuario",
							"clave"
							);
			if (conn != null) {
				System.out.println("Conexión correcta!");
			} else {
				System.out.println("Fallo en la conexión!");
			}
		} catch (SQLException e) {
			System.err.format(
					"SQL State: %s\n%s",
					e.getSQLState(),
					e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
