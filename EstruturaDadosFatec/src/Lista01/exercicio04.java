package Lista01;

import java.math.BigInteger;

public class exercicio04 {

	public static void main(String[] args) {
		
		
		int matriz[][] = new int[4][4];
		int soma = 0;
		int impares = 0;
		int divisiveisOito = 0;
		int divisiveisTres = 0;
		long fatorial;
		int numMaior = 0;
		
		
		
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) ((Math.random() * 100));//Carregando valores na matriz
				soma += matriz[i][j];
				System.out.print(matriz[i][j] + " ");

				if ((matriz[i][j] % 2 != 0) && (matriz[i][j] > 30) && (matriz[i][j] < 50) ) {//impares entre 30 e 50
					impares++;
				} else if (matriz[i][j] % 8 == 0) {//divisiveis po 8
					divisiveisOito++;
				} else if (matriz[i][j] % 3 == 0) {//divisiveis por 3
					divisiveisTres++;
				}
				if(matriz[i][j] > numMaior) {
					numMaior = matriz[i][j];
				}
			}
			System.out.println();
					
			
		}	
		
		System.out.println(numMaior);
		
		fatorial = fatoracao(numMaior);
		System.out.println("O total de numeros impares entre 30 e 50 foi "+impares);
		System.out.println("O total de numeros divisiveis por 8 foi "+divisiveisOito);
		System.out.println("O total de numeros divisiveis por 3 foi "+divisiveisTres);
		System.out.println("O fatorial do maior valor foi " + fatorial); //esta estourando a memoria

		}



	public static long fatoracao(int numMaior) {
		long fatorial = 1;
		for (int i = 1; i <= numMaior; i++) {
			fatorial *= i;
		}
		return (long) fatorial;
	}

}
