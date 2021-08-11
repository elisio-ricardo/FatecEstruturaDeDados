package Lista01;

public class Exercicio09SomandoParesRecursividade {

	public static void main(String[] args) {

		int soma = SomandoPares(1);
		System.out.println(soma);

	}

	private static int SomandoPares(int num) {

		if (num == 300) {
			return 0;
		}
		if (num % 2 == 0) {
			return SomandoPares(num + 1);
		}
		return num + SomandoPares(num + 1);
	}

}
