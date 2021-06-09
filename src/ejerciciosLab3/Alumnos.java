package ejerciciosLab3;

import ejerciciosLab2.Documento;

public class Alumnos extends PersonaV4 {
	
	public static int id=0;
	private int ids;
	private String[] cursos;
	private String listaDecursos;
	public  Alumnos() {
		
	}
	public Alumnos(String nombre,String apellido,int edad,Documento documento,String listaDecursos) {
		
		super(nombre,apellido,edad,documento);
		this.listaDecursos=listaDecursos;
		id++;
		ids=id;
		
		
	}
	
	public static String devuelString(String [] cursos) {
	
		String cadena="";
		for (int i=0;i<cursos.length;i++) {
			
			cadena+=cursos[i]+" ";
			
		}
		return cadena;
		
	}


	public int getIds() {
		return ids;
	}



	public String[] getCursos() {
		return cursos;
	}


	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
	public String toString() {
		
		return "Nombre: "+super.getNombre()+", Apellido: "+super.getApellido()+", Edad: "+super.getEdad()+", Documento: " +super.getDocumento()+", ID: "+ids+", Cursos: "+listaDecursos;
	}

}
