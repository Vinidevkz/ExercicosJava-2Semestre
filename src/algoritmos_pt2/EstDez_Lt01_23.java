/*
 * Nome do projeto: EstDec_Lt01_23
 * Objetivo: Receba 3 valores obrigatoriamente em ordem
 * crescente e um 4º valor não necessariamente em ordem.
 * Mostre os 4 números em ordem crescente.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 22/02/26
*/
package algoritmos_pt2;
import java.util.Arrays;

import javax.swing.*;
import static java.lang.Math.pow;

public class EstDez_Lt01_23 {

	public static void main(String[] args) {
		boolean verify1 = false;
		boolean verify2 = false;
		
		//coleta o primeiro numero
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		
		//coleta o segundo numero
		while(!verify1) {
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
			
			if(n2 < n1) {
				JOptionPane.showMessageDialog(null, "O segundo valor deve ser maior que o primeiro.");
			}else {
				verify1 = true;
			}
		}
		
		//coleta o terceiro numero
		while(!verify2) {
			n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor: "));
			
			if(n3 < n2) {
				JOptionPane.showMessageDialog(null, "O terceiro valor deve ser maior que o segundo.");
			}else {
				verify2 = true;
			}
		}
		
		//coleta o quarto numero
		n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor: "));
		
		if(n4 < n1) {
			JOptionPane.showMessageDialog(null, n4 + ", " + n1 + ", " + n2 + ", " + n3);
		}else if(n4 > n1 && n4 < n2) {
			JOptionPane.showMessageDialog(null, n1 + ", " + n4 + ", " + n2 + ", " + n3);
		}else if(n4 > n2 && n4 < n3) {
			JOptionPane.showMessageDialog(null, n1 + ", " + n2 + ", " + n4 + ", " + n3);
		}else {
			JOptionPane.showMessageDialog(null, n1 + ", " + n2 + ", " + n3 + ", " + n4);
		}
	}

}
