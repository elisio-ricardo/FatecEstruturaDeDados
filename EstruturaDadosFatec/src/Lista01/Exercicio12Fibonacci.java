package Lista01;

public class Exercicio12Fibonacci {

	public static void main(String[] args) {

		int soma = fibonacci(11);
				
		System.out.println(soma);
	}

	private static int fibonacci(int num) {
	
		if(num == 0 || num == 1 ) {
			return num;
		}
	
		
		return  fibonacci(num - 1) + fibonacci(num - 2);
	}
	
	

}
