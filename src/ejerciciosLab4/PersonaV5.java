package ejerciciosLab4;

import java.util.Date;

import Excepciones.documentoException;
import ejerciciosLab4.PersonaMainV5.TipoDoc;

public abstract class PersonaV5 {


	private String nombre;
	private String apellido;
	private TipoDoc tipoDoc;
	private long numDoc;
	private Date fechaNac;
	
	
	
	
	public PersonaV5() {
		
	}
	
	
	public PersonaV5(String nombre,String apellido,TipoDoc  tipoDoc,long numDoc,Date fechaNac) {
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.tipoDoc=tipoDoc;
		this.fechaNac=fechaNac;
		this.numDoc=numDoc;
	}
	
	public abstract String TipoPersona();

	@Override
	public String toString() {
		return "PersonaV5 [nombre=" + nombre + ", apellido=" + apellido + ", tipoDoc=" + tipoDoc.name() + ", numDoc=" + numDoc
				+ ", fechaNac=" + fechaNac + "]";
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public TipoDoc getTipoDoc() {
		return tipoDoc;
	}
	
	/*public String getTipoDoc() {
		return tipoDoc;
	}


	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}*/


	public long getNumDoc() {
		return numDoc;
	}


	public void setNumDoc(long numDoc) throws  documentoException{
		this.numDoc = numDoc;
	}


	public Date getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
	
}
