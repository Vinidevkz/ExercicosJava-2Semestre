/*
 * Nome do projeto: EstDec_Lt01_20
 * Objetivo: Receber 3 coeficientes de uma equação de segundo
 * grau e verificar a existencia de raizes.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 19/02/26
*/
package algoritmos_pt2;
import javax.swing.*;

public class EstDeq_Lt01_20 {

	public static void main(String[] args) {	
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digite A:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Digite B:"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Digite C:"));
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if(delta >= 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			JOptionPane.showMessageDialog(null, "Raizes: \n" + "x1: " + x1 + "\nx2: " + x2);
		}else{
			System.out.println("Não há raizes reais.");
		}
		
		

	}
	


}
