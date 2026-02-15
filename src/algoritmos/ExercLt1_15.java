/*
 * Nome do projeto: ExercLt1_15
 * Objetivo: Receber os valores de 2 catetos de
 * um triângulo retângulo. Calcular e mostrar a
 * hipotenusa.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos;

import javax.swing.JOptionPane;

public class ExercLt1_15 {

	public static void main(String[] args) {
		
		double cat1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro cateto: "));
		double cat2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo cateto: "));
	
		double soma = Math.pow(cat1,  2) + Math.pow(cat2, 2);
		
		double hip = Math.sqrt(soma);
		
		JOptionPane.showMessageDialog(null, "Hipotenusa: " + hip );
	}

}
