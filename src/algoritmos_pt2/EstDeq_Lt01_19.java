/*
 * Nome do projeto: EstDec_Lt01_19
 * Objetivo: Coleta dois numeros e mostra o maior deles
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 19/02/26
*/
package algoritmos_pt2;
import javax.swing.*;

public class EstDeq_Lt01_19 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));

		int maior;
		
		if(n1 > n2) {
			maior = n1;
		}else {
			maior = n2;
		}
		
		JOptionPane.showMessageDialog(null, "Maior:" + maior);
	}

}
