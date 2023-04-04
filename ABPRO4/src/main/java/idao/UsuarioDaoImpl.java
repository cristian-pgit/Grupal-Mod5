package idao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.SingletonImnot;
import dao.UsuarioDao;
import model.Usuario;

public class UsuarioDaoImpl implements UsuarioDao {

	private Connection conn;
	private Statement stm;
	private ResultSet rs;
	
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
				usu.setfNacimiento(rs.getString(3));
				usu.setRun(rs.getInt(4));
				usu.setUserName(rs.getString(2));
				usuarios.add(usu);
			}
			conn.close();
			
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
		// TODO Auto-generated method stub
		
	}

	private void initConnection() {
		conn = null;
		stm = null;
		rs = null;
		
	}
}
