/*
 * Nome do projeto: EstDec_Lt01_27
 * Objetivo: Receba o número de voltas, a extensão do
 * circuito (em metros) e o tempo de duração (minutos).
 * Calcule e mostre a velocidade média em km/h.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 22/02/26
*/
package algoritmos_pt2;
import java.util.Arrays;

import javax.swing.*;
import static java.lang.Math.pow;

public class EstDez_Lt01_27 {

	public static void main(String[] args) {
		
		int nVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de voltas: "));
		int metros = Integer.parseInt(JOptionPane.showInputDialog("Digite os metros do circuito: "));
		int tempoDuracao = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de duracao em minutos: "));

		int distanciaPercorrida = nVoltas * metros;

		double km = distanciaPercorrida / 1000.0;
		double horas = tempoDuracao / 60.0;

		double velocidade = km / horas;

		JOptionPane.showMessageDialog(null, "Velocidade média: " + velocidade + " km/h");
		
	}

}
