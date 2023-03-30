package dao;

import java.util.List;

import model.Usuario;

public interface UsuarioDao {

	public Usuario getUsuarioByIdUsuario(Integer idUsuario);
	public List<Usuario> getAllUsuario();
	public int deleteUsuario(Integer idUsuario);
	public int updateUsuario(Usuario usuario);
	public void insertUsuario(Usuario usuario);
}
