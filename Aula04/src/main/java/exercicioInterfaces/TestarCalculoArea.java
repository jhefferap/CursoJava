package exercicioInterfaces;

public class TestarCalculoArea {

	public static void main(String[] args) {

		CalculadorArea teste = new CalculadorArea();
		Circulo bola = new Circulo(2);
		Quadrado caixa = new Quadrado (4);
		Retangulo tabua = new Retangulo (5,2);
		
		System.out.println(teste.calcular(bola));
		System.out.println(teste.calcular(caixa));
		System.out.println(teste.calcular(tabua));

	}

}
