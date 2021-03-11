package Lista04;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class FilaDetran {

	private Detran dados[];
	private int tamanho = 0;

	// Contrutor cria uma fila estatica instanciando a classe Detran
	public FilaDetran() {

		this.dados = new Detran[10];
	}

	// Verifica se a fila esta vazia retornando uma mensagem True ou false
	public boolean vaziaFila() {
		if (tamanho == 0) {
			JOptionPane.showMessageDialog(null, "True");
		} else {
			JOptionPane.showMessageDialog(null, "False");
		}
		return tamanho == 0;
	}

	// Adiciona um elemento no final da fila
	public void adicionaFila(Detran detran) {

		if (tamanho < this.dados.length) {
			this.dados[tamanho] = detran;
			tamanho++;
		} else {
			JOptionPane.showMessageDialog(null, "ERRO, Fila cheia");
		}
	}

	// Quando removido um elemento da fila automaticante é adicionada a Pilha
	public void adicionaPilha(Detran elemento2) {

		if (tamanho < this.dados.length) {
			this.dados[tamanho] = elemento2;
			JOptionPane.showMessageDialog(null,
					"Foi adicionado a Pilha pessoa - ID : " + this.dados[tamanho].getId() + ", Nome: "
							+ this.dados[tamanho].getNome() + ", RG:" + this.dados[tamanho].getRg() + ", telefone: "
							+ this.dados[tamanho].getTelefone() + ", Data de Nascimento: "
							+ this.dados[tamanho].getDatadeNascimento());
			tamanho++;
		} else {
			JOptionPane.showMessageDialog(null, "ERRO, Pilha cheia");
		}
	}

	// Remove um elemento no começo da fila e arrasta uma possição para frente de
	// todos os elementos restantes e envia esse elemento removido para o metodo
	// adicionaPilha
	public Detran removeFila() {

		Detran elemento = null;
		if (tamanho != 0) {
			elemento = this.dados[0];
			JOptionPane.showMessageDialog(null, "Foi removida da Fila a pessoa - ID : " + this.dados[0].getId()
					+ ", Nome: " + this.dados[0].getNome() + ", RG:" + this.dados[0].getRg() + ", telefone: "
					+ this.dados[0].getTelefone() + ", Data de Nascimento: " + this.dados[0].getDatadeNascimento());
			for (int i = 0; i < tamanho - 1; i++) {
				this.dados[i] = this.dados[i + 1];
			}

			tamanho--;
		} else {
			JOptionPane.showMessageDialog(null, "ERRO, Lista vazia");
		}
		return elemento;
	}

	// Retorna a posição e os dados de uma pessoa de acordo com o seu ID
	//Se a lista estiver vazia ou o ID não exista retorna uma mensagem de erro
	
	public void ordemEsperaFila(String id) {
		// StringBuilder s = new StringBuilder();
		if (tamanho != 0) {
			for (int i = 0; i < tamanho; i++) {
				if (this.dados[i].getId().equalsIgnoreCase(id)) {
					JOptionPane.showMessageDialog(null,
							(i + 1) + "° Pessoa é - ID : " + this.dados[i].getId() + ", Nome: "
									+ this.dados[i].getNome() + ", RG: " + this.dados[i].getRg() + ", telefone: "
									+ this.dados[i].getTelefone() + ", Data de Nascimento: "
									+ this.dados[i].getDatadeNascimento());
					break;
				} else {
					JOptionPane.showMessageDialog(null, "ERRO, ID  não existe");
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "ERRO, Fila Vazia");
		}
	}

	// Retorna todos os elementos da fila na sua ordem de espera
	public void ApresentaFila() {
		StringBuilder s = new StringBuilder();
		if (tamanho != 0) {
			for (int i = 0; i < tamanho; i++) {
				s.append("ID: " + this.dados[i].getId() + ", Nome: " + this.dados[i].getNome() + ", RG: "
						+ this.dados[i].getRg() + ", telefone: " + this.dados[i].getTelefone()
						+ ", Data de Nascimento: " + this.dados[i].getDatadeNascimento()+"\n");
			}
		} else {
			System.out.println("ERRO, Fila Vazia");
		}
		JOptionPane.showMessageDialog(null, s.toString());
//		if (tamanho != 0) {
//			for (int i = 0; i < tamanho; i++) {
//				JOptionPane.showMessageDialog(null,
//						"ID: " + this.dados[i].getId() + ", Nome: " + this.dados[i].getNome() + ", RG: "
//								+ this.dados[i].getRg() + ", telefone: " + this.dados[i].getTelefone()
//								+ ", Data de Nascimento: " + this.dados[i].getDatadeNascimento());
//			}
//		} else {
//			JOptionPane.showMessageDialog(null, "ERRO, Fila Vazia");
//		}

	}

}
