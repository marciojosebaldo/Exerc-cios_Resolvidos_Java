import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Atividade5_B {
	public static void main (String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat DF = new DecimalFormat("0.00");
				
		int cod1, qtde1, cod2, qtde2;
		float valor1, valor2, valor_final;
		
		System.out.println("Informe o código: ");
		cod1 = input.nextInt();
		
		System.out.println("Informe a quantidade: ");
		qtde1 = input.nextInt();
		
		System.out.println("Informe o valor: ");
		valor1 = input.nextFloat();
		
		System.out.println("Informe o código: ");
		cod2 = input.nextInt();
		
		System.out.println("Informe a quantidade: ");
		qtde2 = input.nextInt();
		
		System.out.println("Informe o valor: ");
		valor2 = input.nextFloat();
		
		valor_final = qtde1 * valor1 + qtde2 * valor2;
		
		System.out.println("VALOR A PAGAR: " + DF.format(valor_final));
		
	}
}