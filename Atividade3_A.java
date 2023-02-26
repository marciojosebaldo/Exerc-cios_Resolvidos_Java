import java.util.Scanner;

public class Atividade3_A {
	public static void main (String[] args) {
		
		int a, b, c, d, produto1, produto2, resultado;
		
		System.out.println("Informe 4 números abaixo: ");
		
		System.out.println("Primeiro número: ");
		Scanner a1 = new Scanner(System.in);
		a = a1.nextInt();
		
		System.out.println("Segundo número: ");
		Scanner b1 = new Scanner(System.in);
		b = b1.nextInt();
		
		System.out.println("Terceiro número: ");
		Scanner c1 = new Scanner(System.in);
		c = c1.nextInt();
		
		System.out.println("Quarto número: ");
		Scanner d1 = new Scanner(System.in);
		d = d1.nextInt();
		
		produto1 = a*b;
		produto2 = c*d;
		resultado = produto1 - produto2;
		
		System.out.println("O resultado é :" + resultado);
	}
}