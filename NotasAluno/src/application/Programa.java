package application;

import java.util.Scanner;

import entities.Notas;

public class Programa {
	
	public static void main (String[] args) {

	String nome;

	Scanner entrada = new Scanner(System.in);
	Notas notas = new Notas();
		
	System.out.println("Nome do aluno: ");
	nome = entrada.nextLine();
	
	notas.nota1 = entrada.nextFloat();
	notas.nota2 = entrada.nextFloat();
	notas.nota3 = entrada.nextFloat();
	
	if (notas.calculoNota() > 60.00) {
		System.out.println(notas.toString());
	}
	
	else {
		System.out.println(notas.toString2());
	}
			
	entrada.close();	
	}
}