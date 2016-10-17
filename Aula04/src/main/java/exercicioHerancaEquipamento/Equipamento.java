package exercicioHerancaEquipamento;

public class Equipamento {
	
	private double preco;
	private String fabricante;
	
	public Equipamento (double preco, String fabricante){
		this.preco = preco;
		this.fabricante = fabricante;
	}
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreco(){
		return preco;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public double calcularPrecoFinal(){
		return this.preco;
	}

}
