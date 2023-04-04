package model;

import java.util.Date;

public class Usuario {

	private Integer idUsuario;
	private String userName;
	private String password;
	private Date fNacimiento;
	private Integer run;
	private String perfil;
	
	public Usuario() {}
	
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getfNacimiento() {
		return fNacimiento;
	}
	public void setfNacimiento(Date fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	public Integer getRun() {
		return run;
	}
	public void setRun(Integer run) {
		this.run = run;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		public String getPerfil() {
		return perfil;
	}


	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}


		@Override
	public String toString() {
		return "Id Usuario: " + idUsuario + 
				"\nNombre de Usuario: " + userName + 
				"\nFecha de Nacimiento: " + fNacimiento + 
				"\nRun: " + run;
	}
	
}
