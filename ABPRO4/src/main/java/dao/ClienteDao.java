package dao;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;

public interface ClienteDao {
	

	public Cliente getClienteById(Integer idUsuario);
	public List<Cliente> getAllCliente();
	public void deleteCliente(Cliente cliente);
	public void updateCliente(Cliente cliente) throws SQLException;
	public void insertCliente(Cliente cliente);

}
