package ejerciciosLab4;

import java.util.Date;


public abstract class Empleado extends PersonaV5 {
	
	private Date fechaCargo;
	private float sueldo;

	public Empleado() {
		
	}
	
	public Empleado(String nombre,String apellido,TipoDoc tipoDoc,long numDoc,Date fechaNac,Date fechaCargo, float sueldo) {
		super(nombre,apellido,tipoDoc,numDoc,fechaNac);
		
		this.fechaCargo=fechaCargo;
		this.sueldo=sueldo;
	}

	public Date getFechaCargo() {
		return fechaCargo;
	}

	public void setFechaCargo(Date fechaCargo) {
		this.fechaCargo = fechaCargo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	
	
	
}
