/*
 * Nome do projeto: ExercLt1_09
 * Objetivo: Receber 2 números inteiros.
 * Calcular e mostrar a soma dos quadrados.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos_pt1;

import javax.swing.JOptionPane;

public class ExercLt1_09 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
	
		int somaDosQuadrados = (num1 * num1) + (num2 * num2);
		
		JOptionPane.showMessageDialog(null, "Soma dos quadrados: " + somaDosQuadrados);
	}

}
