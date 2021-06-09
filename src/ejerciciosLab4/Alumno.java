package ejerciciosLab4;

import java.util.Arrays;
import java.util.Date;

import ejerciciosLab4.PersonaMainV5.TipoDoc;

public class Alumno extends PersonaV5 implements Iacciones {
	
	private Date fechaIngreso;
	private String[] ListaCurso;
	
	//TipoDoc tipoDoc;
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre,String apellido, TipoDoc tipoDoc,long numDoc,Date fechaNac,Date fechaIngreso, String[] ListaCurso) {
		super(nombre,apellido,tipoDoc,numDoc,fechaNac);
		this.fechaIngreso=fechaIngreso;
		this.ListaCurso=ListaCurso;
		
	}
	public String TipoPersona() {
		return "Nombre: "+ super.getNombre()+ ", Apellido: "+super.getApellido()+", Es Alumno";
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String[] getListaCurso() {
		return ListaCurso;
	}

	public void setListaCurso(String[] listaCurso) {
		ListaCurso = listaCurso;
	}

/*	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}*/

	@Override
	public String toString() {
		return "Alumno [fechaIngreso=" + fechaIngreso + ", ListaCurso=" + Arrays.toString(ListaCurso)  + ", Nombre= " + getNombre() + ", Apellido= " + getApellido() + ", TipoDoc= "
				+getTipoDoc()+ ", NumDoc= " + getNumDoc() + ", FechaNac= " + getFechaNac() + "]";
	}

	@Override
	public void guardar(Alumno alum) {
		
		
		System.out.println("guardado en la base de datos");
	}

	@Override
	public void modificar(Alumno alum) {
		
		System.out.println("MODIFICADO CON EXITO");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Alumno alum) {
		
		System.out.println("ELIMINADO CON EXITO");
		// TODO Auto-generated method stub
		
	}
	
	
	/*public static String devuelveString(String[] cursos) {
		String curso="";
		for(int i=0;i<cursos.length;i++) {
			curso+=cursos[i]+", ";
		}
		return curso;
	}*/
	

	

}
