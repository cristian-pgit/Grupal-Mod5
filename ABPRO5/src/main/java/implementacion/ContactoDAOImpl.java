package implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

import conexion.SingletonImnot;
import interfaces.ContactoDAO;
import model.Contacto;

public class ContactoDAOImpl implements ContactoDAO {

	private Connection conn;
	private Statement stm;
	private ResultSet rs;
	private PreparedStatement st;
	
	@Override
	public List<Contacto> getAllMensajes() {
		
		return null;
	}

	@Override
	public void insertContacto(Contacto contacto) {
		String sql= "INSERT INTO contacto (nombres, apellidos, email, telefono, mensaje) VALUES (?, ?, ?, ?, ?)";
		initConnection();
		try {
			conn= SingletonImnot.getConnection();
			st = conn.prepareStatement(sql);
			st.setString(1, contacto.getNombres());
			st.setString(2, contacto.getApellidos());
			st.setString(3, contacto.getEmail());
			st.setInt(4, contacto.getTelefono());
			st.setString(5, contacto.getMensaje());
			st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	private void initConnection() {
		conn= null;
		stm= null;
		rs= null;
		st= null;
		
	}
	
	

}
