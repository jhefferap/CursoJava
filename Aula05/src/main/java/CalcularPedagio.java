
public class CalcularPedagio {
	
	static final double ATE_02_EIXOS = 6.50;
	static final double ATE_03_EIXOS = 10.00;
	static final double ATE_04_EIXOS = 15.00;
	
	public void Calcular(PagaPedagio ... pagaPedagios){
		for(PagaPedagio tarifa : pagaPedagios){
			if(tarifa.quantidadeEixos() <= 2){
			System.out.println("O valor do pedagio do veículo " + tarifa.getClass().getName()+ " é: R$ "+ATE_02_EIXOS);
			} else if(tarifa.quantidadeEixos() <=3){
				System.out.println("O valor do pedagio do veículo " + tarifa.getClass().getName()+ " é: R$ "+ATE_03_EIXOS);
			}else if(tarifa.quantidadeEixos() <=4){
				System.out.println("O valor do pedagio do veículo " + tarifa.getClass().getName()+ " é: R$ "+ATE_04_EIXOS);
			}else{
				System.out.println("O valor do pedagio do veículo " + tarifa.getClass().getName()+ " é: R$ 0,00");
			}
		}
		
	}

}
