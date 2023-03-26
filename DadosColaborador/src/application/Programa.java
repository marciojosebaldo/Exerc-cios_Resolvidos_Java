package application;

import java.util.Scanner;

import entities.Colaborador;

public class Programa {
	
	public static void main(String[] args) {
	
		Colaborador colaborador = new Colaborador();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome: ");
		colaborador.nome = entrada.nextLine();
		
		System.out.println("Salário bruto: ");
		colaborador.salarioBruto = entrada.nextDouble();
		
		System.out.println("Taxa: ");
		colaborador.taxa = entrada.nextDouble();

		System.out.println(colaborador.toString());
		
		System.out.println("Qual porcentagem para incrementar o salário: ");
		double porcentagem = entrada.nextDouble();
		
		colaborador.IncrementoTaxaSalario(porcentagem);
		
		System.out.println(colaborador.toString2());
		
		entrada.close();
	}
}