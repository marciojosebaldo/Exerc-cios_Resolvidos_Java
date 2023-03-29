package application;

import java.util.Scanner;

import entities.Porta;

public class Programa {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Porta porta = new Porta();

		System.out.println("A porta está 'aberta' ou 'fechada'?");
		porta.aberta = entrada.nextLine();

		System.out.println("Qual a cor da porta?");
		porta.cor = entrada.nextLine();
		
		System.out.println("Informe a altura, largura e profundidade da porta em centímetros:");
		porta.dimensaoA = entrada.nextDouble();
		porta.dimensaoL = entrada.nextDouble();
		porta.dimensaoP = entrada.nextDouble();
		
		System.out.println("A porta ainda está 'aberta' ou 'fechada'?");
		
		porta.aberta = entrada.next();
				
		switch (porta.aberta) {
				
		case "aberta":
			porta.aberta = "aberta";
			break;
		
		case "fechada":
			porta.aberta = "fechada";
			break;
		}
		
		porta.estaAberta();
		
		// Só falta imprimir true ou false
		
		entrada.close();
	}
}