import java.util.Scanner;

public class Duracao_jogo {
	public static void main (String[] args) {
		
		int horaI, horaF, resultado;
		
		System.out.println("Informe que horas começou e que horas terminou: ");
		
		Scanner entrada = new Scanner(System.in);
		horaI = entrada.nextInt();
		horaF = entrada.nextInt();
		
		resultado = (horaF > horaI) ? (horaI - horaF) * -1 : 24 - horaI + horaF;
		
		System.out.println("O JOGO DUROU " + resultado + " HORA(S)");
		
		entrada.close();
	}
}