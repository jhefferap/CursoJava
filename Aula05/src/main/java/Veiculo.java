
public abstract class Veiculo {
	
	private String cor;
	private int qtdPortas;
	private String tipoCombustivel;
	
	public Veiculo (String cor, int qtdPortas, String tipoCombustivel){
		this.cor = cor;
		this.qtdPortas = qtdPortas;
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	

}
