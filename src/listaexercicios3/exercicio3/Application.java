package listaexercicios3.exercicio3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Student estudante = new Student();

		System.out.println("Digite nome do Aluno:");
		estudante.nome = teclado.nextLine();
		System.out.println("Digite nota primeiro trimestre:");
		estudante.nota1 = teclado.nextDouble();
		System.out.println("Digite nota segundo trimestre:");
		estudante.nota2 = teclado.nextDouble();
		System.out.println("Digite nota terceiro trimestre:");
		estudante.nota3 = teclado.nextDouble();

		estudante.Aprovado();

		teclado.close();

	}

}
