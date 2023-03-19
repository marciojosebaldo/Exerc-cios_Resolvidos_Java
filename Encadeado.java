/*Imprima a seguinte tabela usando for s encadeados:
1
2 4
3 6 9
4 8 12 16
n n*2 n*3 .... n*n
*/

public class Encadeado {
	public static void main(String[] args) {

		int auxiliar;

		for (int i = 1; i <= 4; i++) {
			System.out.print(i + " ");

			if (i == 1) {
				System.out.println();
			}

			else {
				auxiliar = i * 2;
				System.out.print(auxiliar + " ");

				if (auxiliar == 4) {
					System.out.println();
				}

				else {
					auxiliar = i * 3;

					if (auxiliar == 12) {
						System.out.print(auxiliar + " ");
					}

					else {
						System.out.println(auxiliar + " ");
					}

					if (auxiliar == 9) {

					} else {
						auxiliar = i * 4;
						System.out.print(auxiliar + " ");
					}

				}
			}
		}
	}
}