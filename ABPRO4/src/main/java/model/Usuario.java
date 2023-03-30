package model;

import java.util.Date;

public class Usuario {

	private Integer idUsuario;
	private String userName;
	private Date fNacimiento;
	private Integer run;
	
	
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
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", userName=" + userName + ", fNacimiento=" + fNacimiento + ", run="
				+ run + "]";
	}
	
	
}
