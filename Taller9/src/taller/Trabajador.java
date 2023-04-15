package taller;

import java.util.Date;
import java.util.GregorianCalendar;

public class Trabajador {
	
	private String nombre;
	private double sueldo;
	private Date contrato;
	
	public Trabajador(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		contrato = calendario.getTime();
	}
	
	public Trabajador(String nom) {
		this(nom, 30000, 2000, 01, 01);
	}
	
	public String digiteNombre() {
		return nombre;
	}
	
	public double digiteSueldo() {
		return sueldo;
	}
	
	public Date digiteFechaContrato() {
		return contrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}
}