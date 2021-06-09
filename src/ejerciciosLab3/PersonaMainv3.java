package ejerciciosLab3;

import javax.swing.JOptionPane;

import ejerciciosLab2.Documento;

public class PersonaMainv3 {

	public static void main(String[] args) {

		int cantper=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de personas a registrar"));
		PersonaV3 [] personasv3=new PersonaV3[cantper];
		
		for(int i=0; i<personasv3.length;i++) {
			
			
			String nombre=JOptionPane.showInputDialog("Ingrese Nombre");
			String apellido=JOptionPane.showInputDialog("Ingrese Apellido");
			int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad"));
			String 	Tdni=JOptionPane.showInputDialog("Ingrese tipo de documento");
			int Ndni=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de documento"));
			Documento documento= new Documento(Tdni,Ndni);
			PersonaV3 aux=new PersonaV3(nombre,apellido,edad,documento);
			personasv3[i]=aux;
			
			
		}
		
		for(PersonaV3 persona:personasv3) {
			
			System.out.println(persona);
		}
		
		
		
	}

}
