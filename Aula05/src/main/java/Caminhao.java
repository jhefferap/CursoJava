
public class Caminhao extends Veiculo implements PagaPedagio {
	
	private String porte;
	
	public Caminhao (String cor, int qtdPortas, String tipoCombustivel, String porte){
		super(cor, qtdPortas,tipoCombustivel);
		this.porte = porte;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public int quantidadeEixos(){
		return 4;
	}

}
