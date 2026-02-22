/*
 * Nome do projeto: ExercLt1_11
 * Objetivo: Receba o raio de uma circunferência.
 * Calcule e mostre o comprimento da circunferência.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos_pt1;

import javax.swing.JOptionPane;

public class ExercLt1_11 {
	public static void main(String[] args) {
		double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferência: "));
		
		double comprimento = 2 * 3.14 * raio;
		
		JOptionPane.showMessageDialog(null, "Comprimento: " + comprimento);
	}
}
