package exercicioHerancaPessoa;

public class PessoaFisica extends Pessoa{

	private String CPF;
	
	PessoaFisica (String nome, String CPF){
		super (nome);
		this.CPF = CPF;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
}
