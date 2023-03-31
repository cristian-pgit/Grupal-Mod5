package model;

import java.util.Date;

public class Capacitacion extends Usuario {
	
	private Integer idCapacitacion;
	private Integer rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private int duracion;
	private int cantAsist;
	
	
	public int getIdCapacitacion() {
		return idCapacitacion;
	}
	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}
	public Integer getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getCantAsist() {
		return cantAsist;
	}
	public void setCantAsist(int cantAsist) {
		this.cantAsist = cantAsist;
	}
	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantAsist=" + cantAsist + "]";
	}
	
	
	
	

}
