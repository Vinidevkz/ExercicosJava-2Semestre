/*
 * Nome do projeto: ExercLt1_17
 * Objetivo: Calcular a quantidade de litros gastos
 * em uma viagem, sabendo que o automóvel faz 12 km/l.
 * Receber o tempo de percurso e a velocidade média.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos;

import javax.swing.JOptionPane;

public class ExercLt1_17 {

	public static void main(String[] args) {
		double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de viagem em horas: "));
		double velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media: "));
		
		double distancia = tempo * velocidade;
		
		double litros = distancia / 12;
		
		JOptionPane.showMessageDialog(null, "Litros gastos: " + litros);
		

	}

}
