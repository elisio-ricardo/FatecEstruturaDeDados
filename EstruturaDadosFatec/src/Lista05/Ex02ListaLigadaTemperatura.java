package Lista05;

import javax.swing.JOptionPane;

public class Ex02ListaLigadaTemperatura {

	private Ex02No inicio;

	public Ex02ListaLigadaTemperatura() {
		inicio = null;
	}

	public boolean vazia() {
		if (inicio == null) {
			return true;
		}
		return false;
	}

	public void adicionaInicio(int n) {
		Ex02No t = new Ex02No(n);
		t.prox = inicio;
		inicio = t;
	}

	public void adicionaFinal(int n) {
		if (inicio == null) {
			Ex02No t = new Ex02No(n);
			inicio = t;
		} else {
			Ex02No aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			Ex02No t = new Ex02No(n);
			aux.prox = t;
		}
	}

	public void adicionaPosicao(int n, int pos) {
		Ex02No t = new Ex02No(n);

		if (pos == 1) {
			adicionaInicio(n);
		} else {
			Ex02No aux = inicio;
			int count = 1;

			while (aux.prox != null && count < pos - 1) {
				aux = aux.prox;
				count++;
			}

			if (count == pos - 1) {
				t.prox = aux.prox;
				aux.prox = t;
			} else {
				JOptionPane.showMessageDialog(null, "Posição Inválida!");
			}
		}
	}

	public int removeInicio() {
		int n = -1;
		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "Lista Vázia");
		} else {
			n = inicio.temp;
			inicio = inicio.prox;
		}
		return n;
	}

	public int removeFinal() {
		int n = -1;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "Lista Vázia");
		} else {
			if (inicio.prox == null) {
				n = inicio.temp;
				inicio = null;
			} else {
				Ex02No aux1 = inicio;
				Ex02No aux2 = inicio;

				while (aux1.prox != null) {
					aux2 = aux1;
					aux1 = aux1.prox;
				}

				n = aux1.temp;
				aux2.prox = null;

			}
		}
		return n;
	}

	public int removePosicao(int pos) {
		int n = -1;
		int i = 1;

		Ex02No aux = inicio;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "Lista Vázia");
			return n;
		}
		if (pos == i) {
			n = removeInicio();
		} else {
			while (aux.prox != null) {
				aux = aux.prox;
				i++;
			}
			if (pos > i || pos <= 0) {
				JOptionPane.showMessageDialog(null, "Posição Invalida");
				return n;
			} else if (pos == i) {
				n = removeFinal();
				return n;
			} else {
				aux = inicio;
				Ex02No aux2 = aux;

				while (pos > 1) {
					aux2 = aux;
					aux = aux.prox;
					pos--;
				}
				n = aux.temp;
				aux2.prox = aux.prox;
				return n;
			}
		}
		return n;
	}
	
	public String percorre() {
		Ex02No aux = inicio;
		String r = " ";
		while (aux != null) {
			r = r + "\n" + aux.temp + "°C";
			aux = aux.prox;
		}
		return r;
	}
	

}
