import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner leTeclado = new Scanner(System.in);
		int x;
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		int soma = 0;

		x = leTeclado.nextInt();
		while (x != 4) {
			
			if (x == 1) {
				alcool++;
			} 
			else if (x == 2) {
				gasolina++;
			}
			else if (x == 3) {
				diesel++;
			}
			else if (x == 4) {
				
			}

			else {
				System.out.println("Código Inválido, digite novamente");
			}
			x = leTeclado.nextInt();
		}
		leTeclado.close();
		
		soma=alcool+gasolina+diesel;
		
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		System.out.println("Total de Clientes: "+ soma);
	}

}
