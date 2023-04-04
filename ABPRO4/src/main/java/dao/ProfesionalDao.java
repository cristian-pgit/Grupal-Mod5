package dao;

import java.sql.SQLException;
import java.util.List;

import model.Profesional;


public interface ProfesionalDao {

	public ProfesionalDao getProfesionalByd(Integer idUsuario);
	public List<Profesional> getAllProfesional();
	public void deleteProfesional(Profesional profesional);
	public void updateProfesional(Profesional profesional) throws SQLException;
	public void insertProfesional(Profesional profesional) throws SQLException;

	
}
