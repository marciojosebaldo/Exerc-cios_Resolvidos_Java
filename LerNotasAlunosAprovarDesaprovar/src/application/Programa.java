/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles
tiraram no 1o e 2o semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois,
imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja
maior ou igual a 6.0 (seis).
*/

package application;

import java.util.Scanner;

public class Programa {
	public static void main (String[] args) {
		
		int qtdeAlunos;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos serão incluídos? ");
		qtdeAlunos = entrada.nextInt();
		
		String[] arranjoNome = new String[qtdeAlunos];
		double[] arranjoNota1 = new double[qtdeAlunos];
		double[] arranjoNota2 = new double[qtdeAlunos];
		
		for (int i = 0; i < qtdeAlunos; i++) {
			System.out.println("Digite nome, primeira e segunda do " + (i+1) + "° aluno(a): ");
			
			arranjoNome[i] = entrada.next();
			arranjoNota1[i] = entrada.nextDouble();
			arranjoNota2[i] = entrada.nextDouble();			
		}
		
		System.out.println("Alunos aprovados: ");
		
		double[] arranjoMedia = new double[qtdeAlunos];
		
		for (int i = 0; i < qtdeAlunos; i++) {
			
			arranjoMedia[i] = ((arranjoNota1[i] + arranjoNota2[i])/2);
			
			if (arranjoMedia[i] >= 6.0) {
				System.out.println(arranjoNome[i]);
			}
		}
		
		
	entrada.close();
	}
}