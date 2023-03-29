import java.sql.*;


public class UsoSingleton {

	public static void main(String[] args) {
		try{
			//Paso 1: Obtener una conexión
			Connection con =
					EjemploSingleton.getConnection();
			//paso 2: crear objeto statement
			Statement stmt=con.createStatement();
			//paso 3: ejecutar query
			ResultSet rs = stmt.executeQuery
					("select * from cliente");
			//paso 4: leer resultado registro a registro
			while(rs.next()) {
				System.out.println(rs.getInt(1) +
						" " + rs.getString(2) +
						" " + rs.getString(3));
			}
			//paso 5: cierra el objeto de conexión
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
