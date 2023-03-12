import java.util.Scanner;

public class leitura_senha {
	public static void main(String[] arg) {

		System.out.println("Informe a senha: ");

		Scanner entrada = new Scanner(System.in);

		int senha;

		senha = entrada.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida");
			System.out.println("Informe a senha: ");
			senha = entrada.nextInt();
		}
				
		System.out.println("Acesso permitido");
		
		entrada.close();
	}
}