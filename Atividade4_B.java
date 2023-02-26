import java.util.Scanner;

public class Atividade4_B {
	
	public static void main (String[] args) {
		
		int num_func, hora_trab;
		float valor_sal, resultado;		
		
		System.out.println("Informe o número do funcionário: ");
		Scanner num_funcS = new Scanner (System.in);
		num_func = num_funcS.nextInt();
		
		System.out.println("Informe as horas trabalhadas: ");
		Scanner hora_trabS = new Scanner (System.in);
		hora_trab = hora_trabS.nextInt();
		
		System.out.println("Informe o custo da hora trabalhada");
		Scanner valor_salS = new Scanner (System.in);
		valor_sal = valor_salS.nextFloat();
		
		resultado = hora_trab * valor_sal;
		
		System.out.println("Número: " + num_func);
		System.out.format("O resultado é de: %.2f%n", resultado);
	}
}