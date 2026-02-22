/*
 * Nome do projeto: ExercLt1_06
 * Objetivo: Receber os valores em x e y.
 * Efetuar a troca de seus valores e mostrar
 * seus conteúdos.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos_pt1;

import javax.swing.JOptionPane;

public class ExercLt1_06 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite x"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite y"));
		
		int temp = x;
		x = y;
		y = temp;
		
		JOptionPane.showMessageDialog(null, "X: " + x + "\nY: " + y);
	}
}
