import java.util.Scanner;

public class Atividade2_A {
	public static void main (String[] args) {
		
		float n1, n2 = 3.14159f, resultado;
				
		Scanner numero1 = new Scanner (System.in);
		System.out.println("Escreva o raio do círculo para obter a área: ");
		n1 = numero1.nextFloat();
		
		resultado = (n1*n1) * n2;
		System.out.format("%.4f%n", resultado);
		
		System.out.println("O resultado da área é: " + resultado);		
	}
}