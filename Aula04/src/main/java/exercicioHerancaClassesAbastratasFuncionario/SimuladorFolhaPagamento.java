package exercicioHerancaClassesAbastratasFuncionario;

import exercicioHerancaEquipamento.Equipamento;

public class SimuladorFolhaPagamento {

	public static void main(String[] args) {
		
		Funcionario func01 = new Gerente ("Zé Henrique",7000);
		Funcionario func02 = new Supervisor ("Danilo Hardy", 3000);
		Funcionario func03 = new Secretaria ("Camila Victoria",1200);
		
		FolhaPagamento folhaAtual = new FolhaPagamento();

		//folhaAtual.calcular(func01, func02, func03);
		
		System.out.println("Valor total da folha de pagamento: "+folhaAtual.calcular(func01, func02, func03));
		
	}
	


}
