/*
 * Nome do projeto: EstDec_Lt01_29
 * Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa)
 * e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias
 * sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 22/02/26
*/
package algoritmos_pt2;
import java.util.Arrays;

import javax.swing.*;
import static java.lang.Math.pow;

public class EstDez_Lt01_29 {

	public static void main(String[] args) {
		
		boolean verify = false;
		
		int tipoInvest = 0;
		
		while(!verify) {
			tipoInvest = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento"));
			
			if(tipoInvest < 1 || tipoInvest > 2) {
				JOptionPane.showMessageDialog(null, "Somente 1 e dois aceitos.");
			}else {
				verify = true;
			}
		}
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do investimento"));
		
		if(tipoInvest == 1) {
			double novoValor = valor + (valor * 0.03);
			JOptionPane.showMessageDialog(null, "Valor na poupança depois de 30 dias: " + novoValor);
		}else{
			double novoValor = valor + (valor * 0.05);
			JOptionPane.showMessageDialog(null, "Valor na renda fixa depois de 30 dias: " + novoValor);
		}

		
	}

}
