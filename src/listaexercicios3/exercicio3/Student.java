package listaexercicios3.exercicio3;

public class Student {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double finalgrade;

	public void Aprovado() {
		finalgrade= nota1+nota2+nota3;
	
		if (finalgrade>=60) {
			System.out.println("Aluno: "+nome);
			System.out.printf("Nota Final= %.2f",finalgrade);
			System.out.println("\nPassou");
		
	}else {
		System.out.println("Aluno: "+nome);
		System.out.printf("Nota Final= %.2f",finalgrade);
		System.out.println("\nReprovado");
		System.out.printf("Pontos que faltaram: %.2f ",(60-finalgrade));
	}
	}
	

}
