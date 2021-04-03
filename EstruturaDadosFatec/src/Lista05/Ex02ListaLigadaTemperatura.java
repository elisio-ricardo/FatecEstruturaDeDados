package Lista05;

import javax.swing.JOptionPane;

public class Ex02ListaLigadaTemperatura {

	private Ex02NoTemperatura inicio;

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
		Ex02NoTemperatura t = new Ex02NoTemperatura(n);
		t.prox = inicio;
		inicio = t;
	}

	public void adicionaFinal(int n) {
		if (inicio == null) {
			Ex02NoTemperatura t = new Ex02NoTemperatura(n);
			inicio = t;
		} else {
			Ex02NoTemperatura aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			Ex02NoTemperatura t = new Ex02NoTemperatura(n);
			aux.prox = t;
		}
	}

	public void adicionaPosicao(int n, int pos) {
		Ex02NoTemperatura t = new Ex02NoTemperatura(n);

		if (pos == 1) {
			adicionaInicio(n);
		} else {
			Ex02NoTemperatura aux = inicio;
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
				Ex02NoTemperatura aux1 = inicio;
				Ex02NoTemperatura aux2 = inicio;

				n = recursivoRemoveFinal(aux1, aux2); // Analisa toda a lista até encontrar o fim e remover o ultimo
														// elemento.

//				while (aux1.prox != null) {
//					aux2 = aux1;
//					aux1 = aux1.prox;
//				}
//
//				n = aux1.temp;
//				aux2.prox = null;

			}
		}
		return n;
	}

	public int removePosicao(int pos) {
		int n = -1;
		int i = 1;

		Ex02NoTemperatura aux = inicio;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "Lista Vázia");
			return n;
		}

		if (pos == i) {
			n = removeInicio();
		} else {

			i = recursivoValidaPos(aux, i);// Envia a Lista e o i para retornar se a posição é valida. E retorna o
											// tamanho da lista
//			while (aux.prox != null) {
//				aux = aux.prox;
//				i++;
//			}

			if (pos > i || pos <= 0) {
				JOptionPane.showMessageDialog(null, "Posição Invalida");
				return n;
			} else if (pos == i) {
				n = removeFinal();
				return n;
			} else {
				aux = inicio;
				i = 1;
				Ex02NoTemperatura aux2 = aux;
				n = recursivoRemove(aux, aux2, pos, i);// Percorre a Lista até chegar na posição de remoção e retorna o
														// elemento removido
//				while ( pos != i ) {
//					aux2 = aux;
//					aux = aux.prox;
//					i++;
//				}
//				n = aux.temp;
//				aux2.prox = aux.prox;
				return n;
			}
		}
		return n;
	}

	private int recursivoValidaPos(Ex02NoTemperatura aux, int i) {
		if (aux.prox == null) {
			return i;
		}

		aux = aux.prox;
		return recursivoValidaPos(aux, i + 1);
	}

	private int recursivoRemove(Ex02NoTemperatura aux, Ex02NoTemperatura aux2, int pos, int i) {

		if (pos == i) {
			aux2.prox = aux.prox;
			return aux.temp;
		}
		aux2 = aux;
		aux = aux.prox;

		return recursivoRemove(aux, aux2, pos, i + 1);
	}

	private int recursivoRemoveFinal(Ex02NoTemperatura aux1, Ex02NoTemperatura aux2) {
		if (aux1.prox == null) {
			aux2.prox = null;
			return aux1.temp;
		}
		aux2 = aux1;
		aux1 = aux1.prox;

		return recursivoRemoveFinal(aux1, aux2);
	}

	public String percorre() {
		Ex02NoTemperatura aux = inicio;
		String r = " ";
		while (aux != null) {
			r = r + "\n" + aux.temp + "°C";
			aux = aux.prox;
		}
		return r;
	}

}
