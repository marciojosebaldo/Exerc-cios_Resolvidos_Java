package application;

import java.util.Scanner;

import entities.Pessoa;

public class Programa {
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();

		pessoa.nome = entrada.nextLine();

		pessoa.idade = entrada.nextInt();

		pessoa.fazAniversario();
		
		pessoa.fazAniversario();
		
		pessoa.fazAniversario();
		
		System.out.println(pessoa.toString());
		
		entrada.close();		
	}
}