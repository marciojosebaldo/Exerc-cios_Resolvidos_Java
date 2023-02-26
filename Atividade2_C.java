import java.util.Scanner;
import java.math.*;

public class Atividade2_C {
	public static void main (String[] args) {

		int n1, resultado;
		float n2 = 3.14159f;
		
		System.out.println("Informe o raio para gerar a área do círculo: ");
		Scanner numero1 = new Scanner (System.in);
		n1 = numero1.nextInt();
				
		resultado = (int) Math.pow(n1, 2);
		
		float resultadoF = (float) resultado * n2;
			
		System.out.format("A área é: %.4f%n", resultadoF);
		
		numero1.close();
	}
}