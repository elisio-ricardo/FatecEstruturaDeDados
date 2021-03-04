package Lista03;

public class Livro {
	
	public String titulo;
	public int quantidade;
	
	public Livro(String titulo, int quantidade) {
		this.titulo = titulo;
		this.quantidade = quantidade;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
