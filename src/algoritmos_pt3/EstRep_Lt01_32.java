/*
 * Nome do projeto: EstRep_Lt01_32
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_32 {

	public static void main(String[] args) {
		int value = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		int total = 1;
		
		for(int i = 1; i <= 5; i++) {
			total *= i;
		}
		
		JOptionPane.showMessageDialog(null, total);

	}

}
