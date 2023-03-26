package entities;

public class Retangulo {
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimetro() {
		return (2* width) + (2 * height);
	}
	
	public double Diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}
	
	public String toString() {
		return String.format("Informe o dado: ", width);
	}
	
	public String toStringResultado() {
		return String.format("Area = %.2f%n"
				+ "Perimetro = %.2f%n"
				+ "Diagonal = %.2f", Area(), Perimetro(), Diagonal());
	}

}
