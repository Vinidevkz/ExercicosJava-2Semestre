/*
 * Nome do projeto: EstRep_Lt01_40
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_40 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor menor: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor maior: "));
		
		int maior = 0;
		int menor = 0;
		
		if(n1 > n2) {
			maior = n1;
			menor = n2;
		}else{
			maior = n2;
			menor = n1;
		}
		
		for(int i = menor + 1; i < maior; i++) {
			if(i % 1 == 0 || i % i == 0 || i % 3 != 0 || i % 7 != 0) {
				JOptionPane.showMessageDialog(null, i);
			}
		}
		
	}


}
