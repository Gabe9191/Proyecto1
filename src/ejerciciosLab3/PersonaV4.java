package ejerciciosLab3;

import ejerciciosLab2.Documento;

public abstract class PersonaV4 {
	
	
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected Documento documento;
	
	
	public PersonaV4() {
		
	}

	public PersonaV4(String nombre,String apellido,int edad,Documento documento) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.documento=documento;
		
		
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "PersonaV4 [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento
				+ "]";
	}
	
	
}
