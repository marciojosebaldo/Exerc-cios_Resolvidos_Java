package application;

import java.util.Scanner;

import entities.Casa;

public class Programa {
	
	public static void main (String[] args) {
		
		Casa casa = new Casa(0, 0, 0);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual cor deseja pintar a casa? (branco ou verde ou azul)");		
		casa.setCor(entrada.next());
		
		System.out.println("Existem três portas. Digite " + "\"0\"" + "para definir como fechada e " + "\"1\"" + " para aberta e sem aspas: ");
		System.out.println("Primeira porta: ");
		casa.setPorta1(entrada.nextInt());
		System.out.println("Segunda porta: ");
		casa.setPorta2(entrada.nextInt());
		System.out.println("Terceira porta: ");
		casa.setPorta3(entrada.nextInt());

		System.out.println("Verificador quantas portas estão abertas: ");
		System.out.println(casa.quantasPortasEstaoAbertas());

		entrada.close();
	}
}