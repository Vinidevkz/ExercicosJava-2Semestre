/*
 * Nome do projeto: ExercLt1_16
 * Objetivo: Receba a quantidade de horas trabalhadas,
 * o valor por hora, o percentual de desconto e o
 * número de descendentes. Calcule o salário que
 * serão as horas trabalhadas x o valor por hora.
 * Calcule o salário líquido (= Salário Bruto – desconto).
 * A cada dependente será acrescido R$ 100 no
 * Salário Líquido. Exiba o salário a receber.
 * 
 * Nome do programador: Vinicius Eduardo
 * Data do desenvolvimento: 15/02/26
*/

package algoritmos;

import javax.swing.JOptionPane;

public class ExercLt1_16 {

	public static void main(String[] args) {
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));
		int valorPHora = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por hora: "));
		int desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
		int numDependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de dependentes: "));
		
		int bruto = valorPHora * horas;
		int liquido = bruto - (bruto * (desconto / 100));
		
		int salarioTotal = liquido + (100 * numDependentes);
		
		JOptionPane.showMessageDialog(null, "Salário total: " + salarioTotal);
	}
}
