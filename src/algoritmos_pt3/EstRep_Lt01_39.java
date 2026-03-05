/*
 * Nome do projeto: EstRep_Lt01_39
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_39 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de graos por casa: "));

		int total = 0;
		
		for(int i = 2; i <= 65; i++) {
			total += (i - 1) * 2;
		}
		
		JOptionPane.showMessageDialog(null, total);
		
	}


}
