package listaexercicios3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner leTeclado=new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle();
		System.out.println("Enter rectangle width");
		retangulo.width=leTeclado.nextDouble();
		System.out.println("Enter rectangle height");
		retangulo.height=leTeclado.nextDouble();
		
		System.out.println(retangulo);
				
		leTeclado.close();
		

	}

}
