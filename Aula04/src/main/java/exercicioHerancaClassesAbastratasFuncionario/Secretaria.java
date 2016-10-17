package exercicioHerancaClassesAbastratasFuncionario;

public class Secretaria extends Funcionario{
	
	public Secretaria(String nome, double salario) {
		super(nome,salario);
	}
	
	@Override
	double getPorcentagemAdicional() {
		return 0.0;
	}

}
