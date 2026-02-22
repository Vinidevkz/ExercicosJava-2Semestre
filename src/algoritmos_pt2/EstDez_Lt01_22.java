/*
 * Nome do projeto: EstDec_Lt01_22
 * Objetivo: Receba 2 valores inteiros e diferentes.
 * Mostre seus valores em ordem crescente.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 22/02/26
*/
package algoritmos_pt2;
import java.util.Arrays;

import javax.swing.*;
import static java.lang.Math.pow;

public class EstDez_Lt01_22 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));

		if(n1 > n2) {
			JOptionPane.showMessageDialog(null, n2 + ", " + n1);
		}else {
			JOptionPane.showMessageDialog(null, n1 + ", " + n2);
		}
	}

}
