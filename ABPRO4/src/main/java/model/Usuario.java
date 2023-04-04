package model;

import java.util.Date;

public class Usuario {

	private Integer idUsuario;
	private String userName;
	private String password;
	private String fNacimiento;
	private Integer run;

	public Usuario() {

	}

	public Usuario(Integer idUsuario, String userName, String password, String fNacimiento, Integer run) {
		this.idUsuario = idUsuario;
		this.userName = userName;
		this.password = password;
		this.fNacimiento = fNacimiento;
		this.run = run;
	}

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

	public String getfNacimiento() {
		return fNacimiento;
	}

	public void setfNacimiento(String string) {
		this.fNacimiento = string;
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

	@Override
	public String toString() {
		return "Id Usuario: " + idUsuario + "\nNombre de Usuario: " + userName + "\nFecha de Nacimiento: " + fNacimiento
				+ "\nRun: " + run;
	}

}
