/*
 * Nome do projeto: EstRep_Lt01_43
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_43 {

	public static void main(String[] args) {
		
		
		double alturaMaria = 1.50;
		
		int anos = 0;
		
		for(double alturaAna = 1.10; alturaAna <= alturaMaria; alturaAna += 0.30) {
			anos += 1;
		}
		
		JOptionPane.showMessageDialog(null, "Ana será maior que Maria em " + anos + " anos.");
		
		
	}


}
