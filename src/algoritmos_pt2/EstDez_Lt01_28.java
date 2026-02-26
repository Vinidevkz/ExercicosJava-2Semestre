/*
 * Nome do projeto: EstDec_Lt01_28
 * Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
		Venda Mensal	Preço Atual	Preço Novo
		< 500	< 30	+ 10%
		>= 500 e < 1000	>= 30 e < 80	+15%
		>= 1000	>= 80	- 5%
		Obs.: para outras condições, preço novo será igual ao preço atual.

 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 22/02/26
*/
package algoritmos_pt2;
import java.util.Arrays;

import javax.swing.*;
import static java.lang.Math.pow;

public class EstDez_Lt01_28 {

	public static void main(String[] args) {
		
		double precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
		double mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal do produto: "));
		
		if(mediaMensal < 500.00 && precoAtual < 30.00) {
			precoAtual = precoAtual + (precoAtual * 0.10);
		}else if((mediaMensal >= 500.00 && mediaMensal < 1000.00) && (precoAtual >= 30.00 && precoAtual < 80.00 )) {
			precoAtual = precoAtual + (precoAtual * 0.15);
		}else if(mediaMensal >= 1000.00 && precoAtual > 80.00) {
			precoAtual = precoAtual + (precoAtual * 0.05);
		}
		
		JOptionPane.showMessageDialog(null, "Novo valor:" + precoAtual);
		
	}

}
