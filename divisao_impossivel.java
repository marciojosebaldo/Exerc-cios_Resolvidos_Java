import java.util.Scanner;

/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/

public class divisao_impossivel {
	public static void main(String[] args) {

		int n;
		float numerador, denominador, resultado;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe quantas divisões deseja fazer: ");

		n = entrada.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Informe o primeiro valor: ");
			numerador = entrada.nextFloat();

			System.out.println("Informe o segundo valor: ");
			denominador = entrada.nextFloat();

			if (denominador == 0) {
				System.out.println("Divisão impossível");
			}

			else {

				resultado = numerador / denominador;

				System.out.println(resultado);
			}

		}

		entrada.close();
	}
}