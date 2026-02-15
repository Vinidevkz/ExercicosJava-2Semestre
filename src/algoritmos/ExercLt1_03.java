/*
 * Nome do projeto: ExercLt1_03
 * Objetivo: Coletar o valor da altura e da base
 * de um triangulo e calcular sua area
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos;

import javax.swing.JOptionPane;

public class ExercLt1_03 {

	public static void main(String[] args) {
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triângulo: "));
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
		
		int area = (base * altura) / 2;
		
		JOptionPane.showMessageDialog(null, "Área do triângulo: " + area);
	}

}
