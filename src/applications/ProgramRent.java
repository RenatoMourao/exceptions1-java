package applications;

import java.util.Scanner;

import entities.Rent;

public class ProgramRent {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Rent[] aluguel = new Rent[10];
		System.out.println("How many rooms will be rented?");
		int n = kb.nextInt();

		for (int i = 1; i < (n+1); i++) {
			System.out.println("Rent #" + (i));
			System.out.println("Name:");
			kb.nextLine();
			String name = kb.nextLine();
			System.out.println("Email:");
			String email = kb.nextLine();
			System.out.println("Room:");
			int room = kb.nextInt();
			aluguel[room] = new Rent(name, email, room);
		}

		System.out.println("\nBusy rooms:");
		for (int i = 0; i < 9; i++) {
			if (aluguel[i] != null) {
				
				System.out.println(i+": "+aluguel[i].getNome()+", "+aluguel[i].getEmail());
			}
		}

		kb.close();

	}

}
