import java.util.Scanner;

public class EstruturaSequencialAtividade1 {
	public static void main(String[] args) {
		Scanner numero1 = new Scanner(System.in);
		Scanner numero2 = new Scanner(System.in);
		float n1;
		float n2;
		float resultado;
		
		System.out.println("Escreva um número: ");
		n1 = numero1.nextFloat();
		
		System.out.println("Escreva um segundo número: ");
		n2 = numero2.nextFloat();
		
		resultado = n1 + n2; 
		
		System.out.println("A soma dos números é: " + resultado);		
	}
}