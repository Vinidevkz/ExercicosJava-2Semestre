/*
 * Nome do projeto: ExercLt1_05
 * Objetivo: Receber os coeficientes A, B e C
 * de uma equação do 2º grau (AX²+BX+C=0) e mostrar
 * as raízes reais.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos_pt1;

import javax.swing.JOptionPane;

public class ExercLt1_05 {

	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("A: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("B: "));
		double c = Double.parseDouble(JOptionPane.showInputDialog("C: "));
	
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		JOptionPane.showMessageDialog(null, "X1: " + x1 + "\nX2: " + x2);	
	
	}

}
