import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade5_A {
	public static void main (String[] args) throws IOException {
	
		Scanner input = new Scanner(System.in);
		DecimalFormat DF = new DecimalFormat ("0.00");
				
		int cod1, qtde1, cod2, qtde2;
		float preco1, preco2, valorfinal;
		
		System.out.println("Informe o código da peça: ");
		cod1 = input.nextInt();
		
		System.out.println("Informe a quantidade da peça: ");
		qtde1 = input.nextInt();
		
		System.out.println("Informe o valor da peça: ");
		preco1 = input.nextFloat();
		
		System.out.println("Informe o código da peça: ");
		cod2 = input.nextInt();
		
		System.out.println("Informe a quantidade da peça: ");
		qtde2 = input.nextInt();
		
		System.out.println("Informe o valor da peça: ");
		preco2 = input.nextFloat();
		
		valorfinal = qtde1 * preco1 + qtde2 * preco2;
		
		System.out.println("VALOR A PAGAR: R$ " + DF.format(valorfinal));
	}
}