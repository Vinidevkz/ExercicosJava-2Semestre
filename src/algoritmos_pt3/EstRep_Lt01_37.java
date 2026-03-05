/*
 * Nome do projeto: EstRep_Lt01_37
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_37 {

	public static void main(String[] args) {
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor A: "));

		double fibo = fibonacci(n);
		
		JOptionPane.showMessageDialog(null, fibo);
	}
	
	public static Double fibonacci(Double n) {
		Double total = 1.0;
		
		if(n <= 1.0) {
			return n;
		}else {
			Double anterior = 0.0, atual = 1.0;
			
			for(double i = 2; i <= n; i++) {
				Double proximo = anterior + atual;
				anterior = atual;
				atual = proximo;
			}
			
			return atual;
		}
		
		
		
	}

}
