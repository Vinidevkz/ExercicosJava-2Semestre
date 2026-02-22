/*
 * Nome do projeto: EstDec_Lt01_18
 * Objetivo: Coleta dois numeros e mostra  diferença do maior
 * pelo menor. 
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 19/02/26
*/
package algoritmos_pt2;
import javax.swing.*;
	
public class EstDeq_Lt01_18 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		
		int n3;
		
		if(n1 > n2)
			{
			n3 = n1 - n2;
			}
		else
			{
				n3 = n2 - n1;
			}
		
		JOptionPane.showMessageDialog(null, "Diferença:" + n3);
	}

}
