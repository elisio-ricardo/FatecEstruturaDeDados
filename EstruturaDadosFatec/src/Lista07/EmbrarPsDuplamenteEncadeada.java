package Lista07;

import javax.swing.JOptionPane;

public class EmbrarPsDuplamenteEncadeada {
	
	
	private NoEmbraerP2 inicio;

	public EmbrarPsDuplamenteEncadeada() {
		inicio = null;
	}
	
	
	public EmbraerP2 removeFinal() {
		EmbraerP2 n = null;

		if (inicio == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			if (inicio.prox == null) {
				n = inicio.embraer;
				inicio = null;
			} else {
				NoEmbraerP2 aux1 = inicio;
				NoEmbraerP2 aux2 = inicio;

				n = recursivoRemoveFinal(aux1, aux2);// Envia dois objetos para remover no final, e retorna o elemento
														// removido
			}
		}
		return n;
	}

	
	
	private EmbraerP2 recursivoRemoveFinal(NoEmbraerP2 aux1, NoEmbraerP2 aux2) {
		if (aux1.prox == null) {
			aux1.anterior=null;
			aux2.prox = null;
			return aux1.embraer;
		}
		aux2 = aux1;
		aux1 = aux1.prox;

		return recursivoRemoveFinal(aux1, aux2);
	}


	public void adicionaInicio(EmbraerP2 n) {
		NoEmbraerP2 t = new NoEmbraerP2(n);
		if(inicio!=null) {
			t.prox = inicio;
			inicio.anterior = t;
		}
		inicio = t;
	}
	
	
	public void percorre() {

		NoEmbraerP2 aux = inicio;
		StringBuilder s = new StringBuilder();
		if (aux == null) {
			JOptionPane.showMessageDialog(null, "ERRO, Lista Vázia");
		} else {
			while (aux != null) {

				s.append("RA: " + aux.embraer.getRa() + ", Nome: " + aux.embraer.getNome() + ", Turma: "
						+ aux.embraer.getTurma() + "\n");

				aux = aux.prox;
			}

			JOptionPane.showMessageDialog(null, s.toString());
		}

	}
}
