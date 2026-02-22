/*
 * Nome do projeto: ExercLt1_07
 * Objetivo: Receber os valores do comprimento,
 * largura e altura de um paralelepípedo.
 * Calcular e mostrar seu volume.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos_pt1;

import javax.swing.JOptionPane;

public class ExercLt1_07 {

	public static void main(String[] args) {	
		int comp = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento: "));
		int larg = Integer.parseInt(JOptionPane.showInputDialog("Digite o largura: "));
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o altura: "));
		
		int volume = comp * larg * altura;
		
		JOptionPane.showMessageDialog(null, "Volume do paralelepipedo: " + volume);
	}

}
