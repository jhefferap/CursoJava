package exercicioInterfaces;

public class Quadrado implements AreaCalculavel{
	
	private double lado;	
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public Quadrado (double lado){
		this.lado = lado;
	}

	public double getArea() {
	return lado * lado;
}
}
