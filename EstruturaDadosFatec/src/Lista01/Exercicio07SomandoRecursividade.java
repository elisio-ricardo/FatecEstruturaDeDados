package Lista01;

public class Exercicio07SomandoRecursividade {

	public static void main(String[] args) {
		int soma = Somando(1);
		System.out.println(soma);

	}

	private static int Somando(int num) {

		if (num == 100) {
			return 100;
		}

		return num + Somando(num + 1);
	}

}
