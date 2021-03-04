package Lista03;

import javax.swing.JOptionPane;

public class testeLivro {

	public static void main(String[] args) {

		String title;
		int qtdLivros;
		int qtd = 10;
		PilhaLivro dadosPilha = new PilhaLivro(qtd);
		FilaLivro dadosFila = new FilaLivro(qtd);

		int opc = 0;
		while (opc != 9) {

			opc = Integer
					.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n" + "1 - Adiciona livro Pilha \n"
							+ "2 - Retira livro Pilha \n" + "3 - Mostrar Pilha; 4 - Adiciona livro Fila \n"
							+ "5 - Retira livro Fila \n" + "6 - Mostrar Fila;\n" + "9 - Finalizar Aplicação."));

			switch (opc) {
			case 1:
				title = JOptionPane.showInputDialog("Informe o Título");
				qtdLivros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Livros: "));
				dadosPilha.push(new Livro(title, qtdLivros));
				break;
			case 2:
				System.out.println("Elemento removido");
				dadosPilha.pop();
				break;
			case 3:
				System.out.println(dadosPilha);
				break;
			case 4:
				title = JOptionPane.showInputDialog("Informe o Título");
				qtdLivros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Livros: "));
				dadosFila.push(new Livro(title, qtdLivros));
				break;
			case 5:
				System.out.println("Elemento removido");
				dadosFila.pop();
				break;
			case 6:
				System.out.println(dadosFila);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando aplicação.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		}
	}
}
