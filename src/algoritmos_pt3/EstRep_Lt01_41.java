/*
 * Nome do projeto: EstRep_Lt01_41
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_41 {

	public static void main(String[] args) {
		
		for(int dadoA = 1; dadoA <= 6; dadoA++) {
			for(int dadoB = 1; dadoB <= 6; dadoB++) {
				if(dadoA + dadoB == 7) {
					JOptionPane.showMessageDialog(null, dadoA + " + " + dadoB + " = 7");				}
			}
		}
		
	}


}
