package application;

import java.util.Scanner;

import entities.Cotacao;

public class Programa {
	public static void main (String[] args) {
	
	Cotacao cotacao;
	Scanner entrada = new Scanner(System.in);
	
	double valor;
		
	System.out.println("Informe a quantidade do dolar: ");
	valor = entrada.nextDouble();
	cotacao = new Cotacao(valor);	
		
	System.out.println("Montante a ser pago em reais: " + cotacao.cotacaoDolar(valor));	
	
	entrada.close();
	}
}