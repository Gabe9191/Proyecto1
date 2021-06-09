package ejerciciosLab3;


import java.util.ArrayList;
import java.util.List;

import ejerciciosLab2.Documento;

public class HerenciaMain {


	public static void main(String[] args) {

	List<Alumnos> alumnos=new ArrayList<Alumnos>();
	String[] cursos= {"LENGUA","MATEMATICAS","FISICA","FILOSOFIA"};
	String ListaCursos=Alumnos.devuelString(cursos);
	System.out.println(ListaCursos);
	Documento Documento;
	Alumnos alumno1=new Alumnos("Gabriel","Barrientos",29,Documento=new Documento("DNI",35993898),ListaCursos); 
	Alumnos alumno2=new Alumnos("ana","casino",19,Documento=new Documento("DNI",3543898),ListaCursos); 
	Alumnos alumno3=new Alumnos("paco","gonzales",39,Documento=new Documento("DNI",3543438),ListaCursos); 
	alumnos.add(alumno1);
	alumnos.add(alumno2);
	alumnos.add(alumno3);
	
	for(Alumnos alumno:alumnos) {
		System.out.println(alumno+"\n");
	}
		
		
	}

}
