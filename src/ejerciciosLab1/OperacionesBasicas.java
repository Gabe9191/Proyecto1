package ejerciciosLab1;

import java.util.Scanner;

public class OperacionesBasicas {

	public static void main(String[] args) {
		int D,E;
		String operacion;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Ingrese un numero");
		
		D=teclado.nextInt();
		
		System.out.println("ingrese una operacion +,-,*,/");
		
		operacion=teclado.next();
		
		System.out.println("ingrese otro numero");
		
		E=teclado.nextInt();
		
		
		 
		System.out.println("=");
		
		switch(operacion) {
		
		case("+"):System.out.println(D+E);
		break;
		case ("-"):System.out.println(D-E);
		break;
		case ("*"):System.out.println(D*E);
		break;
		case("/"):System.out.println(D/E);
		break;
		default:System.out.println("elija una operacion valida");
		}
		teclado.close();

	}

}
