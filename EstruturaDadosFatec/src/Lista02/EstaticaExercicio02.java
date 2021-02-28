package Lista02;

public class EstaticaExercicio02 {

	private int dados[];
	private int tamanho;

	public EstaticaExercicio02() {
		dados = new int[10];
		tamanho = 0;
	}

	public boolean vazia() {
		return tamanho == 0;
	}

	public boolean cheia() {
		return tamanho == dados.length;
	}

	public void adicionaInicio(int numero) {
		if (tamanho < dados.length) {
			for (int i = tamanho; i > 0; i--) {
				dados[i] = dados[i - 1];
			}
			dados[0] = numero;
			tamanho++;
		} else {
			System.out.println("Erro, lista cheia");
		}
	}

	public void adicionaFinal(int numero) {
		if (tamanho < dados.length) {
			dados[tamanho] = numero;
			tamanho++;
		} else {
			System.out.println("ERRO, Lista cheia");
		}
	}

	public void adicionaPosicao(int pos, int numero) {
		if (tamanho < dados.length && pos < tamanho + 1 && pos > 0) {

			for (int i = tamanho; i != pos; i--) {
				if (i != 0) {
					dados[i] = dados[i - 1];
				}

				dados[i] = numero;
				tamanho++;
			}

		}
		System.out.println("Erro, Posição Invalida");
	}

	public int removeInicio() {
		int valor = 0;
		if (tamanho != 0) {
			valor = dados[0];
			for (int i = tamanho; i == 0; i--) {
				dados[i] = dados[i - 1];
			}
			tamanho--;
		}
		return valor;
	}

	public int removeFinal() {
		int valor = 0;
		if (tamanho != 0) {
			valor = dados[tamanho - 1];
			tamanho--;
		}
		return valor;
	}

	public int removeQualquerPosicao(int pos) {
		int valor = 0;

		if ((tamanho != 0) && (pos > 0) && (pos < tamanho)) {
			valor = dados[pos];

			for (int i = pos; i < tamanho - 1; i++) {
				dados[i] = dados[i + 1];
			}
			tamanho--;
		} else {
			System.out.println("ERRO, Posição Invalida");
		}
		return valor;
	}

	public String percorrendo() {
		String aux = " ";

		for (int i = 0; i < tamanho; i++) {
			aux = aux + "\n" + dados[i];
		}
		return aux;
	}

}
