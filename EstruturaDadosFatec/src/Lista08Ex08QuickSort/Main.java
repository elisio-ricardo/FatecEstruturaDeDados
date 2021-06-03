package Lista08Ex08QuickSort;

public class Main {

	public static void main(String[] args) {
		int [] lista = {149,192,47,152,159,195,61,66,17,167,118,64,27,80,30,105};
		quicksort(lista, 0, lista.length - 1);
		
		for(int f = 0; f<lista.length; f++) {
			System.out.print(lista[f] + ", ");
		}

	}
	
	static void quicksort(int [] lista, int inicio, int fim) {
		
		int i = inicio;
		int j = fim;
		int pos = (inicio+fim)/2;
		int pivo = lista[pos];
		int aux;
		
		if(inicio < fim) { // se a lista for unitária
			while(i<j) {
				while(lista[i] < pivo) {
					i++;
				}
				while(lista[j] > pivo) {
					j--;
				}
				if(lista[i] == pivo) {
					pos = i;
				}
				else if(lista[j] == pivo) {
					pos = j;
				}
				aux = lista[i];
				lista[i] = lista[j];
				lista[j] = aux;
			}
			quicksort(lista, inicio, pos);
			quicksort(lista, pos+1, fim);

		}
		
	}

}
