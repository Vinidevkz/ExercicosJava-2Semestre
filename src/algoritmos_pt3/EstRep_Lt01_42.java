/*
 * Nome do projeto: EstRep_Lt01_42
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_42 {

	public static void main(String[] args) {
		
		double total = 0.0;
		double n1 = 2.0;
		
		for(double n = 3.0; n <= 99.0; n += 2) {
			total += n1 / n;
			n1 ++;
		}
		
		total += 1;
		
		JOptionPane.showMessageDialog(null, total);
		
	}


}
