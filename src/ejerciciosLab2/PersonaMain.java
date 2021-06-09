package ejerciciosLab2;

import javax.swing.JOptionPane;

public class PersonaMain {

	public static void main(String[] args) {
		
		int cantP;
		cantP=Integer.parseInt(JOptionPane.showInputDialog("establezca el numero de personas a ingresar"));
		Persona[] personas=new Persona[cantP];
		
		
		
		for(int i=0;i<personas.length;i++) {
			
			String nombre=JOptionPane.showInputDialog("Ingrese Nombre");
			String apellido=JOptionPane.showInputDialog("Ingrese Apellido");
			String dni=JOptionPane.showInputDialog("ingrese tipo de documento");
			int dn=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de documento"));
			Persona aux=new Persona(nombre,apellido,dni,dn);
			personas[i]=aux;
		}
		
		
				for (Persona persona:personas) {
		
					System.out.println(persona);
					if(persona.getEdad()>18) {
						
						System.out.println("es mayor de edad");
					}
					else {
						System.out.println("es menor de edad");
					}
		}
		
		
	}

}
