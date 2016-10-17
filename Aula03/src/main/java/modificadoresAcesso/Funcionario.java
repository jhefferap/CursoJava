package modificadoresAcesso;

public class Funcionario {

	private String nome;
	private double salario;
	private String cargo;
	private double porcentagemBonificacao;
	
	public String getNome() {
		return nome;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public double getPorcentagemBonificacao() {
		return porcentagemBonificacao;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if(validaSal(salario)&&validaBon(porcentagemBonificacao)){
			this.salario = salario*(porcentagemBonificacao/100);
		}
		
	}
	
	public void setPorcentagemBonificacao(double porcentagemBonificacao) {
		if(validaBon(porcentagemBonificacao)&&validaSal(salario)){
			this.porcentagemBonificacao = porcentagemBonificacao;
		}
	}
	
	public Funcionario(String nome, double salario, String cargo, double porcentagemBonificacao){
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.porcentagemBonificacao = porcentagemBonificacao;
		
	}
	
	private boolean validaSal (double salario){
		if(salario > this.salario){
			return true;
		}
		return false;
	}
	
	private boolean validaBon (double porcentagem){
		if(porcentagem > this.porcentagemBonificacao){
			return true;
		}
		return false;
	}
	
	
}
