
public class CabinePedagio {

	public static void main(String[] args) {
		
		PagaPedagio meuCarango = new Carro("Vermelho", 3, "Gasolina", 10000);
		PagaPedagio meuTransformer = new Caminhao("Azul", 4, "Diesel", "medio");
		PagaPedagio minhaHarley = new Moto("Preta", 0, "Gasolina", "Harley");
		Bicicleta minhaMagrela = new Bicicleta("Verde", 0, "pedalada", "Caloi");
		
		CalcularPedagio teste = new CalcularPedagio();
		
		teste.Calcular(meuCarango);
		teste.Calcular(meuTransformer);
		teste.Calcular(minhaHarley);
		//teste.Calcular(minhaMagrela);

	}

}
