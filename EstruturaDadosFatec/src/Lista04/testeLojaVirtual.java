package Lista04;

import javax.swing.JOptionPane;

public class testeLojaVirtual {

	public static void main(String[] args) {

		PilhaLojaVirtual pilha = new PilhaLojaVirtual();
		PilhaLojaVirtual fila = new PilhaLojaVirtual();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha a opção: \n 1 - Conferir se a Pilha esta vazia \n 2 - Adicionar elemento Pilha"
							+ "\n 3 - Remover elemento Pilha \n 4- Consultar ordem de espera de uma Pessoa \n 5 - Apresentar Pilha "
							+ "\n 9 - Finalizar"));
			String id;
			String nome;
			String valor;
			String quantidade;
			LojaVirtual elemento2;
			switch (opc) {
			case 1:
				pilha.vaziaPilha();
				break;
			case 2:
				id = JOptionPane.showInputDialog("Digite o ID: ");
				nome = JOptionPane.showInputDialog("Digite o nome: ");
				valor = JOptionPane.showInputDialog("Digite o Valor: ");
				quantidade = JOptionPane.showInputDialog("Digite a Quantidade: ");
				pilha.adicionaPilha(new LojaVirtual(id, nome, valor, quantidade));
				break;
			case 3:
				elemento2 = pilha.removePilha();
				if (elemento2 != null) {
					fila.adicionaFila(elemento2);
				}
				break;
			case 4:
				id = JOptionPane.showInputDialog("Digite o id de consulta: ");
				pilha.ordemEsperaFila(id);
				break;
			case 5:
				pilha.ApresentaPilha();
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
