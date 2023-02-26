import java.util.Scanner;

public class Atividade4_C {
	public static void main (String[] args) {
		
		int num_func, horas_trab;
		float custo_hora, resultado;
		
		System.out.println("Informe o número do funcionário: ");
		Scanner num_funcS = new Scanner(System.in);
		num_func = num_funcS.nextInt();
		
		System.out.println("Informe as horas trabalhadas: ");
		Scanner horas_trabS = new Scanner(System.in);
		horas_trab = horas_trabS.nextInt();
		
		System.out.println("Informe o custo da hora: ");
		Scanner custo_horaS = new Scanner(System.in);
		custo_hora = custo_horaS.nextFloat();
		
		resultado = horas_trab * custo_hora;
		
		System.out.println("Número: " + num_func);
		System.out.format("Salário: U$ %.2f%n", resultado);
		
		num_funcS.close();
		horas_trabS.close();
		custo_horaS.close();
	}
}