package listaexercicios3;

public class Rectangle {
	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.hypot(width, height);
	}

	public String toString() {
		return "Área do Retângulo: "
				+ String.format("%.2f",area())
				+ "\nPerímetro do Retângulo: "
				+ String.format("%.2f", perimeter())
				+ "\nDiagonal do Retângulo: "
				+ String.format("%.2f",diagonal());
		
	}
}
