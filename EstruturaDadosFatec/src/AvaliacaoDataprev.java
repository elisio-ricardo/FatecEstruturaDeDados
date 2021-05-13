import Lista05.dataPrev;

public class AvaliacaoDataprev {

	private NoDataprev inicio;

	public AvaliacaoDataprev() {
		inicio = null;
	}

	public void adicionaFinal(dataPrev n) {
		if (inicio == null) {
			NoDataprev t = new NoDataprev(n);
			inicio = t;
		} else {
			NoDataprev aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			NoDataprev t = new NoDataprev(n);
			aux.prox = t;
		}
	}

}