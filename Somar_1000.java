public class Somar_1000 {

	public static void main(String[] args) {
		int resultado = 0, auxiliar = 0;

		for (int i = 1; i <= 5; i++) {
			auxiliar = i;
			resultado = auxiliar + resultado;
		}
		System.out.println(resultado);
	}

}
