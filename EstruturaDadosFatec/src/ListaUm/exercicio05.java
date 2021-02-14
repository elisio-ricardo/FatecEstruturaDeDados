package ListaUm;

import javax.swing.JOptionPane;

public class exercicio05 {

	public static void main(String[] args) {

		int matriz[][] = new int[4][4];
		int aux = 1;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				if (i == j) {
					matriz[i][j] = aux;
					aux *= 3;
				} else {
					matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da matriz "));
				}

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
