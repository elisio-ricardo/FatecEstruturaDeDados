package Lista07;

import javax.swing.JOptionPane;

public class TesteEmbraerP2 {

	public static void main(String[] args) {

		
		EmbrarPsDuplamenteEncadeada a = new EmbrarPsDuplamenteEncadeada();

		int opc = 0;
		int pos = 0;
		int id = 0;
		EmbraerP2 elemento;
		String nome = null;
		String turma = null;

		while (opc != 9) {

			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"1-Adiciona Início "
					+ "\n5-Remove Final  \n7-Exibir  \n9-Finalizar"));

			switch (opc) {
			
			
			case 1:
				id = Integer.parseInt(JOptionPane.showInputDialog("Informe o RA"));
				nome = (JOptionPane.showInputDialog("Informe o Nome"));
				turma = (JOptionPane.showInputDialog("Informe a turma"));
				a.adicionaInicio(new EmbraerP2(id, nome, turma));
				break;
		
				
			case 5:
				elemento = a.removeFinal();
				if (elemento != null) {
					JOptionPane.showMessageDialog(null, "O elemento removido foi: " + "RA: " + elemento.getRa() + ", Nome: " + elemento.getNome() + ", Turma: "
							+ elemento.getTurma() +  "\n");
				}
				break;
			case 7:
				a.percorre();
				break;
				
			
			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválido");
			}
		}
	}
		
		
	}


