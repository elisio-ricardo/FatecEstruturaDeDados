
package Lista05;

import javax.swing.JOptionPane;

public class Ex03ListaLigadaAlunos {

	private Ex03NoAlunos inicio;

	public Ex03ListaLigadaAlunos() {
		inicio = null;
	}

	public void adicionaInicio(Ex03Alunos n) {
		Ex03NoAlunos t = new Ex03NoAlunos(n);
		t.prox = inicio;
		inicio = t;
	}

	public void adicionaFinal(Ex03Alunos n) {
		if (inicio == null) {
			Ex03NoAlunos t = new Ex03NoAlunos(n);
			inicio = t;
			t.prox = null;
		} else {
			Ex03NoAlunos aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			Ex03NoAlunos t = new Ex03NoAlunos(n);
			aux.prox = t;
		}
	}

	public void adicionaPosicao(Ex03Alunos n, int pos) {

		Ex03NoAlunos t = new Ex03NoAlunos(n);

		if (pos == 1) {
			adicionaInicio(n);
		} else {
			Ex03NoAlunos aux = inicio;
			int count = 1;

			while (aux.prox != null && count < pos - 1) {
				aux = aux.prox;
				count++;
			}

			if (count == pos - 1) {
				t.prox = aux.prox;
				aux.prox = t;
			} else {
				JOptionPane.showMessageDialog(null, "ERRO, Posição Inválida!");
			}
		}
	}

	public Ex03Alunos removeInicio() {
		Ex03Alunos n = null;
		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			n = inicio.aluno;
			inicio = inicio.prox;
		}
		return n;
	}

	public Ex03Alunos removeFinal() {
		Ex03Alunos n = null;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			if (inicio.prox == null) {
				n = inicio.aluno;
				inicio = null;
			} else {
				Ex03NoAlunos aux1 = inicio;
				Ex03NoAlunos aux2 = inicio;

				n = recursivoRemoveFinal(aux1, aux2);// Envia dois objetos para remover no final, e retorna o elemento
														// removido
//				while (aux1.prox != null) {
//					aux2 = aux1;
//					aux1 = aux1.prox;
//				}
//
//				n = aux1.aluno;
//				aux2.prox = null;

			}
		}
		return n;
	}

	public Ex03Alunos removePosicao(int pos) {
		Ex03Alunos n = null;
		int i = 1;

		Ex03NoAlunos aux = inicio;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		}
		if (pos == i) {
			n = removeInicio();
		} else {

			i = recursivoValidaPos(aux, i);//Percorre toda a lista para retornar o tamanho da lista e validar a pos
//			while (aux.prox != null) {
//				aux = aux.prox;
//				i++;
//			}
			if (pos > i || pos <= 0) {
				JOptionPane.showMessageDialog(null, "ERRO, Posição Invalida");
				return n;
			} else if (pos == i) {
				n = removeFinal();
				return n;
			} else {
				i = 1;
				aux = inicio;
				Ex03NoAlunos aux2 = aux;

				n = recursivoRemove(aux, aux2, pos, i);//Percorre a lista e Remove o elemento na posição enviada
//				while (pos > 1) {
//					aux2 = aux;
//					aux = aux.prox;
//					pos--;
//				}
//				n = aux.aluno;
//				aux2.prox = aux.prox;
//				return n;
			}
		}
		return n;
	}

	public void percorre() {

		Ex03NoAlunos aux = inicio;
		StringBuilder s = new StringBuilder();
		if (aux == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			while (aux != null) {

				s.append("RA: " + aux.aluno.getRa() + ", Nome: " + aux.aluno.getNome() + ", Turma: "
						+ aux.aluno.getTurma() + ", Semestre: " + aux.aluno.getSemestre() + "\n");

				aux = aux.prox;
			}

			JOptionPane.showMessageDialog(null, s.toString());
		}

	}

	private int recursivoValidaPos(Ex03NoAlunos aux, int i) {
		if (aux.prox == null) {
			return i;
		}

		aux = aux.prox;
		return recursivoValidaPos(aux, i + 1);
	}

	private Ex03Alunos recursivoRemove(Ex03NoAlunos aux, Ex03NoAlunos aux2, int pos, int i) {

		if (pos == i) {
			aux2.prox = aux.prox;
			return aux.aluno;
		}
		aux2 = aux;
		aux = aux.prox;

		return recursivoRemove(aux, aux2, pos, i + 1);
	}

	private Ex03Alunos recursivoRemoveFinal(Ex03NoAlunos aux1, Ex03NoAlunos aux2) {
		if (aux1.prox == null) {
			aux2.prox = null;
			return aux1.aluno;
		}
		aux2 = aux1;
		aux1 = aux1.prox;

		return recursivoRemoveFinal(aux1, aux2);
	}

}
