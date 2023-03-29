package conexion;

import java.sql.*;

public class SingletonImnot {
	// Propiedades
	private static Connection conn = null;
	// Constructor
	private SingletonImnot(){
		String url =
				"jdbc:oracle:thin:@localhost:3306:bdlydb";
		String driver =
				"oracle.jdbc.driver.OracleDriver";
		String usuario = "usuario";
		String password = "clave";
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection
					(url, usuario, password);
		}
		catch (ClassNotFoundException
				| SQLException e){
			e.printStackTrace();
		}
	} // Fin constructor
	
	// Métodos
	public static Connection getConnection(){
		if (conn == null){
			new SingletonImnot();
		}
		return conn;
	} // Fin getConnection
	

}
