package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employees;

public class ProgramEmployees {

	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		System.out.println("How many employees will be registered?");
		int n = kb.nextInt();
		
		//private Employees (int id, String nome, double salario
		
		List<Employees> list = new ArrayList<>();
		
		
		
		
		for (int i=1;i<=n;i++) {
			
			System.out.println("Employee #"+ i);
			System.out.print("Id: ");
			int id = kb.nextInt();
			

			  /*Employees emp=list.stream().filter(x ->x.getId()==id).findFirst().orElse(null);
				if (emp!=null) {
				System.out.println("Id já utilizado, digite outro!!");
				id2 = kb.nextInt();
					
			}*/
			
			System.out.println("Name: ");
			String name = kb.next();
			System.out.println("Salario: ");
			double salario = kb.nextDouble();
			list.add(new Employees(id,name,salario));
			
		}
		
		for(Employees obj :list) {
			
			System.out.println(obj);
		}
		
		
		kb.close();
		

	}

}
