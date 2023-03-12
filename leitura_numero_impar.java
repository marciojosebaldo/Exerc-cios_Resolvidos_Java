import java.util.Scanner;

public class leitura_numero_impar {
	public static void main (String[] args) {
		
		int x;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		
		x = entrada.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if (i % 2 == 1) {
				System.out.println(i);	
			}			
		}
		
		entrada.close();
	}
}