package ListaUm;

public class exercicio11 {

	public static void main(String[] args) {

		double soma = divisao(3);
		System.out.println(soma);
	}

	private static double divisao(double num) {

		if (num == 0) {
			return 0;
		}

		return (1 / (num)) + divisao((num - 1));
	}

}
