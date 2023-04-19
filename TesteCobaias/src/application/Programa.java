/*
Experiências
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de
sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável.
Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o
percentual de cada tipo de cobaia utilizada.
Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para
obter estas informações, ela sabe exatamente o número de experimentos que foram
realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada
experimento.
Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de
teste que vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤
15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou
'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).
Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o
percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o
percentual deve ser apresentado com dois dígitos após o ponto.
*/

package application;

import java.util.Scanner;

import entities.Cobaia;

public class Programa {
	public static void main(String[] args) {

		int qtdeTeste, somaQtdeTeste = 0, somaCobaiaC = 0, somaCobaiaR = 0, somaCobaiaS = 0;
		double percentualCobaiaC = 0.0, percentualCobaiaR = 0.0, percentualCobaiaS = 0.0; 

		Scanner entrada = new Scanner(System.in);
		Cobaia cobaia;

		System.out.println("Informe o número de testes: ");
		qtdeTeste = entrada.nextInt();
				
		Cobaia[] vCobaia = new Cobaia[qtdeTeste];

		for (int i = 0; i < vCobaia.length; i++) {			
			System.out.print("Informe a quantidade de animais: ");
			int totalCobaia = entrada.nextInt();
			
			System.out.println("Informe o tipo de cobaia (C = coelho ou R = rato ou S = Sapo): ");
			String nomeCobaia = entrada.next();
			
			cobaia = new Cobaia(totalCobaia, nomeCobaia);
			
			vCobaia[i] = cobaia;
			
			somaQtdeTeste += vCobaia[i].getTotalCobaia();
			
			if (vCobaia[i].getCobaia().equals("C")) {
				somaCobaiaC += vCobaia[i].getTotalCobaia();
			}
			
			else if (vCobaia[i].getCobaia().equals("R")) {
				somaCobaiaR += vCobaia[i].getTotalCobaia();
			}
			
			else if (vCobaia[i].getCobaia().equals("S")) {
				somaCobaiaS += vCobaia[i].getTotalCobaia();
			}			
		}
				
		percentualCobaiaC = (double) somaCobaiaC / (double) somaQtdeTeste * 100;
		percentualCobaiaR = (double) somaCobaiaR / (double) somaQtdeTeste * 100;
		percentualCobaiaS = (double) somaCobaiaS / (double) somaQtdeTeste * 100;
		
		System.out.println("Total: " + somaQtdeTeste + " cobaias");
		System.out.println("Total de coelhos: " + somaCobaiaC);
		System.out.println("Total de ratos: " + somaCobaiaR);
		System.out.println("Total de sapos: " + somaCobaiaS);
		System.out.printf("Percentual de coelhos: %.2f%%%n", percentualCobaiaC);
		System.out.printf("Percentual de ratos: %.2f%%%n", percentualCobaiaR);
		System.out.printf("Percentual de sapos: %.2f%%%n", percentualCobaiaS);
	
		entrada.close();
	}
}