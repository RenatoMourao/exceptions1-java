package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVetor;

public class ProgramVetores {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner kb = new Scanner(System.in);
	int n=kb.nextInt();
	ProductVetor[] vect = new ProductVetor[n];
	
	for(int i=0; i<vect.length;i++) {
		kb.nextLine();
		String name = kb.nextLine();
		double valor=kb.nextDouble();
		vect[i]= new ProductVetor(name,valor); 
		
	}
	
	double sum = 0.0;
	for(int i=0; i<n;i++) {
		sum += vect[i].getValor();
		
	}
	
	double avg = sum / n;
	
	System.out.printf("Valor médio: %.2f%n ",avg);
	
	
	
	
	
	kb.close();

	}

}
