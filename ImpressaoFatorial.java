public class ImpressaoFatorial {
	
	public static void main (String[] args) {
		
		int fatorial = 0, auxiliar = 0;
		
		for (int i = 1; i <= 5; i++) {
			
			if (i == 1) {
				fatorial = 1;
			}
			
			else {
				auxiliar = i;
				fatorial = auxiliar * fatorial;
			}			
			System.out.printf("Fatorial de %d é %d%n", i, fatorial);
		}
	}
}
