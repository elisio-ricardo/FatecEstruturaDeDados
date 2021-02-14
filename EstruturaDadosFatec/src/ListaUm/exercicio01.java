package ListaUm;

public class exercicio01 {

	public static void main(String[] args) {


		int mediaPositivos = 0;
		int mP = 0;
		int mediaTotal = 0;
		int somaNegativos = 0;
		int vetor[] = new int[100];


		for (int i = 0; i < vetor.length; i++) {
			vetor[i] =(int) ((Math.random() * 2000) - 1000);
			if (vetor[i] > 99 && vetor[i] < 1001) {
				mediaPositivos += vetor[i];
				mP++;
			} else if (vetor[i] < 0) {
				somaNegativos += vetor[i];
			}

			mediaTotal += vetor[i];
			//System.out.println(vetor[i]);
		}

		System.out.println("A media total foi " + (mediaTotal/vetor.length));
		System.out.println("A soma dos negativos foi " + somaNegativos);
		System.out.println("A media dos positivos foi " + (mediaPositivos/mP));
	}

}
