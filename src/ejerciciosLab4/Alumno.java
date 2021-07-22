package ejerciciosLab4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import Conecction.ConectarBDD;
import Excepciones.GenericDAOEXeption;


public class Alumno extends PersonaV5 implements Iacciones, Comparator<Alumno>{
	
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
		return "ALUMNO";
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
	

	public Alumno CrearAlumno(Alumno alumno)throws Exception,GenericDAOEXeption  {
		
		Connection coneccion;
		
		try {
			coneccion=ConectarBDD.obtenerconexion();
			
			String sql="INSERT INTO ejercicios VALUES(?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst=coneccion.prepareStatement(sql);
			pst.setString(1,alumno.getNombre() );
			pst.setString(2, alumno.getApellido());
			pst.setLong(3, alumno.getNumDoc() );
			pst.setDate(4, (java.sql.Date) alumno.getFechaNac());
			pst.setDate(5,(java.sql.Date) alumno.getFechaIngreso());
			pst.setFloat(6, 0);
			pst.setArray(7, null);
			String Tdc=alumno.getTipoDoc().toString();
			pst.setString(8, Tdc);
			pst.setString(9, alumno.TipoPersona());
			
		} catch (Exception e) {
		
			throw new GenericDAOEXeption("NO se ah podido conectar a la Base de datos",e);}
		
		
			return alumno;	}
	
	public void cerrarconexion(Connection coneccion) throws GenericDAOEXeption{
		
		try {
			if (coneccion!=null && !coneccion.isClosed()) {
				coneccion.close();
			}
		} catch (SQLException e) {

			throw new GenericDAOEXeption("no se puede cerrar la coneccion",e);		}
		
		
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

	@Override
	public int compare(Alumno o1, Alumno o2) {
		String ape=o1.getApellido();
		String ape2=o2.getApellido();
		
		
		return ape.compareTo(ape2) ;
	}

	
	
	/*public static String devuelveString(String[] cursos) {
		String curso="";
		for(int i=0;i<cursos.length;i++) {
			curso+=cursos[i]+", ";
		}
		return curso;
	}*/
	

	

}
