/*
 * Nome do projeto: ExercLt1_14
 * Objetivo: Receber 2 ângulos de um triângulo.
 * Calcular e mostrar o valor do 3º ângulo.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos_pt1;

import javax.swing.JOptionPane;

public class ExercLt1_14 {

	public static void main(String[] args) {
		int ang1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro ângulo:"));
		int ang2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo ângulo:"));
	
		int ang3 = 180 - (ang1 + ang2);
		
		JOptionPane.showMessageDialog(null, "Terceiro angulo: " + ang3);
	}

}
