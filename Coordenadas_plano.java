import java.util.Scanner;

public class Coordenadas_plano {
	public static void main (String[] args) {
		
		float x, y;
		
		Scanner entrada = new Scanner(System.in);
						
		System.out.println("Informe as 2 coordenadas: ");
		
		x = entrada.nextFloat();
		y = entrada.nextFloat();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		
		else if (x == 0 && y != 0) {
			System.out.println("Eixo Y");
		}
		
		else if (x != 0 && y == 0) {
			System.out.println("Eixo X");
		}
		
		else {
			System.out.println("Origem");
		}
		
		entrada.close();
	}
}