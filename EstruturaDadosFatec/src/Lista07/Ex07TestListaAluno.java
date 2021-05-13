package Lista07;

import javax.swing.JOptionPane;

public class Ex07TestListaAluno {

	public static void main(String[] args) {

		Ex07ListaDuplamenteLigadaAlunos a = new Ex07ListaDuplamenteLigadaAlunos();

		int opc = 0;
		int pos = 0;
		int id = 0;
		Ex07Alunos elemento;
		String nome = null;
		String turma = null;

		while (opc != 9) {

			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"1-Adiciona Início \n2-Adiciona Final  \n3-Adiciona Posição \n4-Remove Início "
					+ "\n5-Remove Final \n6-Remove Posição \n7-Exibir \n8-Verifica se esta vazia \n9-Finalizar"));

			switch (opc) {
			
			case 1:
				id = Integer.parseInt(JOptionPane.showInputDialog("Informe o RA"));
				nome = (JOptionPane.showInputDialog("Informe o Nome"));
				turma = (JOptionPane.showInputDialog("Informe a turma"));
				a.adicionaInicio(new Ex07Alunos(id, nome, turma));
				break;
				
			case 2:
				id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID"));
				nome = (JOptionPane.showInputDialog("Informe o Nome"));
				turma = (JOptionPane.showInputDialog("Informe a turma"));

				a.adicionaFinal(new Ex07Alunos(id, nome, turma));
				break;
				
			case 3:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição"));
				id = Integer.parseInt(JOptionPane.showInputDialog("Informe o RA: "));
				nome = (JOptionPane.showInputDialog("Informe o Nome: "));
				turma = (JOptionPane.showInputDialog("Informe a turma: "));
				
				a.adicionaPosicao(new Ex07Alunos(id, nome, turma), pos);
				break;
			
			case 4:
				elemento = a.removeInicio();
				if (elemento != null) {
					JOptionPane.showMessageDialog(null, "O elemento removido foi: " + "RA: " + elemento.getRa() + ", Nome: " + elemento.getNome() + ", Turma: "
							+ elemento.getTurma() +  "\n");
				}
				break;
				
			case 5:
				elemento = a.removeFinal();
				if (elemento != null) {
					JOptionPane.showMessageDialog(null, "O elemento removido foi: " + "RA: " + elemento.getRa() + ", Nome: " + elemento.getNome() + ", Turma: "
							+ elemento.getTurma() +  "\n");
				}
				break;
				
			case 6:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição"));
				elemento = a.removePosicao(pos);
				if (elemento != null) {
					JOptionPane.showMessageDialog(null, "O elemento removido foi: " + "RA: " + elemento.getRa() + ", Nome: " + elemento.getNome() + ", Turma: "
							+ elemento.getTurma() + "\n");
				}
				break;
				
			case 7:
				a.percorre();
				break;
				
			case 8:
				a.verifica();
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
