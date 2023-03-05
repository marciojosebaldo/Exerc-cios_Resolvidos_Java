import java.util.Scanner;

public class Menu_lanche_preco {
	public static void main (String[] args) {
		
		int lanche, qtde;
		double resultado, valor = 0.00;
		
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Escolha o lanche e a quantidade: %n" + 
						"1 - Cachorro quente			= R$ 4,00%n" +
						"2 - X-Salada				= R$ 4,50%n" +
						"3 - X-Bacon				= R$ 5,00%n" +
						"4 - Torrada simples			= R$ 2,00%n" +
						"5 - Refrigerante			= R$ 1,50%n");
		
		lanche = entrada.nextInt();
		qtde = entrada.nextInt();
			
		switch(lanche) {
		
		case 1:
			valor = 4;			
		break;
		
		case 2:
			valor = 4.50;
		break;
		
		case 3:
			 valor = 5;
		break;
			 
		case 4:
			valor = 2;
		break;
		
		case 5: 
			valor = 1.5;
		break;
		
		}
		
		resultado = valor * qtde;
		
		System.out.printf("Total: R$ %.2f", resultado);
		
		entrada.close();
	}
}