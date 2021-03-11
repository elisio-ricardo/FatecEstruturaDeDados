package Lista04;

import javax.swing.JOptionPane;

import Lista03.Fila;
import Lista03.Pilha;

public class testeDetran {

	public static void main(String[] args) {

		// FilaDetran filaDetran = new FilaDetran();
		// System.out.println(filaDetran.vazia());

		FilaDetran fila = new FilaDetran();

		FilaDetran pilha = new FilaDetran();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha a opção: \n 1 - Conferir se a Fila esta vazia \n 2 - Adicionar elemento Fila"
							+ "\n 3 - Remover elemento Fila \n 4- Consultar ordem de espera Pessoa \n 5 - Apresentar Fila "
							+ "\n 9 - Finalizar"));
			String id;
			String nome;
			String rg;
			String telefone;
			String dataDeNascimento;
			Detran elemento2;
			switch (opc) {
			case 1:
				fila.vaziaFila();
				break;
			case 2:
				id = JOptionPane.showInputDialog("Digite o ID: ");
				nome = JOptionPane.showInputDialog("Digite o nome: ");
				rg = JOptionPane.showInputDialog("Digite o rg: ");
				telefone = JOptionPane.showInputDialog("Digite o telefone: ");
				dataDeNascimento = JOptionPane.showInputDialog("Digite a data de nascimento: ");
				fila.adicionaFila(new Detran(id, nome, rg, telefone, dataDeNascimento));
				break;
			case 3:
				elemento2 = fila.removeFila();
				if (elemento2 != null) {
					pilha.adicionaPilha(elemento2);
				}
				break;
			case 4:
				id = JOptionPane.showInputDialog("Digite o id de consulta: ");
				fila.ordemEsperaFila(id);
				break;
			case 5:
				fila.ApresentaFila();
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando", null, JOptionPane.INFORMATION_MESSAGE);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida", null, JOptionPane.INFORMATION_MESSAGE);

			}
		}
	}
}
