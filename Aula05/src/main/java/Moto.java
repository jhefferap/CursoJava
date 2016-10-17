
public class Moto extends Veiculo implements PagaPedagio {
	
	private String marca;
	
	public Moto (String cor, int qtdPortas, String tipoCombustivel, String marca){
		super(cor, qtdPortas,tipoCombustivel);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int quantidadeEixos(){
		return 2;
	}

}
