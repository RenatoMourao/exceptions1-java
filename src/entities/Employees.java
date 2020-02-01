package entities;

public class Employees {
	private Integer id;
	private String nome;
	private Double salario;

	public Employees(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public Double getSalario() {
		return salario;
	}

	public void increaseSalario(double percentage) {
		salario += salario * percentage / 100;

	}

	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}

}
