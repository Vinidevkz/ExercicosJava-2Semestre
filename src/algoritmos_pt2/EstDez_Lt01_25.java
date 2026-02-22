/*
 * Nome do projeto: EstDec_Lt01_25
 * Objetivo: Receba a hora de início e de final de um jogo (HH,MM)
 * sabendo que o tempo máximo é de 24 horas e pode começar num dia e
 * terminar no outro.

 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 22/02/26
*/
package algoritmos_pt2;
import java.util.Arrays;

import javax.swing.*;
import static java.lang.Math.pow;

public class EstDez_Lt01_25 {

	public static void main(String[] args) {
		
		int horasTotais = 0;
		int minutosTotais = 0;
		
		int horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de inicio: "));
		int minutoInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de inicio: "));
	
		int horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de termino: "));
		int minutoFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de termino: "));
		
		while(horaInicio != horaFinal || minutoInicio != minutoFinal) {
			if(horaInicio == 23 && minutoInicio == 59) {
				horaInicio = 0;
				minutoInicio = 0;
				
				horasTotais += 1;
				minutosTotais += 1;
			}else if(minutoInicio == 59) {
				horaInicio += 1;
				minutoInicio = 0;
				
				horasTotais += 1;
				minutosTotais += 1;
			}else{
				minutoInicio += 1;

				minutosTotais += 1;
			}
		}
		
		JOptionPane.showMessageDialog(null, "O jogo durou: " + horasTotais + " horas e " + minutosTotais + " minutos.");
	}

}
