package ejerciciosLab3;

import ejerciciosLab2.Documento;
public class PersonaV3 {
	
	public static int id=0;
	private int ids;
	private String nombre;
	private String apellido;
	private int edad;
	private Documento documento;

	public PersonaV3() {
		
	}
	
	public PersonaV3(String nombre,String apellido,int edad,Documento documento) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.documento=documento;
		id++;
		ids=id;
		
	}

	public int getIds() {
		return ids;
	}

	public void setIds(int ids) {
		this.ids = ids;
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
		return "PersonaV3 [ids=" + ids + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", documento=" + documento + "]";
	}

	
	
	
}
