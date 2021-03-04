package Lista03;

import javax.swing.JOptionPane;

public class testePilhaFila {

	public static void main(String[] args) {

		Fila fila = new Fila();
		Pilha pilha = new Pilha();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção: \n 1 - Adicionar elemento Fila"
					+ "\n 2 - Remover elemento Fila \n 3 - Adicionar Elemento Pilha \n 4 - Remover elemento Pilha"
					+ "\n 9 - Finalizar"));
			int numero;
			switch (opc) {

			case 1:
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
				fila.adicionaFila(numero);
				break;
			case 2:
				numero = fila.remove();
				
				pilha.adicionaPilha(numero);
				break;
			case 3:
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
				pilha.adicionaPilha(numero);
				break;
			case 4:
				numero =pilha.removePilha();
				fila.adicionaFila(numero);
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando",
						null, JOptionPane.INFORMATION_MESSAGE);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida",
						null, JOptionPane.INFORMATION_MESSAGE);

			}
		}

	}

}
