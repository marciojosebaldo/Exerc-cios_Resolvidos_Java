//Obter a somatória da diagonal principal e da diagonal secundária

import java.util.Arrays;
import java.util.Scanner;

public class Programa {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Informe o número de linhas: ");
        int linha = entrada.nextInt();

        System.out.printf("Informe o número de colunas: ");
        int coluna = entrada.nextInt();

        int[][] matriz = new int[linha][coluna];

        for (int lin = 0; lin < linha; lin++) {
            for (int col = 0; col < coluna; col++) {
                System.out.printf("Informe o valor: [%d][%d]: ", lin, col);
                    matriz[lin][col] = entrada.nextInt();
            }
        }

        for (int[] lin : matriz) {
            for (int col : lin) {
                System.out.print(" | " + col);
            }
            System.out.println("");
        }

        int diagonalPrincipal = 0;
        for (int lin = 0; lin < linha; lin++) {
            for (int col = 0; col < coluna; col++) {
                if (lin == col) {
                    diagonalPrincipal += matriz[lin][col];
                }
            }
        }

        System.out.println("Diagonal principal: ");
        System.out.println(String.valueOf(diagonalPrincipal));

        int diagonalSecundario = 0;
        int col = coluna;
        for (int lin = 0; lin < linha; lin++) {
            col -= 1;
            diagonalSecundario += matriz[lin][col];
        }

        System.out.println("Diagonal secundária: ");
        System.out.printf(String.valueOf(diagonalSecundario));

    }
}