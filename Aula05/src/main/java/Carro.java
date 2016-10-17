
public class Carro extends Veiculo implements PagaPedagio {
	
	private int cavalos;
	
	public Carro (String cor, int qtdPortas, String tipoCombustivel, int cavalos){
		super(cor, qtdPortas,tipoCombustivel);
		this.cavalos = cavalos;
	}
	
	public int getCavalos() {
		return cavalos;
	}

	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}

	public int quantidadeEixos() {
		
		return 2;
	}	
	

}
