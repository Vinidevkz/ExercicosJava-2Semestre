/*
 * Nome do projeto: ExercLt1_13
 * Objetivo: Receber a quantidade de alimento em quilos.
 * Calcular e mostrar quantos dias durará esse alimento
 * sabendo que a pessoa consome 50g ao dia.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos;

import javax.swing.JOptionPane;

public class ExercLt1_13 {

	public static void main(String[] args) {
		int kg = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de comida em kg: "));
		
		int qtdDias = 0;
		int qtdConsumida = 0;
		
		while(qtdConsumida < kg) {
			int simulacao = qtdConsumida + 50;
			
			if(simulacao <= kg) {
				qtdDias += 1;
				qtdConsumida += 50;
			}else{
				break;
			};
		}
		
		int sobras =  kg - qtdConsumida;
		
		JOptionPane.showMessageDialog(null, "A quantidade durará: " + qtdDias + "\nA pessoa consumiu: " + qtdConsumida + "\nSobrando: " + sobras);
		
		
		

	}

}
