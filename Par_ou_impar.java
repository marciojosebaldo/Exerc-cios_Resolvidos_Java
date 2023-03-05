import java.util.Scanner;

public class Par_ou_impar {
	public static void main (String[] args) {
		
		int n1;
		String resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		
		n1 = entrada.nextInt();
		
		resultado = (n1 % 2 == 0) ? "PAR" : "ÍMPAR";
		System.out.println(resultado);
		
		entrada.close();
	}
}