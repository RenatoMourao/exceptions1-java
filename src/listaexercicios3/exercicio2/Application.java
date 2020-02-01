package listaexercicios3.exercicio2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		Employee empregado= new Employee();
		System.out.println("Digite nome do empregado: ");
		empregado.name=teclado.nextLine();
		System.out.println("Digite Salario do Empregado:");
		empregado.grossSalary=teclado.nextDouble();
		System.out.println("Digite Taxa:");
		empregado.tax=teclado.nextDouble();
		System.out.printf("%s , Salário: R$%.2f",empregado.name,empregado.NetSalary());
		System.out.println("\n\nWhich percentage to increase salary?");
		empregado.percentage=teclado.nextDouble();
		empregado.IncreaseSalary();
		System.out.printf("%s , Novo Salário: %.2f",empregado.name,empregado.NetSalary());
			
		teclado.close();
				

	}

}
