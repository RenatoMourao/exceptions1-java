package applications;

import java.util.Scanner;

import entities.BankAccount;

public class ProgramBankAccount {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		BankAccount conta;
		
		System.out.print("\nEnter the account number:");
		int number = keyboard.nextInt();
		
		System.out.println("Enter the account client:");
		keyboard.nextLine();
		String holder = keyboard.nextLine();
		
		System.out.println("Is There an inicial deposit (y/n)?");
		char response = keyboard.next().charAt(0);
		
		if (response =='y') {
			System.out.println("Enter initial deposit value: ");
			double balance= keyboard.nextDouble();
			
			conta = new BankAccount(number, holder);
		
		
		keyboard.close();

	}

	}}
