package ejerciciosLab2;

public class Persona {

	private String nombre;
	private String apellido;
	private String tipoDni;
	private int Ndocumento;
	private int edad;
	private Documento documento;
	
	public Persona() {
		
	}
	
	
	public Persona (String nombre,String apellido,String tipoDni,int Ndocumento) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.tipoDni=tipoDni;
		this.Ndocumento=Ndocumento;
		edad=(int)(Math.random()*100);
	}

	public Persona (String nombre,String apellido,int edad,Documento documento) {
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


	public String getTipoDni() {
		return tipoDni;
	}


	public void setTipoDni(String tipoDni) {
		this.tipoDni = tipoDni;
	}


	public int getNdocumento() {
		return Ndocumento;
	}


	public void setNdocumento(int ndocumento) {
		Ndocumento = ndocumento;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	/*@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", tipoDni=" + tipoDni + ", Ndocumento="
				+ Ndocumento + ", edad=" + edad + "]";
	}*/


	@Override
	public String toString() {
		return "Persona nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad +" "+ documento;
	}

	
	
	
}
