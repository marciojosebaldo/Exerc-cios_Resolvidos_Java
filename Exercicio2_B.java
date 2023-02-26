import java.util.Scanner;
import java.math.*;

public class Exercicio2_B {
	public static void main (String[] args) {
		
		float n1, n2 = 3.14159f, resultado;
		
		Scanner numero1 = new Scanner (System.in);
		System.out.println("Qual a medida do raio para obter a área do círculo: ");
		n1 = numero1.nextFloat();
		
		double n1D = n1; // Casting: converteu o float em double
		resultado = (float) (Math.pow(n1D, 2) * n2); // Função para raiz quadrada
		
		System.out.format("A área é de: %.4f%n", resultado);
		
		numero1.close();
		}
}