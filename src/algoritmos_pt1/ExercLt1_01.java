/*
 * Nome do projeto: ExercLt1_01
 * Objetivo: Coletar o valor do lado de um quadrado, calcular sua
 * area e apresentar o resultado.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 12/02/26
*/

package algoritmos_pt1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExercLt1_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int areaQuadrado;
		
		int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado: "));
		
		areaQuadrado = lado * lado;
		
		JOptionPane.showMessageDialog(null, "Área do quadrado: " + areaQuadrado);
		
	}

}
