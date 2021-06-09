package ejerciciosLab3;

import ejerciciosLab2.Documento;

public class Profesor extends PersonaV4 {

	
	private double sueldo;
	
	public Profesor() {
		
	}
	public Profesor(String nombre,String apellido,int edad,Documento documento,double sueldo) {
		super(nombre,apellido,edad,documento);
		this.sueldo=sueldo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Profesor [sueldo=" + sueldo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", documento=" + documento + "]";
	}
	
}
