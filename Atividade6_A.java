import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade6_A {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.000");
		
		double A, B, C, triangulo_Ret, circulo, trapezio, quadrado, retangulo; 
		
		System.out.println("Primeiro valor: ");
		A = input.nextDouble();
		
		System.out.println("Segundo valor:");
		B = input.nextDouble();
		
		System.out.println("Terceiro valor: ");
		C = input.nextDouble();
		
		triangulo_Ret = (A * C)/2;
		circulo = C * C * 3.14159;
		trapezio = ((A + B) * C) / 2;
		quadrado = B * B;
		retangulo = A * B;

		System.out.println("TRIANGULO: " + df.format(triangulo_Ret));
		System.out.println("CÍRCULO: " + df.format(circulo));
		System.out.println("TRAPEZIO: " + df.format(trapezio));
		System.out.println("QUADRADO: " + df.format(quadrado));
		System.out.println("RETANGULO: " + df.format(retangulo));
	}
}