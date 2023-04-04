package application;

import java.util.Scanner;

import entities.Banco;

public class Programa {
	public static void main (String[] args) {
		
		String pergunta;
		
		Banco banco = new Banco(0000, "Nome completo", 0.00);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número da conta: ");
		banco.setNumeroConta(entrada.nextInt());
		
		System.out.println("Informe o nome do titular: ");
		banco.setTitular(entrada.next());
		
		System.out.println("Há um depósito inicial? (s/n)");
		pergunta = entrada.next();
		
		if (pergunta.equals("s")) {
			System.out.println("Lance o valor inicial do depósito: ");
			banco.setBalanco(entrada.nextDouble());
		}
		
		System.out.println(banco.toString1());
	
		System.out.println("Lance o valor de depósito: ");
		banco.deposito(entrada.nextDouble());
		
		System.out.println(banco.toString());
		
		System.out.println("Lance o valor do saque: ");
		banco.saque(entrada.nextDouble());
		
		System.out.println(banco.toString());
		
		entrada.close();
	}
}