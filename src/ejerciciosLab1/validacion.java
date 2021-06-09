package ejerciciosLab1;

import javax.swing.JOptionPane;

public class validacion {

	public static void main(String[] args) {

	String usuario;
	String clave;
	
	usuario=JOptionPane.showInputDialog("ingrese usuario");
	
	
	
	if(usuario.equals("gabe91")) {
		
		clave=JOptionPane.showInputDialog("ingrese clave");
		if(clave.equals("mycore")) { 
			System.out.println("Bienvenido");
		}
		else {
			System.out.println("ingrese una clave valida");
			}
	}else {
		System.out.println("ingrese un usuario valido");
	}
	}

}
		