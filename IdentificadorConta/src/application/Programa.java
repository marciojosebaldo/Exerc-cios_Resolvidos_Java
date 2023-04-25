/*
5. (Opcional) Adicione um atributo, na classe Conta de tipo int , que se chama identificador. Este
deve ter um valor único para cada instância do tipo Conta . A primeira Conta instanciada tem
identificador 1, a segunda, 2, e assim por diante. Você deve utilizar os recursos aprendidos aqui na
resolução desse problema.
*/


package application;

import entities.Conta;

public class Programa {
	public static void main (String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		Conta conta4 = new Conta();		
	
		System.out.println(conta1.getId());
		
		System.out.println(conta2.getId());
		
		System.out.println(conta3.getId());
		
		System.out.println(conta4.getId());
	}
}