import java.util.Scanner;

public class codigo_combustivel {
	
	public static void main (String[] args) {
		
		int combustivel;
		int gas = 0, alc = 0, die = 0;
		
		Scanner entrada_combustivel = new Scanner(System.in);
		
		do {
			
			System.out.printf("1 - Álcool%n"
					+ "2 - Gasolina%n"
					+ "3 - Diesel%n"
					+ "4 - SAIR%n"
					+ "Informe a opção de combustível: ");
			
			combustivel = entrada_combustivel.nextInt();
			
			if (combustivel == 1) {
				alc ++;				
			}
			
			else if (combustivel == 2) {
				gas ++;
			}
			
			else if (combustivel == 3) {
				die ++;	
			}
		}
		
		while (combustivel != 4); 
		
		System.out.printf("MUITO OBRIGADO%n"
				+ "Álcool %d %n"
				+ "Gasolina %d %n"
				+ "Diesel %d %n", alc, gas, die);
		
		entrada_combustivel.close();
	}
	
}