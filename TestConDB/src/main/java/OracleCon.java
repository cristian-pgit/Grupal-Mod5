import java.sql.*;


public class OracleCon {

	public static void main(String[] args) {
		try{
			//paso 1: carga la clase del controlador
			Class.forName
			("oracle.jdbc.driver.OracleDriver");
			//paso 2: crear la conexión con el objeto
			Connection con=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"usuario",
					"clave");
			//paso 3: crear objeto statement
			Statement stmt=con.createStatement();
			//paso 4: ejecutar query
			ResultSet rs = stmt.executeQuery
					("select * from cliente");
			//paso 5: leer resultado registro a registro
			while(rs.next()) {
				System.out.println(rs.getInt(1) +
						" " + rs.getString(2) +
						" " + rs.getString(3));
			}
			//paso 6: cierra el objeto de conexión
			con.close();
		}
		catch(Exception e){
			System.out.println(e);


		}

	}
}
