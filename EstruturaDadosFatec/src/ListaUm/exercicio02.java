package ListaUm;

public class exercicio02 {

	public static void main(String[] args) {

		int vetor[] = new int[5];
		int fatorial[] = new int[5];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 10);

			System.out.println(vetor[i]);
			fatorial[i] = fatoracaoUm(vetor[i]);
		}

		// int fatorialUm = fatoracaoUm(vetor[0]);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("O valor foi " + vetor[i] + " e seu fatorial é " + fatorial[i]);
		}
	}

	public static int fatoracaoUm(int vetor) {
		int fatorial = 1;
		for (int i = 1; i <= vetor; i++) {
			fatorial *= i;
		}
		return fatorial;

	}

}
