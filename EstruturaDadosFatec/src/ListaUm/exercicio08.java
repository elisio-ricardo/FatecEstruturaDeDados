package ListaUm;

public class exercicio08 {

	public static void main(String[] args) {

		int soma = SomandoPares(1);
		System.out.println(soma);

	}

	private static int SomandoPares(int num) {

		if (num == 200) {
			return 200;
		}
		if (num % 2 != 0) {
			return SomandoPares(num + 1);
		}
		return num + SomandoPares(num + 1);
	}

}
