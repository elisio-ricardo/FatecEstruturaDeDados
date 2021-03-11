package Lista04;

import javax.swing.JOptionPane;

public class PilhaLojaVirtual {

	private LojaVirtual dados[];
	private int tamanho = 0;

	public PilhaLojaVirtual() {

		dados = new LojaVirtual[10];
	}

	public boolean vaziaPilha() {
		if (tamanho == 0) {
			JOptionPane.showMessageDialog(null, "True");
		} else {
			JOptionPane.showMessageDialog(null, "False");
		}
		return tamanho == 0;
	}

	// Adiciona um elemento no final da Pilha
	public void adicionaPilha(LojaVirtual lojaVirtual) {

		if (tamanho < this.dados.length) {
			this.dados[tamanho] = lojaVirtual;
			tamanho++;
		} else {
			JOptionPane.showMessageDialog(null, "ERRO, Pilha cheia");
		}
	}

	// Quando removido um elemento do Final da Pilha automaticante é adicionada a Fila
	public void adicionaFila(LojaVirtual elemento2) {

		if (tamanho < this.dados.length) {
			this.dados[tamanho] = elemento2;
			JOptionPane.showMessageDialog(null,
					"Foi adicionado a Fila a pessoa - ID : " + this.dados[tamanho].getId() + ", Nome: "
							+ this.dados[tamanho].getNome() + ", Valor:" + this.dados[tamanho].getValor() + ", Quantidade: "
							+ this.dados[tamanho].getQuantidade());
			tamanho++;
		} else {
			JOptionPane.showMessageDialog(null, "ERRO, Fila cheia");
		}
	}

	// Remove um elemento no Fila da Pilha  e envia esse elemento removido para o metodo
	// adicionaFila
	public LojaVirtual removePilha() {

		LojaVirtual elemento = null;
		if (tamanho != 0) {
			elemento = this.dados[tamanho];
			JOptionPane.showMessageDialog(null,
					"Foi removida da Pilha a pessoa - ID : " + this.dados[tamanho].getId() + ", Nome: "
							+ this.dados[tamanho].getNome() + ", Valor:" + this.dados[tamanho].getValor() + ", Quantidade: "
							+ this.dados[tamanho].getQuantidade());

			tamanho--;
		} else {
			JOptionPane.showMessageDialog(null, "ERRO, Pilha vazia");
		}
		return elemento;
	}

	// Retorna a posição e os dados de uma pessoa de acordo com o seu ID
	// Se a Pilha estiver vazia ou o ID não exista retorna uma mensagem de erro

	public void ordemEsperaFila(String id) {
		// StringBuilder s = new StringBuilder();
		if (tamanho != 0) {
			for (int i = 0; i < tamanho; i++) {
				if (this.dados[i].getId().equalsIgnoreCase(id)) {
					JOptionPane.showMessageDialog(null,
							(i + 1) + "° Pessoa é - ID : " + this.dados[i].getId() + ", Nome: "
									+ this.dados[i].getNome() + ", Valor: " + this.dados[i].getValor() + ", Quantidade: "
									+ this.dados[i].getQuantidade());
					break;
				} else {
					JOptionPane.showMessageDialog(null, "ERRO, ID  não existe");
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "ERRO, Pilha Vazia");
		}
	}

	// Retorna todos os elementos da Pilha na sua ordem de espera
	public void ApresentaPilha() {
		StringBuilder s = new StringBuilder();
		if (tamanho != 0) {
			for (int i = 0; i < tamanho; i++) {
				s.append("ID: " + this.dados[i].getId() + ", Nome: " + this.dados[i].getNome() + ", Valor: "
						+ this.dados[i].getValor() + ", Quantidade: " + this.dados[i].getQuantidade() + "\n");
			}
		} else {
			System.out.println("ERRO, Pilha Vazia");
		}
		JOptionPane.showMessageDialog(null, s.toString());
	}
}
