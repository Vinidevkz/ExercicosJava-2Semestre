/*
 * Nome do projeto: EstDec_Lt01_20
 * Objetivo: Receber 3 coeficientes de uma equação de segundo
 * grau e verificar a existencia de raizes.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 19/02/26
*/
package algoritmos_pt2;
import java.util.Arrays;

import javax.swing.*;
import static java.lang.Math.pow;

public class EstDeq_Lt01_21 {
	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
		double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));
		
		double media = (n1 + n2 + n3 + n4) / 4;
		
		if(media >= 6.0) {
			JOptionPane.showMessageDialog(null, "APROVADO. Média: " + media);
		}else if(media >= 3.0 || media < 6.0) {
			JOptionPane.showMessageDialog(null, "EXAME. Média: " + media);
		}else {
			JOptionPane.showMessageDialog(null, "RETIDO. Média: " + media);
		}
	}
}
