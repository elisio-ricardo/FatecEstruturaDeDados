package Lista05;

import javax.swing.JOptionPane;

public class Ex02TestTemperatura {

	public static void main(String[] args) {

		Ex02ListaLigadaTemperatura t = new Ex02ListaLigadaTemperatura();

		int opc = 0;
		int pos = 0;
		int temp;

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane
					.showInputDialog("1 - Adiciona Final \n2 - Adiciona In�cio \n3 - Adiciona Posi��o \n4 - Remove Final "
							+ "\n5 - Remove In�cio \n6 - Remove Posi��o \n7 - Exibir\n9 - Finalizar"));
			switch (opc) {
			case 1:
				temp = Integer.parseInt(JOptionPane.showInputDialog("Informe a Temperatura"));
				t.adicionaFinal(temp);
				break;
			case 2:
				temp = Integer.parseInt(JOptionPane.showInputDialog("Informe a Temperatura"));
				t.adicionaInicio(temp);
				break;
			case 3:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posi��o"));
				temp = Integer.parseInt(JOptionPane.showInputDialog("Informe a Temperatura"));
				t.adicionaPosicao(temp, pos);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "A temperatura removida foi: " + t.removeFinal() + "�C");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "A temperatura removida foi: " + t.removeInicio()+ "�C");
				break;
			case 6:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posi��o"));
				JOptionPane.showMessageDialog(null, "A temperatura removida foi: " + t.removePosicao(pos)+ "�C");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Lista Temperaturas: " + t.percorre());

				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida");
			}
		}

	}

}
