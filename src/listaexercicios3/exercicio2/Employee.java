package listaexercicios3.exercicio2;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public double NetSalary() {
		return grossSalary-tax;
	}
	public void IncreaseSalary() {
		grossSalary= grossSalary * (1 +(percentage/100));
	}
}
