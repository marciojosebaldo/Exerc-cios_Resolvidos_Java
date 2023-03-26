package application;

import java.util.Scanner;

import entities.Retangulo;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Largura. " + retangulo.toString());
		retangulo.width = sc.nextDouble();
		
		System.out.println("Altura. " + retangulo.toString());
		retangulo.height = sc.nextDouble();
		
		System.out.println(retangulo.toStringResultado());
		
		sc.close();
	}

}
