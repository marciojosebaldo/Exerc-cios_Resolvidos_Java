import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade6_B {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		double A, B, C, triRet, circ, trap, quad, ret;
		
		System.out.println("Informe o primeiro valor: ");
		A = input.nextDouble();
		
		System.out.println("Informe o segundo valor: ");
		B = input.nextDouble();
			
		System.out.println("Informe o terceiro valor: ");
		C = input.nextDouble();
		
		triRet = A * C / 2;
		circ = C * C * 3.14159;
		trap = ((A + B) * C) / 2;
		quad = B * B;
		ret = A * B;
		
		System.out.println("TRIANGULO: " + df.format(triRet));
		System.out.println("CIRCULO: " + df.format(circ));
		System.out.println("TRAPEZIO: " + df.format(trap));
		System.out.println("QUADRADO: " + df.format(quad));
		System.out.println("RETANGULO: " + df.format(ret));
	}
}