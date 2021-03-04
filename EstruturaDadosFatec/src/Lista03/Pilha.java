package Lista03;

import javax.swing.JOptionPane;

public class Pilha {
	private int pilha[];
	private int tamanho;

	public Pilha() {
		pilha = new int[10];
		tamanho = 0;
	}

	public void adicionaPilha(int numero) {

		if (tamanho < pilha.length) {
			for (int i = tamanho; i > 0; i--) {
				pilha[i] = pilha[i - 1];
			}
			pilha[0] = numero;
			tamanho++;
			if (tamanho != 0) {
				JOptionPane.showInputDialog("O indice do inicio pilha é 0 " + "\n O elemento do inicio da pilha é "
						+ pilha[0] + "\n O indice do final da pilha é " + (tamanho - 1)
						+ "\n O elemento do final da pilha é " + pilha[tamanho - 1]);
			}
		} else {
			JOptionPane.showInputDialog("ERRO, Pilha Cheia");
		}
	}

	public int removePilha() {
		int numero = 0;
		if (tamanho != 0) {
			numero = pilha[0];
			for (int i = 0; i < tamanho; i++) {
				pilha[i] = pilha[i + 1];
			}
			tamanho--;
			if (tamanho != 0) {
				JOptionPane.showInputDialog("O indice do inicio pilha é 0 " + "\nO elemento do inicio da pilha é "
						+ pilha[0] + "\nO indice do final da pilha é " + (tamanho - 1)
						+ "\nO elemento do final da pilha é " + pilha[tamanho - 1]);
			}
		} else {
			JOptionPane.showInputDialog("ERRO, Pilha vazia");
		}

		return numero;

	}

}
