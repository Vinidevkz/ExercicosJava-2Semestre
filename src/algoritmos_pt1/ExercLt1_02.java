/*
 * Nome do projeto: ExercLt1_01
 * Objetivo: Coletar o valor do lado de um quadrado, calcular sua
 * area e apresentar o resultado.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 12/02/26
*/

package algoritmos_pt1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExercLt1_02 {

	public static void main(String[] args) {
		double novoSalario;
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("digite o salário atual: "));
		
		novoSalario = salario + (salario * 0.15);
		
		JOptionPane.showMessageDialog(null, "Novo salário com reajuste de 15%: " + novoSalario);
	}

}
