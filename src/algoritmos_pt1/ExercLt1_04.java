/*
 * Nome do projeto: ExercLt1_04
 * Objetivo: Coletar o valor da temperatura em celsius
 * e converter para fahrenheit.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos_pt1;

import javax.swing.JOptionPane;

public class ExercLt1_04 {

	public static void main(String[] args) {
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da temperatura em celsius: "));

		int f = (9 * c + 160) / 5;
		
		JOptionPane.showMessageDialog(null, "Temperatura em fahrenheit: " + f);
	}

}
