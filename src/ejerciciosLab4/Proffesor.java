package ejerciciosLab4;

import java.util.Date;

import ejerciciosLab4.PersonaMainV5.TipoDoc;

public class Proffesor extends Empleado implements IaccionesEmp {
	
	public 	Proffesor() {
		super();
	}
	
	public Proffesor(String nombre,String apellido,TipoDoc tipoDoc,long numDoc,Date fechaNac,Date fechaCargo, float sueldo) {
		super(nombre,apellido,tipoDoc,numDoc,fechaNac,fechaCargo,sueldo);
	}

	@Override
	public String toString() {
		return "Director [FechaCargo= " + getFechaCargo() + ", Sueldo= " + getSueldo() + ", Nombre= "
				+ getNombre() + ", Apellido= " + getApellido() + ", Tipo Documento= " + getTipoDoc() + ", NumDoc= "
				+ getNumDoc() + ", FechaNac= " + getFechaNac() + "]";
	}
	
	
	public String TipoPersona() {
		return "Nombre: "+ super.getNombre()+ ", Apellido: "+super.getApellido()+", Es Profesor";
	}

	@Override
	public void guardar(Empleado emple) {
		// TODO Auto-generated method stub
		System.out.println("guardado en la base de datos");
	}

	@Override
	public void modificar(Empleado emple) {
		// TODO Auto-generated method stub
		System.out.println("MODIFICADO CON EXITO");
	}

	@Override
	public void eliminar(Empleado emple) {
		// TODO Auto-generated method stub
		System.out.println("ELIMINADO CON EXITO");
	}


}
