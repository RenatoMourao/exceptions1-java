package applications;

import java.util.Scanner;

public class ProgramaMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho da matriz: ");

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		int i;
		int j;

		for (i = 0; i < n; i++) {

			for (j = 0; j < n; j++) {

				System.out.println("Digitar item da posição: " + i + ";" + j);

				mat[i][j] = sc.nextInt();
			}
		}

		for (i = 0; i < n; i++) {

			for (j = 0; j < n; j++) {

				System.out.print(mat[i][j] + " ");
				if (j == (n - 1)) {
					System.out.println();

				}
			}
		}
		System.out.print("Diagonal da matriz: ");

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				if (i == j) {
					System.out.print(mat[i][j] + " ");
				}

			}
		}
System.out.println("Números negativos:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {

				if (mat[i][j] < 0) {
					System.out.print(mat[i][j] + " ");
				}

			}
		}

		sc.close();
	}

}