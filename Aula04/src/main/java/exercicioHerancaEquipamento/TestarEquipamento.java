package exercicioHerancaEquipamento;
import java.text.DecimalFormat;

public class TestarEquipamento {

	public static void main(String[] args) {

		// Define número de casas decimais
		DecimalFormat deci = new DecimalFormat("0.00");
		
		Equipamento tv = new Televisao (1000,"Sony");
		Equipamento saiImpressao = new Impressora (100,"Epson");
		Equipamento sentaCadeira = new Cadeira (10,"Zapper");
		
		double valorTotal = imprimirPrecosFinais(tv, saiImpressao, sentaCadeira);
		System.out.println("Valor total: R$ "+valorTotal);
		
	}
		//	Indica que poderá receber vários objetos do tipo Equipamento
		public static double imprimirPrecosFinais(Equipamento... equipamentos){
			double valorTotal = 0;
			
			for (Equipamento equipamento : equipamentos){
				System.out.println(equipamento.getClass().getSimpleName()+": "+equipamento.calcularPrecoFinal());
				valorTotal += equipamento.calcularPrecoFinal();
			}
			return valorTotal;
		}
		


	}
