import java.sql.*;

public class EjemploSingleton {

	//atributo
	private static Connection conn = null;

	// Constructor
	private EjemploSingleton(){
		String url =
				"jdbc:oracle:thin:@3306:bdlydb";
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
			new EjemploSingleton();
		}
		return conn;
	} // Fin getConnection

}
