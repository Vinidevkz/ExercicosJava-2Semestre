/*
 * Nome do projeto: EstDec_Lt01_24
 * Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 22/02/26
*/
package algoritmos_pt2;
import java.util.Arrays;

import javax.swing.*;
import static java.lang.Math.pow;

public class EstDez_Lt01_24 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		int resto2 = n % 2;
		int resto3 = n % 3;
		
		if(resto2 == 0 || resto3 != 0) {
			JOptionPane.showMessageDialog(null, "O numero é divisivel por 2 mas nao por 3.");
		}else if(resto2 != 0 || resto3 == 0) {
			JOptionPane.showMessageDialog(null, "O numero é divisivel por 3 mas nao por 2.");
		}else {
			JOptionPane.showMessageDialog(null, "O numero é divisivel por 2 e por 3.");
		}
	}

}
