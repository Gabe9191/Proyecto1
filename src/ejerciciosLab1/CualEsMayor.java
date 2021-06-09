package ejerciciosLab1;

import java.util.Scanner;

public class CualEsMayor {

	public static void main(String[] args) {
		
		int A,B,C;
		String continu;
		
		do {
			Scanner kb = new Scanner(System.in);
			System.out.println("INGRESE NUMERO A-");
			A=kb.nextInt();
			System.out.println("INGRESE NUMERO B-");
			B=kb.nextInt();
			System.out.println("INGRESE NUMERO C-");
			C=kb.nextInt();
			
			
			if (A>B&&A>C) {
				System.out.println("A es el mayor");
				}
			else if (B>A&&B>C) {
				System.out.println("B es el mayor");
				}
			else if(C>A&&C>B) {
				System.out.println("C es el mayor");
				}
			System.out.println("continuar?");
			continu=kb.next();
			kb.close();
		}while(continu.equalsIgnoreCase("si"));
		// TODO Auto-generated method stub

	}

}
