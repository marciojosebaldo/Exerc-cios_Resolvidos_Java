/*
Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários.
Não deve haver repetição de id. Em seguida, efetuar o aumento de X por cento no salário de um determinado
funcionário. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Colaborador;

public class Programa {
	
	public static void main(String[] args) {

		int numeroRegistros;
		int idColaborador;
		double porcentagemAumento;

		Scanner entrada = new Scanner(System.in);
		Colaborador colaborador = new Colaborador(0, "", 0.00);

		System.out.print("Quantos colaboradores serão registrados? ");
		numeroRegistros = entrada.nextInt();

		List<Colaborador> listaColaborador = new ArrayList<>();

		System.out.println();
		
		for (int i = 0; i < numeroRegistros; i++) {
			int id;
			String nome;
			double salario;

			System.out.println("Colaborador #" + (i + 1) + ": ");
			System.out.print("Id: ");
			id = entrada.nextInt();

			entrada.nextLine();

			System.out.print("Nome: ");
			nome = entrada.nextLine();

			System.out.print("Salário: ");
			salario = entrada.nextDouble();
			
			System.out.println();

			colaborador = new Colaborador(id, nome, salario);

			listaColaborador.add(colaborador);
		}

		System.out.print("Informe o id do colaborador que terá aumento de salário: ");
		idColaborador = entrada.nextInt();

		listaColaborador.stream().filter(obj -> obj.getId() == idColaborador).findFirst().orElse(null);
				
		if (colaborador == null) {
			System.out.println("Este número não existe: ");
			System.exit(0);
		}
		else {
			System.out.println("Informe a porcentagem: ");
			porcentagemAumento = entrada.nextDouble();
			colaborador.aumentoSalario(porcentagemAumento);
		}
		
		System.out.println();
		System.out.println("Lista de colaboradores: ");
		
		for (Colaborador obj : listaColaborador) {
			System.out.println(obj);
		}
		
		entrada.close();
	}
}