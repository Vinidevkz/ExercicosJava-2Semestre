/*
 * Nome do projeto: EstDec_Lt01_26
 * Objetivo: Receba 2 números inteiros. Verifique e
 * mostre se o maior número é múltiplo do menor.

 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 22/02/26
*/
package algoritmos_pt2;
import java.util.Arrays;

import javax.swing.*;
import static java.lang.Math.pow;

public class EstDez_Lt01_26 {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		if(n1 > n2) {
			if(n1 % n2 == 0) {
				JOptionPane.showMessageDialog(null, n1 + " é multiplo de " + n2);
			}
		}else if(n2 > n1) {
			if(n2 % n1 == 0) {
				JOptionPane.showMessageDialog(null, n2 + " é multiplo de " + n1);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Os numeros são iguis.");
		}
	}

}
