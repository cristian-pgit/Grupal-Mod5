package conexion;

import java.sql.*;

public class SingletonImnot {
	// Propiedades
	private static Connection conn = null;
	// Constructor
	private SingletonImnot(){
		String url = "jdbc:mysql://localhost:3306/bdlydb";
		String driver = "com.mysql.cj.jdbc.Driver";
		String usuario = "root";
		String password = "root";
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
	} 
	

	

}
