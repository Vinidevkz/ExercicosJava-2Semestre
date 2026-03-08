/*
 * Nome do projeto: EstRep_Lt01_45
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_45 {

	public static void main(String[] args) {
		
		
		double num2 = 4.0;
		double somaExtra = 5.0;
		
		double total = 1.0;
		boolean tipoCalc = false;
		
		for(double num1 = 2.0; num1 <= 15.0; num1 ++) {
			if(tipoCalc == true) {
				total += num1 / num2;
				tipoCalc = false;
			}else {
				total -= num1 / num2;
				tipoCalc = true;
			}
			num2 += somaExtra;
			somaExtra += 2.0;
			
		}
		
		JOptionPane.showMessageDialog(null, total);
		

	}



}
