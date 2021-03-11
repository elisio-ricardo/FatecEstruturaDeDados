package Lista03;

public class PilhaLivro {

	private Livro dados[];
	private int tamanho = 0;

	public PilhaLivro(int qtd) {

		dados = new Livro[qtd];
	}

	public void push(Livro elemento) {
		if (tamanho < dados.length) {
			dados[tamanho] = elemento;
			tamanho++;
		} else {
			System.out.println("ERRO, Lista Cheia");
		}
	}

	public void pop() {
		if (tamanho != 0) {
			tamanho--;
		} else {
			System.out.println("ERRO, Pilha Vazia");
		}
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (tamanho != 0) {
			for (int i = 0; i < tamanho; i++) {
				s.append("Titulo : " + dados[i].getTitulo() + ", Quantidade: " + dados[i].quantidade + "\n");
			}
		} else {
			System.out.println("ERRO, Pilha Vazia");
		}
		return s.toString();
	}

}
