package implementacion;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.SingletonImnot;
import interfaces.ProfesionalDao;
import model.Profesional;

public class ProfesionalDaoImpl implements ProfesionalDao {
	private Connection conn;
	private Statement stm;
	private ResultSet rs;
	private PreparedStatement st;


	@Override
	public ProfesionalDao getProfesionalByd(Integer idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profesional> getAllProfesional() {
		String sql = "SELECT u.idUsuario, u.userName, u.fNacimiento, u.run, p.id_Usuario, p.TituloProfesional, p.fechaIngreso, p.id_Profesional\r\n"
				+ "FROM usuario u\r\n"
				+ "INNER JOIN profesional p ON u.idUsuario = p.id_Usuario\r\n"
				+ "";
		initConnection();
		List<Profesional> profesionales = null;

		try {
			conn = SingletonImnot.getConnection();
			stm = conn.createStatement();
			stm.executeQuery(sql);
			rs = stm.getResultSet();

			profesionales = new ArrayList<Profesional>();
			while (rs.next()) {
				Profesional pro = new Profesional();
				pro.setIdUsuario(rs.getInt(1));
				pro.setUserName(rs.getString(2));
				pro.setfNacimiento(rs.getString(4));
				pro.setRun(rs.getInt(rs.getInt(5)));
				pro.setIdProfesional(rs.getInt(6));
				pro.setTituloPofesional(rs.getString(7));
				pro.setFechaIngreso(rs.getString(8));
				profesionales.add(pro);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return profesionales;
	}

	@Override
	public void deleteProfesional(Profesional profesional) {
		String sql = "DELETE FROM profesional WHERE idUsuario = ?";
		initConnection();
		try {
			conn = SingletonImnot.getConnection();
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setInt(1, profesional.getIdProfesional());
			stm.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateProfesional(Profesional profesional) throws SQLException {
		String sql = "  UPDATE usuario u\r\n" + "INNER JOIN profesional p ON u.idUsuario = p.id_Usuario\r\n"
				+ "SET u.userName = ?, u.fNacimiento = ?, u.run = ?,\r\n"
				+ "    p.TituloProfesional = ?, p.fechaIngreso = ?, p.id_Profesional = ?\r\n"
				+ "WHERE u.idUsuario = ? AND p.id_Profesional = ?";
		try {
			initConnection();
			conn = SingletonImnot.getConnection();
			PreparedStatement stm = conn.prepareStatement(sql);

			// parte de usuario
			stm.setInt(1, profesional.getIdUsuario());
			stm.setString(2, profesional.getUserName());
			stm.setString(4, profesional.getfNacimiento());
			stm.setInt(5, profesional.getRun());
			// parte de profesional
			stm.setInt(6, profesional.getIdProfesional());
			stm.setString(7, profesional.getTituloPofesional());
			stm.setString(8, profesional.getFechaIngreso());
			stm.executeUpdate();
			conn.close();
			stm.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}

	@Override
	public void insertProfesional(Profesional profesional) throws SQLException {
		// TODO Auto-generated method stub
		String sql ="\r\n"
				+ "INSERT INTO usuario (idUsuario, userName, fNacimiento, run) VALUES (?, ?, ?, ?);\r\n"
				+ "INSERT INTO profesional (id_Usuario, TituloProfesional, fechaIngreso, id_Profesional) VALUES (?, ?, ?, ?)";
		initConnection();
		try {
			conn = SingletonImnot.getConnection();
			PreparedStatement stm = conn.prepareStatement(sql);
			// parte de usuario
			stm.setInt(1, profesional.getIdUsuario());
			stm.setString(2, profesional.getUserName());
			stm.setString(4, profesional.getfNacimiento());
			stm.setInt(5, profesional.getRun());
			//parte Profesional
			stm.setInt(6, profesional.getIdProfesional());
			stm.setString(7, profesional.getTituloPofesional());
			stm.setString(8, profesional.getFechaIngreso());
			stm.setInt(9, profesional.getIdProfesional());
			stm.executeUpdate();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			conn.close();
		}
		
		
		
	}


	

	private void initConnection() {
		conn = null;
		stm = null;
		rs = null;
		st=null;
	}

}
