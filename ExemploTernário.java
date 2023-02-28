import java.util.Scanner;

public class ExemploTernário {
	public static void main (String[] args) {
		String resultado;
		int numero;
		
		Scanner comparador = new Scanner (System.in);		
		System.out.println("Informe um número: ");
		numero = comparador.nextInt();
		
		resultado = (numero > 0) ? "Positivo!" : "Negativo!";
		System.out.println(resultado);		
		
		comparador.close();
	}
}