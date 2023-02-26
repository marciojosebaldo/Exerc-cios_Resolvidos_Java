import java.util.Scanner;

public class Atividade3_B {
	public static void main (String[] args) {
		
		int a, b, c, d, prod1, prod2, res;
		
		System.out.println("Informe o 1° número: ");
		Scanner a1 = new Scanner(System.in);
		a = a1.nextInt();
		
		System.out.println("Informe o 2° número: ");
		Scanner b1 = new Scanner(System.in);
		b = b1.nextInt();
		
		System.out.println("Informe o 3° número: ");
		Scanner c1 = new Scanner(System.in);
		c = c1.nextInt();
		
		System.out.println("Informe o 4° número: ");
		Scanner d1 = new Scanner(System.in);
		d = d1.nextInt();
		
		prod1 = a * b;
		prod2 = c * d;
		
		res = prod1 - prod2;
		
		System.out.println("O resultado é: " + res);
	}
}