package interfaces;

import java.util.List;

import model.Capacitacion;

public interface CapacitacionDAO {
	
	public Capacitacion getCapacitacionByIdCapacitacion(Integer idCapa);
	public List<Capacitacion> getAllCapacitaciones();
	public int deleteCapacitacion(Integer idCapa);
	public int updateCapacitacion(Capacitacion capacitacion);
	public void insertCapacitacion(Capacitacion capacitacion);

}
