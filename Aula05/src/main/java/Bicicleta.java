
public class Bicicleta extends Veiculo{
	
	private String marca;
	
	public Bicicleta (String cor, int qtdPortas, String tipoCombustivel, String marca){
		super(cor, qtdPortas,tipoCombustivel);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
