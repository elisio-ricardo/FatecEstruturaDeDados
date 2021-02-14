package ListaUm;

public class exercicio03 {

	public static void main(String[] args) {

		int[] vetor = new int[100];
		int aux;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) ((Math.random() * 200) - 100);
		}

		for (int i = 0; i < vetor.length - 1; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.print(vetor[i]+ " ~ ");
		}
		
	}

}
