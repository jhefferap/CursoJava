package exercicioInterfaces;

public class Retangulo implements AreaCalculavel{

	private double base, altura;
		
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}

	public double getArea() {
		return base * altura;
	}
}
