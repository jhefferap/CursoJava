package exercicioHerancaClassesAbastratasFuncionario;

public class FolhaPagamento {
	
	public double calcular (Funcionario ...funcionarios){
		
		double valorTotalFolha = 0;
		
		for (Funcionario func : funcionarios){
			System.out.println(func.getClass().getSimpleName()+" - "+func.getNome()+"\nSalário inicial= "+func.getSalario());
			System.out.println("Salário atual= "+func.getSalarioComBonificacao()+"\n");
			valorTotalFolha += func.getSalarioComBonificacao();
		}
		
		return valorTotalFolha;
	}

}
