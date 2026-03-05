/*
 * Nome do projeto: EstRep_Lt01_34
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_34 {

	public static void main(String[] args) {
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
		double total = 0;
		
		for(double i = 0; i <= 10; i++) {
			double result = n * i;
			JOptionPane.showMessageDialog(null, result);	
		}
		
		JOptionPane.showMessageDialog(null, total);		
		
		

	}

}
