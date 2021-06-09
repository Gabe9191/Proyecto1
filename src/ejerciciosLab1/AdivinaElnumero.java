package ejerciciosLab1;


import javax.swing.JOptionPane;

public class AdivinaElnumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println("----------------------------------------------------------------");
		
		
		int numAleatorio = (int)(Math.random()*100);
		System.out.println(numAleatorio);
		
		int intentos=10;
		
		int numIngresado;
		
		//Scanner kb=new Scanner (System.in);
		do {
			numIngresado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 100 , tiene "+intentos+" intentos"));		
		
		
		//numIngresado=kb.nextInt();
		
		
			
			if(numAleatorio>numIngresado) {
			JOptionPane.showMessageDialog(null,"uff te falto");
			}
			else if(numAleatorio<numIngresado) {
				JOptionPane.showMessageDialog(null, "uff te pasaste");
				}
			else if (numAleatorio==numIngresado) {
				JOptionPane.showMessageDialog(null,"GANASTE!!!");
				break;
			}
			intentos--;
			
		}while(intentos!=0);
		
		//kb.close();
		
		JOptionPane.showMessageDialog(null,"Suerte la proxima");
		}
		
}

	
