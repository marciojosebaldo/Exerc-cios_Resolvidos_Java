/*
Imprima os primeiros números da série de Fibonacci até passar de 100. A série de
Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro elemento vale 0, o
segundo vale 1, e daí por diante. O n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-
ésimo elemento (ex: 8 = 5 + 3).
 */
public class FibonacciAteCem {

	public static void main(String[] args) {

		long fibonacci = 0;
		long vetor[] = new long[100];

		for (int i = 0; i <= 99; i++) {

			if (i == 0) {
				vetor[i] = 0;
				fibonacci = vetor[i];
			}

			else if (i == 1) {
				vetor[i] = 1;
				fibonacci = vetor[i];
			}

			else if (i == 2) {
				vetor[i] = 1;
				fibonacci = vetor[i];
			}

			else {
				vetor[i] = fibonacci;
				fibonacci = vetor[i] + vetor[i - 1];
			}
			
			System.out.println("Fibonacci do elemento " + (i + 1) + " = " + fibonacci + ". Valor do vetor = " + vetor[i]);

		}
	}
}