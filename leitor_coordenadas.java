import java.util.Scanner;

public class leitor_coordenadas {
	
	public static void main(String[] args) {
	
		int x, y;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe dois números diferentes de zero para identificar o quadrante: ");
		
		x = entrada.nextInt();
		y = entrada.nextInt();
		
		do {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
				
				System.out.println("");
				System.out.println("Informe novamente: ");
				x = entrada.nextInt();
				y = entrada.nextInt();
			}
			
			else if (x > 0 && y < 0) {
				System.out.println("Quarto");

				System.out.println("");
				System.out.println("Informe novamente: ");
				x = entrada.nextInt();
				y = entrada.nextInt();
			}
			
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");

				System.out.println("");
				System.out.println("Informe novamente: ");
				x = entrada.nextInt();
				y = entrada.nextInt();
			}
			
			else if (x < 0 && y >0) {
				System.out.println("Segundo");

				System.out.println("");
				System.out.println("Informe novamente: ");
				x = entrada.nextInt();
				y = entrada.nextInt();
			}
		
		}
	
		while (x != 0 && y != 0);
		
		entrada.close();
	}
}