package Lista03;

import javax.swing.JOptionPane;

public class Fila {
	private int fila[];
	private int tamanho;

	public Fila() {
		fila = new int[10];
		tamanho = 0;
	}

	public void adicionaFila(int numero) {

		if (tamanho < fila.length) {
			fila[tamanho] = numero;
			tamanho++;
			if (tamanho != 0) {
				JOptionPane.showInputDialog("O indice do inicio fila é 0 " + "\n O elemento do inicio da fila é "
						+ fila[0] + "\n O indice do final da fila é " + (tamanho - 1)
						+ "\n O elemento do final da fila é " + fila[tamanho - 1]);
			}
		} else {
			JOptionPane.showInputDialog("ERRO, Lista Cheia");
		}
	}

	public int remove() {
		int numero = 0;
		if (tamanho != 0) {
			numero = fila[0];
			for (int i = 0; i < tamanho; i++) {
				fila[i] = fila[i + 1];
			}
			tamanho--;
			if (tamanho != 0) {
				JOptionPane.showInputDialog("O indice do inicio fila é 0 " + "\nO elemento do inicio da fila é "
						+ fila[0] + "\nO indice do final da fila é " + (tamanho - 1)
						+ "\nO elemento do final da fila é " + fila[tamanho - 1]);
			}
		} else {
			JOptionPane.showInputDialog("ERRO, Fila vazia");
		}
		return numero;
	}
}
