import java.util.Scanner;

public class Exercicio1_C {
	public static void main (String[] args) {
		float n1, n2, resultado;
		
		Scanner numero1 = new Scanner(System.in);
		System.out.println("Escreva o primeiro número para somar: ");
		n1 = numero1.nextFloat();
		
		Scanner numero2 = new Scanner(System.in);
		System.out.println("Escreva o segundo número: ");
		n2 = numero2.nextFloat();
		
		resultado = n1 + n2;
		
		System.out.println("O resultado é " + resultado);
		
		numero1.close(); //Não é recomendado fechar o System.in. A própria JVM faz isso.
		numero2.close(); //Não é recomendado fechar o System.in. A própria JVM faz isso.
	}
}