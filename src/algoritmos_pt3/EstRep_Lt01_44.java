/*
 * Nome do projeto: EstRep_Lt01_44
 * Objetivo: 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 26/02/26
*/
package algoritmos_pt3;
import java.util.Arrays;

import javax.swing.*;

public class EstRep_Lt01_44 {

	public static void main(String[] args) {
		
		
		int numBase = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para a base: "));
		int numExpo = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para a expoente: "));		
		
		Double resultado = funcPotencia(numBase, numExpo);
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public static Double funcPotencia(Integer base, Integer expo) {
		return Math.pow(base, expo);
	}


}
