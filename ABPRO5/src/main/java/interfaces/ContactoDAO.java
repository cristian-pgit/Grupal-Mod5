package interfaces;

import java.util.List;

import model.Contacto;

public interface ContactoDAO {

	public List<Contacto> getAllMensajes();
	public void insertContacto (Contacto contacto);
	
}
