package Lista05;

import javax.swing.JOptionPane;

public class Ex03TestListaAluno {

	public static void main(String[] args) {

		Ex03ListaLigadaAlunos a = new Ex03ListaLigadaAlunos();

		int opc = 0;
		int pos = 0;
		int ra = 0;
		Ex03Alunos elemento;
		String nome = null;
		String turma = null;
		String semestre = null;

		while (opc != 9) {

			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"1-Adiciona Final \n2-Adiciona Início \n3-Adiciona Posição \n4-Remove Final "
					+ "\n5-Remove Início \n6-Remove Posição \n7-Exibir \n9-Finalizar"));

			switch (opc) {
			case 1:
				ra = Integer.parseInt(JOptionPane.showInputDialog("Informe o RA"));
				nome = (JOptionPane.showInputDialog("Informe o Nome"));
				turma = (JOptionPane.showInputDialog("Informe a turma"));
				semestre = (JOptionPane.showInputDialog("Informe o Semestre"));

				a.adicionaFinal(new Ex03Alunos(ra, nome, turma, semestre));
				break;
			case 2:
				ra = Integer.parseInt(JOptionPane.showInputDialog("Informe o RA"));
				nome = (JOptionPane.showInputDialog("Informe o Nome"));
				turma = (JOptionPane.showInputDialog("Informe a turma"));
				semestre = (JOptionPane.showInputDialog("Informe o Semestre"));
				a.adicionaInicio(new Ex03Alunos(ra, nome, turma, semestre));
				break;
			case 3:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição"));
				ra = Integer.parseInt(JOptionPane.showInputDialog("Informe o RA: "));
				nome = (JOptionPane.showInputDialog("Informe o Nome: "));
				turma = (JOptionPane.showInputDialog("Informe a turma: "));
				semestre = (JOptionPane.showInputDialog("Informe o Semestre: "));
				
				a.adicionaPosicao(new Ex03Alunos(ra, nome, turma, semestre), pos);
				break;
			case 4:

				elemento = a.removeFinal();
				if (elemento != null) {
					JOptionPane.showMessageDialog(null, "O elemento removido foi: " + "RA: " + elemento.getRa() + ", Nome: " + elemento.getNome() + ", Turma: "
							+ elemento.getTurma() + ", Semestre: " + elemento.getSemestre() + "\n");
				}
				break;
			case 5:
				elemento = a.removeInicio();
				if (elemento != null) {
					JOptionPane.showMessageDialog(null, "O elemento removido foi: " + "RA: " + elemento.getRa() + ", Nome: " + elemento.getNome() + ", Turma: "
							+ elemento.getTurma() + ", Semestre: " + elemento.getSemestre() + "\n");
				}
				break;
			case 6:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição"));
				elemento = a.removePosicao(pos);
				if (elemento != null) {
					JOptionPane.showMessageDialog(null, "O elemento removido foi: " + "RA: " + elemento.getRa() + ", Nome: " + elemento.getNome() + ", Turma: "
							+ elemento.getTurma() + ", Semestre: " + elemento.getSemestre() + "\n");
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
