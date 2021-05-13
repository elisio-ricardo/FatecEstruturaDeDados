
package Lista07;

import javax.swing.JOptionPane;

public class Ex07ListaDuplamenteLigadaAlunos {

	private Ex07NoAlunos inicio;

	public Ex07ListaDuplamenteLigadaAlunos() {
		inicio = null;
	}
	
public void verifica() {
		
		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "True");
		}else {
			JOptionPane.showMessageDialog(null, "False");
		}
	}


	public void adicionaInicio(Ex07Alunos n) {
		Ex07NoAlunos t = new Ex07NoAlunos(n);
		if(inicio!=null) {
			t.prox = inicio;
			inicio.anterior = t;
		}
		inicio = t;
	}

	public void adicionaFinal(Ex07Alunos n) {
		Ex07NoAlunos t = new Ex07NoAlunos(n);
		if (inicio == null) {
			inicio = t;
			t.anterior=null;
			t.prox = null;
		} else {
			Ex07NoAlunos aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = t;
			t.anterior=aux;
			t.prox=null;
		}
	}

	public void adicionaPosicao(Ex07Alunos n, int pos) {

		Ex07NoAlunos t = new Ex07NoAlunos(n);

		if (pos == 1) {
			adicionaInicio(n);
		} else {
			Ex07NoAlunos aux = inicio;
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

	public Ex07Alunos removeInicio() {
		Ex07Alunos n = null;
		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			n = inicio.aluno;
			inicio = inicio.prox;
			if(inicio!=null) {
				inicio.anterior=null;
			}
		}
		return n;
	}

	public Ex07Alunos removeFinal() {
		Ex07Alunos n = null;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			if (inicio.prox == null) {
				n = inicio.aluno;
				inicio = null;
			} else {
				Ex07NoAlunos aux1 = inicio;
				Ex07NoAlunos aux2 = inicio;

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

	public Ex07Alunos removePosicao(int pos) {
		Ex07Alunos n = null;
		int i = 1;

		Ex07NoAlunos aux = inicio;

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
				Ex07NoAlunos aux2 = aux;

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

		Ex07NoAlunos aux = inicio;
		StringBuilder s = new StringBuilder();
		if (aux == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			while (aux != null) {

				s.append("RA: " + aux.aluno.getRa() + ", Nome: " + aux.aluno.getNome() + ", Turma: "
						+ aux.aluno.getTurma() + "\n");

				aux = aux.prox;
			}

			JOptionPane.showMessageDialog(null, s.toString());
		}

	}

	private int recursivoValidaPos(Ex07NoAlunos aux, int i) {
		if (aux.prox == null) {
			return i;
		}

		aux = aux.prox;
		return recursivoValidaPos(aux, i + 1);
	}

	private Ex07Alunos recursivoRemove(Ex07NoAlunos aux, Ex07NoAlunos aux2, int pos, int i) {

		if (pos == i) {
			aux.anterior = null;
			aux2.prox = aux.prox;
			return aux.aluno;
		}
		aux2 = aux;
		aux = aux.prox;

		return recursivoRemove(aux, aux2, pos, i + 1);
	}

	private Ex07Alunos recursivoRemoveFinal(Ex07NoAlunos aux1, Ex07NoAlunos aux2) {
		if (aux1.prox == null) {
			aux1.anterior=null;
			aux2.prox = null;
			return aux1.aluno;
		}
		aux2 = aux1;
		aux1 = aux1.prox;

		return recursivoRemoveFinal(aux1, aux2);
	}

	
}
