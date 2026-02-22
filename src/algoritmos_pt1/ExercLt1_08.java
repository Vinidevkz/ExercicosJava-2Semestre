/*
 * Nome do projeto: ExercLt1_08
 * Objetivo: Receber o valor de um depósito em
 * poupança. Calcular e mostrar o valor após 1 mês
 * de aplicação sabendo que rende 1,3% a. m.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos_pt1;

import javax.swing.JOptionPane;

public class ExercLt1_08 {

	public static void main(String[] args) {
		double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito: "));
		
		double valorEmUmMes = deposito + (deposito * (1.3 / 100));

		JOptionPane.showMessageDialog(null, "Valor em um mês (1.3%): " + valorEmUmMes);
	}

}
