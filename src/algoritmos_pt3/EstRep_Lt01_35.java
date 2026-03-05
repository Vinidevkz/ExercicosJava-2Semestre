/*
 * Nome do projeto: EstRep_Lt01_35
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_35 {

	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor A: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor B: "));
		
		double maior;
		double menor;
		
		if(n1 > n2) {
			maior = n1;
			menor = n2;
		}else {
			maior = n2;
			menor = n1;
		}
		
		for(double i = menor + 1; i < maior; i++) {
			if(i % 2 != 0) {
				JOptionPane.showMessageDialog(null, i);
			}
		}

	}

}
