package entities;

public class ProductVetor {
	private String Produto;
	private double Valor;
	public ProductVetor(String produto, double valor) {
		Produto = produto;
		Valor = valor;
	}
	public String getProduto() {
		return Produto;
	}
	public void setProduto(String produto) {
		Produto = produto;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}

	
}
