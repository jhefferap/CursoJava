package exercicioHerancaEquipamento;

public class Eletronico extends Equipamento{
	
	public Eletronico (double preco, String fabricante){
		super(preco, fabricante);
		
	}
	
	@Override
	public double calcularPrecoFinal(){
		return getPreco() * 1.10;
	}

}
