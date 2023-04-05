package model;



public class Profesional extends Usuario {
	private int idProfesional;
	private String tituloProfesional;
	private String fechaIngreso;

//contructor vacio
	public Profesional() {

	}

//contructor que herera de usuario
	public Profesional(Integer idUsuario, String userName, String password, String fNacimiento, Integer run,
			int idProfesional, String tituloPofesional, String fechaIngreso) {
		super();
		this.idProfesional = idProfesional;
		this.tituloProfesional = tituloPofesional;
		this.fechaIngreso = fechaIngreso;
	}

	public int getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}

	public String getTituloPofesional() {
		return tituloProfesional;
	}

	public void setTituloPofesional(String tituloPofesional) {
		this.tituloProfesional = tituloPofesional;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Profesional : " + super.toString() + " idProfesional=" + idProfesional + ", tituloPofesional="
				+ tituloProfesional + ", fechaIngreso=" + fechaIngreso + "]";
	}

}
