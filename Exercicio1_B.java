import java.util.Scanner;

public class Exercicio1_B {
	public static void main (String[] args) {
		float n1;
		float n2;
		float resultado;
						
		Scanner numero1 = new Scanner(System.in);
		System.out.println("Escreva o primeiro número para somar: ");
		n1 = numero1.nextFloat();
				
		Scanner numero2 = new Scanner(System.in);
		System.out.println("Escreva o segundo número: ");
		n2 = numero2.nextFloat();
	
		resultado = n1 + n2;
		System.out.println("O resultado do soma é: " + resultado);
		
		numero1.close(); //Não é recomendado fechar o System.in
		numero2.close();
	}
}