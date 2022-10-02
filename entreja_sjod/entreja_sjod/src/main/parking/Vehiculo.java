package main.parking;

import java.util.Date;

public class Vehiculo {
	private String sMatricula;
	private Date dFecha_ini;
	private Date dFecha_fin;
	
	// Constructor
	public Vehiculo(String paramMatricula, Date paramFecha_ini, Date paramFecha_fin) {
		super();
		this.sMatricula = paramMatricula;
		this.dFecha_ini = paramFecha_ini;
		this.dFecha_fin = paramFecha_fin;
	}
	public Vehiculo(String paramMatricula) {
		super();
		this.sMatricula = paramMatricula;
	}

	// To String
	@Override
	public String toString() {
		return "Vehiculo [sMatricula=" + sMatricula + ", dFecha_ini=" + dFecha_ini + ", dFecha_fin=" + dFecha_fin + "]";
	}

	// GETTERS Y SETTERS
	public String getsMatricula() {
		return sMatricula;
	}

	public void setsMatricula(String sMatricula) {
		this.sMatricula = sMatricula;
	}

	public Date getdFecha_ini() {
		return dFecha_ini;
	}

	public void setdFecha_ini(Date dFecha_ini) {
		this.dFecha_ini = dFecha_ini;
	}

	public Date getdFecha_fin() {
		return dFecha_fin;
	}

	public void setdFecha_fin(Date dFecha_fin) {
		this.dFecha_fin = dFecha_fin;
	}
	
}
