package applications;

import java.util.Scanner;

public class ProgramaMatrizExercicio {

	public static void main(String[] args) {
		System.out.println("Programa Matriz");

		Scanner sc = new Scanner(System.in);
		int i=0;
		int j=0;
		int h;
		int l=0;
		System.out.println("Digitar o número de linhas da matriz:");

		int m = sc.nextInt();

		System.out.println("Digitar o número de colunas da matriz:");
		int n = sc.nextInt();

		int mat[][] = new int[m][n];

		System.out.println("Matriz " + m + "X" + n);
					
			for (i = 0; i <mat.length; i++) {
				System.out.println("Digitar linha: " +(i+1));
				for (j = 0; j <mat[i].length; j++) {
					
					mat[i][j] = sc.nextInt();
					
					
					/*System.out.print(mat[i][j] + " ");*/
				
				}

			}


			for (i = 0; i <mat.length; i++) {
				
				for (j=0; j <mat[i].length; j++) {
					System.out.print(mat[i][j]);
					if (j==(n-1) ){
						System.out.println();
					}
								
			}
				
		

	}

		System.out.println("Digite um número: ");
		h=sc.nextInt();
			
			
			for (i = 0; i <mat.length; i++) {
				
				for (j=0; j <mat[i].length; j++) {
					if (h==mat[i][j] ){
						System.out.println("Encontrei na Posição:" +i+ ","+j);
						if ( (j-1) >= 0) {
							System.out.println("Direita: " + mat[i][j-1]+ "posição:"+i+","+(j-1));
													}
						if ((j+1)<mat[i].length) {
							System.out.println("Esquerda:" +mat[i][j+1]+ "posição:"+i+","+(j+1));
							
						}
						if ((i-1)>=0 ) {
							System.out.println("Acima: "+ mat[i-1][j]+ "posição:"+(i-1)+","+j);
						}
						if ((i+1)<mat.length) {
							System.out.println("Abaixo: " + mat[i+1][j]+"posição:"+(i+1)+","+j);
						}
					}
					
								
			}
				
		

	}

			sc.close();}
}
