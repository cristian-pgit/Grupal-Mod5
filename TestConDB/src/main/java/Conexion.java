import java.sql.*;

public class Conexion {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe",
						"usuario",
						"clave");
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery
				("select BANNER from SYS.V_$VERSION");
		while (rset.next())
			System.out.println
			(rset.getString(1));
		stmt.close();

	}

}
