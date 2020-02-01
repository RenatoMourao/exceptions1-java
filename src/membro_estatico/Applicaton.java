package membro_estatico;

import java.util.Scanner;

import util.CurrencyConverter;

public class Applicaton {

	public static void main(String[] args) {
		Scanner keyb= new Scanner(System.in);
		System.out.println("What is the dollar price?");
		
		double dollarPrice = keyb.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		
		double dollarAmount=keyb.nextDouble();
		
		System.out.printf(("%nAmount to be paid in reais = %.2f"),CurrencyConverter.Price(dollarPrice,dollarAmount));
		
		
		
		
		
		keyb.close();
		

	}

}
