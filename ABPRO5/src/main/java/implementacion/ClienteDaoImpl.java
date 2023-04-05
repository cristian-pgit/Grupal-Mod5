package implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.SingletonImnot;
import interfaces.*;
import model.Cliente;

public class ClienteDaoImpl implements ClienteDao {

	private Connection conn;
	private Statement stm;
	private ResultSet rs;

	@Override
	public Cliente getClienteById(Integer idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getAllCliente() {
		// TODO Auto-generated method stub
		String sql = "SELECT * \r\n"
				+ "FROM usuario u\r\n"
				+ "INNER JOIN cliente c ON u.idUsuario = c.id_Usuario";		
		initConnection();
		List<Cliente> clientes = null;

		try {
			conn = SingletonImnot.getConnection();
			stm = conn.createStatement();
			stm.executeQuery(sql);
			rs = stm.getResultSet();

			clientes = new ArrayList<Cliente>();
			while (rs.next()) {
				Cliente cli = new Cliente();

				cli.setIdUsuario(rs.getInt(1));
				cli.setRutCliente(rs.getInt(2));
				cli.setNombres(rs.getString(3));
				cli.setApellidos(rs.getString(4));
				cli.setTelefono(rs.getInt(5));
				cli.setAfp(rs.getString(5));
				cli.setSds(rs.getInt(6));
				cli.setDireccion(rs.getString(7));
				cli.setComuna(rs.getString(8));
				cli.setEdad(rs.getInt(9));

				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientes;
	}

	@Override
	public void deleteCliente(Cliente cliente) {
		String sql = "DELETE FROM cliente WHERE idUsuario = ?";
		initConnection();
		try {
			conn = SingletonImnot.getConnection();
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setInt(1, cliente.getIdUsuario());
			stm.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateCliente(Cliente cliente) throws SQLException {
		String sql = "UPDATE cliente\r\n" + "INNER JOIN usuario ON cliente.id_Usuario = usuario.idUsuario\r\n"
				+ "SET cliente.RutCliente = ?,\r\n" + "    cliente.Nombres = ?,\r\n" + "    cliente.Apellidos = ?,\r\n"
				+ "    cliente.telefono = ?,\r\n" + "    cliente.Afp = ?,\r\n" + "    cliente.SistemaDeSalud = ?,\r\n"
				+ "    cliente.Direccion =?,\r\n" + "    cliente.Comuna = ?,\r\n" + "    cliente.Edad = ?,\r\n"
				+ "    usuario.userName = ?,\r\n" + "    usuario.fNacimiento = ?,\r\n" + "    usuario.run =?\r\n"
				+ "WHERE cliente.id_Usuario = ? AND cliente.RutCliente = ?";
		try {
			initConnection();
			conn = SingletonImnot.getConnection();
			PreparedStatement stm = conn.prepareStatement(sql);

			// parte de usuario
			stm.setInt(1, cliente.getIdUsuario());
			stm.setString(2, cliente.getUserName());
			stm.setString(4, cliente.getfNacimiento());
			stm.setInt(5, cliente.getRun());
			// parte cliente
			stm.setInt(6, cliente.getRutCliente());
			stm.setString(7, cliente.getNombres());
			stm.setString(8, cliente.getApellidos());
			stm.setInt(9, cliente.getTelefono());
			stm.setString(10, cliente.getAfp());
			stm.setInt(11, cliente.getSds());
			stm.setString(12, cliente.getDireccion());
			stm.setString(13, cliente.getComuna());
			stm.setInt(14, cliente.getEdad());
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
	public void insertCliente(Cliente cliente) {
		String sql = "\r\n" + "INSERT INTO usuario (idUsuario, userName, fNacimiento, run) VALUES (?, ?, ?, ?);"
				+ "INSERT INTO cliente (id_Usuario, TituloProfesional, fechaIngreso, id_Profesional) VALUES (?, ?, ?, ?)";
		initConnection();
		try {
			conn = SingletonImnot.getConnection();
			PreparedStatement stm = conn.prepareStatement(sql);
			// parte de usuario
			stm.setInt(1, cliente.getIdUsuario());
			stm.setString(2, cliente.getUserName());
			stm.setString(4, cliente.getfNacimiento());
			stm.setInt(5, cliente.getRun());
			// parte cliente
			stm.setInt(6, cliente.getRutCliente());
			stm.setString(7, cliente.getNombres());
			stm.setString(8, cliente.getApellidos());
			stm.setInt(9, cliente.getTelefono());
			stm.setString(10, cliente.getAfp());
			stm.setInt(11, cliente.getSds());
			stm.setString(12, cliente.getDireccion());
			stm.setString(13, cliente.getComuna());
			stm.setInt(14, cliente.getEdad());
			stm.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void initConnection() {
		conn = null;
		stm = null;
		rs = null;

	}

}
