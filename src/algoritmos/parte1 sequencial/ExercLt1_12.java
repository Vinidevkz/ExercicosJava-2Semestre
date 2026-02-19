/*
 * Nome do projeto: ExercLt1_12
 * Objetivo: Receber o ano de nascimento e o
 * ano atual. Calcular e mostrar a sua idade e
 * quantos anos terá daqui a 17 anos.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos;

import javax.swing.JOptionPane;

public class ExercLt1_12 {

	public static void main(String[] args) {
		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		
		int idadeAtual = anoAtual - anoNasc;
		int idadeFutura = idadeAtual + 17;
		
		JOptionPane.showMessageDialog(null, "Idade atual: " + idadeAtual + "\nIdade daqui 17 anos: " + idadeFutura);
	}

}
