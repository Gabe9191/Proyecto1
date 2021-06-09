package ejerciciosLab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.swing.JOptionPane;

import Excepciones.documentoException;
import ejerciciosLab4.Enums.TipoDoc;

public class PersonaMainV5 {
	public enum TipoDoc{
		DNI,CEDULA,LIBRETA;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cursos;
		 Alumno alumno;
		Director director;
		Proffesor profesor;
		int opcion,opcdoc;
		String nombre,apellido;	
		long numDoc;
		float sueldo;
		Date fechaNac,fechaCargo,fechaIng;
		String sfechaNac,sfechaCargo,sfechaIng;
		String curso;
		int decision;
		TipoDoc Tdoc = null;
		
		
		do {
		JOptionPane.showMessageDialog(null,"Elija el tipo de persona a ingresar"+"\n"+"1-Alumno"+"\n"+"2-Profesor"+"\n"+"3-Director");
		
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Opcion"));
		
		switch(opcion) {
		
		case 1:JOptionPane.showMessageDialog(null,"Ingrese los datos del alumno");
		nombre=JOptionPane.showInputDialog("Nombre");
		apellido=JOptionPane.showInputDialog("Apellido");
		opcdoc=Integer.parseInt(JOptionPane.showInputDialog("Tipo de documento 1-DNI,2-CEDULA,3-LIBRETA"));
		switch(opcdoc) {
		case 1:Tdoc=TipoDoc.DNI;
		break;
		case 2:Tdoc=TipoDoc.CEDULA;
		break;
		case 3:Tdoc=TipoDoc.LIBRETA;
		break;
		default :JOptionPane.showMessageDialog(null,"ingrese una opcion valida");
		break;
		}
		numDoc=Long.parseLong(JOptionPane.showInputDialog("Numero de documento"));
		long n=(long)numDoc;
		System.out.println(n);
		sfechaNac=JOptionPane.showInputDialog("Ingrese fecha de nacimiento");
		fechaNac=conversiones.ConvertirStringEnDate(sfechaNac);
		sfechaIng=JOptionPane.showInputDialog("Ingrese fecha de ingreso");
		fechaIng=conversiones.ConvertirStringEnDate(sfechaIng);
		cursos=new String[Integer.parseInt(JOptionPane.showInputDialog("ingrese cursos"))] ;
		for(int i=0;i<cursos.length;i++) {
		curso=JOptionPane.showInputDialog("ingrese materias");
		cursos[i]=curso;
		}
		
		alumno=new Alumno(nombre,apellido,Tdoc,n,fechaNac,fechaIng,cursos);
		JOptionPane.showMessageDialog(null,alumno.toString());
		alumno.guardar(alumno);

		break;
		case 2: JOptionPane.showMessageDialog(null,"Ingrese los datos del Profesor");
		nombre=JOptionPane.showInputDialog("Nombre");
		apellido=JOptionPane.showInputDialog("Apellido");
		opcdoc=Integer.parseInt(JOptionPane.showInputDialog("Tipo de documento 1-DNI,2-CEDULA,3-LIBRETA"));
		switch(opcdoc) {
		case 1:Tdoc=TipoDoc.DNI;
		break;
		case 2:Tdoc=TipoDoc.CEDULA;
		break;
		case 3:Tdoc=TipoDoc.LIBRETA;
		break;
		default :JOptionPane.showMessageDialog(null,"ingrese una opcion valida");
		break;
		}
		numDoc=Integer.parseInt(JOptionPane.showInputDialog("Numero de documento"));
		sfechaNac=JOptionPane.showInputDialog("Ingrese fecha de nacimiento");
		fechaNac=conversiones.ConvertirStringEnDate(sfechaNac);
		sfechaCargo=JOptionPane.showInputDialog("Ingrese fecha de ingreso");
		fechaCargo=conversiones.ConvertirStringEnDate(sfechaCargo);
		sueldo=Float.parseFloat(JOptionPane.showInputDialog("Ingrese sueldo"));
		profesor=new Proffesor(nombre,apellido,Tdoc,numDoc,fechaNac,fechaCargo,sueldo);
		JOptionPane.showMessageDialog(null,profesor.toString());
		profesor.guardar(profesor);
		break;
		case 3:JOptionPane.showMessageDialog(null,"Ingrese los datos del Director");
		nombre=JOptionPane.showInputDialog("Nombre");
		apellido=JOptionPane.showInputDialog("Apellido");
		opcdoc=Integer.parseInt(JOptionPane.showInputDialog("Tipo de documento 1-DNI,2-CEDULA,3-LIBRETA"));
		switch(opcdoc) {
		case 1:Tdoc=TipoDoc.DNI;
		break;
		case 2:Tdoc=TipoDoc.CEDULA;
		break;
		case 3:Tdoc=TipoDoc.LIBRETA;
		break;
		default :JOptionPane.showMessageDialog(null,"ingrese una opcion valida");
		break;
		}
		numDoc=Integer.parseInt(JOptionPane.showInputDialog("Numero de documento"));
		sfechaNac=JOptionPane.showInputDialog("Ingrese fecha de nacimiento");
		fechaNac=conversiones.ConvertirStringEnDate(sfechaNac);
		sfechaCargo=JOptionPane.showInputDialog("Ingrese fecha de ingreso");
		fechaCargo=conversiones.ConvertirStringEnDate(sfechaCargo);
		sueldo=Float.parseFloat(JOptionPane.showInputDialog("Ingrese sueldo"));
		director=new Director(nombre,apellido,Tdoc,numDoc,fechaNac,fechaCargo,sueldo);
		JOptionPane.showMessageDialog(null,director.toString());
		director.guardar(director);
		break;
		default:JOptionPane.showMessageDialog(null,"ingrese una opcion valida");
		break;
		}
		
			
		
		decision=JOptionPane.showConfirmDialog(null,"Continuar agregando personas???");
		
		
		}
        while(decision!=1&& decision!=2);
		
		
		
	}

}
