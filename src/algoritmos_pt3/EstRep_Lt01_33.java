/*
 * Nome do projeto: EstRep_Lt01_33
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_33 {

	public static void main(String[] args) {
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
		double total = 0;
		
		for(double i = 2.0; i <= n; i++) {
			total += 1.0 / n;
		}
		
		total += 1.0;
		
		JOptionPane.showMessageDialog(null, total);		
		
		

	}

}
