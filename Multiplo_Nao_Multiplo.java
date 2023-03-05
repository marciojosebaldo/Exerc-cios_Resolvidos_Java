import java.util.Scanner;

public class Multiplo_Nao_Multiplo {
	public static void main (String[] args) {
		
		int n1, n2;
		String resultado;
		
		System.out.println("Informe 2 valores: ");
		
		Scanner entrada = new Scanner(System.in);
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		
		resultado = (n1 % n2 == 0 || n2 % n1 == 0) ? "São múltiplos" : "Não são múltiplos";
		System.out.println(resultado);
		
		entrada.close();
	}
}