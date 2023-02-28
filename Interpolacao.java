import java.util.Locale;

public class Interpolacao {
	public static void main (String[] args) {
		String produto1 = "Computador";
		String produto2 = "Mesa de escritório";
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.printf("Produtos: %n" +
				"%s, com preço de R$ %.2f%n" +
				"%s, com preço de R$ %.2f%n" +
				"Registro: %d anos, código %d e gênero: %s%n" +
				"Medida com 8 casas decimais: %f%n" +
				"Arredondado (três cadas decimais): %.3f%n", produto1, preco1, produto2, preco2, idade, codigo, genero, medida, medida);
		
		Locale.setDefault(new Locale ("pt","BR"));
		System.out.printf("pt-BR com três casas decimais: %.3f", medida);
	}
}