/*
 * Nome do projeto: EstRep_Lt01_38
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_38 {

	public static void main(String[] args) {
		int maior = 0;
		int menor = 0;
		
		for(int i = 1; i <= 5; i++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor A: "));
		
			if(n >= maior) {
				maior = n;
			}else if(n <= menor || menor == 0) {
				menor = n;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Maior: " + maior + ". Menor: " + menor);
		
		
	}


}
