package model;

import java.util.Date;

public class Cliente extends Usuario {

	/*
	 * id_Usuario` int NOT NULL, `RutCliente` varchar(45) NOT NULL, `Nombres`
	 * varchar(45) DEFAULT NULL, `Apellidos` varchar(45) DEFAULT NULL, `telefono`
	 * int DEFAULT NULL, `Afp` varchar(45) DEFAULT NULL, `SistemaDeSalud` int
	 * DEFAULT NULL, `Direccion` varchar(45) DEFAULT NULL, `Comuna` varchar(45)
	 * DEFAULT NULL, `Edad` int DEFAULT NULL,
	 */
	private Integer rutCliente;
	private String nombres;
	private String apellidos;
	private Integer telefono;
	private String afp;
	private Integer sds;
	private String direccion;
	private String comuna;
	private Integer edad;

	// contructor vacio
	public Cliente() {
	}

	public Cliente(Integer idUsuario, String userName, String password, String fNacimiento, Integer run,String perfil,
			Integer rutCliente, String nombres, String apellidos, Integer telefono, String afp, Integer sds,
			String direccion, String comuna, Integer edad) {
		super(idUsuario, userName, password, fNacimiento, run,perfil);
		this.rutCliente = rutCliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sds = sds;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public Integer getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public Integer getSds() {
		return sds;
	}

	public void setSds(Integer sds) {
		this.sds = sds;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return super.getUserName() + "Cliente :rutCliente=" + rutCliente + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", telefono=" + telefono + ", afp=" + afp + ", sds=" + sds + ", direccion=" + direccion
				+ ", comuna=" + comuna + ", edad=" + edad;
	}

}
