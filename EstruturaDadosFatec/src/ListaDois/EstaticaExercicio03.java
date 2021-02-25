package ListaDois;

public class EstaticaExercicio03 {

	private String nomes[];
	private int tamanho;
	
	public EstaticaExercicio03() {
		nomes = new String[10];
		tamanho = 0;
	}
	
	public boolean vazia() {
		return tamanho == 0;
	}

	public boolean cheia() {
		return tamanho == nomes.length;
	}
	
	public void adicionaInicio(String nome) {
		if (tamanho < nomes.length) {
			for (int i = tamanho; i > 0; i--) {
				nomes[i] = nomes[i - 1];
			}
			nomes[0] = nome;
			tamanho++;
		} else {
			System.out.println("Erro, lista cheia");
		}
	}
	
	
	public void adicionaFinal(String nome) {
		if (tamanho < nomes.length) {
			nomes[tamanho] = nome;
			tamanho++;
		} else {
			System.out.println("ERRO, Lista cheia");
		}
	}
	
	public void adicionaPosicao(int pos, String nome) {
		if (tamanho < nomes.length && pos < tamanho + 1 && pos > 0) {

			for (int i = tamanho; i != pos; i--) {
				if (i != 0) {
					nomes[i] = nomes[i - 1];
				}

				nomes[i] = nome;
				tamanho++;
			}

		}
		System.out.println("Erro, Posição Invalida");
	}
	
	public String removeInicio() {
		String nome = " ";
		if (tamanho != 0) {
			nome = nomes[0];
			for (int i = tamanho; i == 0; i--) {
				nomes[i] = nomes[i - 1];
			}
			tamanho--;
		}
		return nome;
	}
	
	public String removeFinal() {
		String nome = " ";
		if (tamanho != 0) {
			nome = nomes[tamanho - 1];
			tamanho--;
		}
		return nome;
	}
	
	public String removeQualquerPosicao(int pos) {
		String nome = "";

		if ((tamanho != 0) && (pos > 0) && (pos < tamanho)) {
			nome = nomes[pos];

			for (int i = pos; i < tamanho - 1; i++) {
				nomes[i] = nomes[i + 1];
			}
			tamanho--;
		} else {
			System.out.println("ERRO, Posição Invalida");
		}
		return nome;
	}
	
	public String percorrendo() {
		String aux = " ";

		for (int i = 0; i < tamanho; i++) {
			aux = aux + "\n" + nomes[i];
		}
		return aux;
	}

	
	
}
