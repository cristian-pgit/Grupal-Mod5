package implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.SingletonImnot;
import interfaces.UsuarioDAO;
import model.Usuario;

public class UsuarioDaoImpl implements UsuarioDAO {

	private Connection conn;
	private Statement stm;
	private ResultSet rs;
	private PreparedStatement st;
	
	@Override
	public Usuario getUsuarioByIdUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getAllUsuario() {
		String sql = "SELECT * FROM usuario;";
		initConnection();
		List<Usuario> usuarios = null;
		try 
		{
			conn = SingletonImnot.getConnection();
			stm = conn.createStatement();
			stm.executeQuery(sql);
			rs= stm.getResultSet();
			
			usuarios = new ArrayList<Usuario>();
			while (rs.next()) {
				Usuario usu = new Usuario();
				usu.setIdUsuario(rs.getInt(1));
				usu.setUserName(rs.getString(2));
				usu.setfNacimiento(rs.getDate(4));
				usu.setRun(rs.getInt(5));
				
				usuarios.add(usu);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
			
		return usuarios;
		
		
		
	}

	

	@Override
	public int deleteUsuario(Integer idUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertUsuario(Usuario usuario) {
		String sql = "INSERT INTO usuario (idUsuario, userName, password, fNacimiento, run) VALUES (?, ?, ?, ?, ?)";
		initConnection();
		try 
		{
			conn = SingletonImnot.getConnection();
			st = conn.prepareStatement(sql);
			st.setInt(1, usuario.getIdUsuario());
			st.setString(2, usuario.getUserName());
			st.setString(3, usuario.getPassword());
			st.setDate(4, new java.sql.Date(usuario.getfNacimiento().getTime()));
			st.setInt(5, usuario.getRun());
			st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}

	private void initConnection() {
		conn = null;
		stm = null;
		rs = null;
		st = null;
		
	}
}
