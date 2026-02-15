/*
 * Nome do projeto: ExercLt1_10
 * Objetivo: Recebar 2 números reais.
 * Calcular e mostrar a diferença desses valores.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos;

import javax.swing.JOptionPane;

public class ExercLt1_10 {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		int diferenca;
		
		if(num1 > num2) {
			diferenca = num1 - num2;
		}else {
			diferenca = num2 - num1;
		}
		
		JOptionPane.showMessageDialog(null, "Diferença: " + diferenca);
	}
}
