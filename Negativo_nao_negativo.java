import java.util.Scanner;

public class Negativo_nao_negativo {
	public static void main (String[] args) {
	
	int numero;
	String resultado;
	
	Scanner leitura = new Scanner(System.in);
	
	System.out.println("Informe um número: ");
	numero = leitura.nextInt();
	
	resultado = (numero >= 0) ? "NÃO NEGATIVO" : "NEGATIVO";
	System.out.println(resultado);
	
	leitura.close();

	}
}