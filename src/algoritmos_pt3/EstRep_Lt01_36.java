/*
 * Nome do projeto: EstRep_Lt01_36
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_36 {

	public static void main(String[] args) {
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor A: "));

		double total = 0.0;
		
		if(n == 0.0) {
			JOptionPane.showMessageDialog(null, 0);
		}else{
			for(double i = 1.0; i <= n; i++) {
				total += 1.0 / fatorial(i);
			}
			total += 1.0;
			
			JOptionPane.showMessageDialog(null, total);
		}	
	}
	
	public static Double fatorial(Double n) {
		Double total = 1.0;
		
		for(double i = n; i >= 1.0; i--) {
			total *= i;
		}
			
		return total;
	}

}
