import java.util.Scanner;

public class Atividade4_A {
	public static void main (String[] args) {
		
		int num_func, hora_trab;
		float valor_hora, salario;
		
		System.out.println("Informe o número do funcionário: ");
		Scanner num_funcS = new Scanner (System.in);
		num_func = num_funcS.nextInt();
		
		System.out.println("Informe as horas trabalhadas: ");
		Scanner hora_trabS = new Scanner (System.in);
		hora_trab = hora_trabS.nextInt();
		
		System.out.println("Informe o custo de hora trabalhada: ");
		Scanner valor_horaS = new Scanner (System.in);
		valor_hora = valor_horaS.nextFloat();
		
		salario = valor_hora * hora_trab;
		
		System.out.println("Número do funcionário: " + num_func);
		System.out.println("Salário: U$ " + salario);
		
	}
}