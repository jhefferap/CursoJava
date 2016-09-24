package aula2;

public class Pessoa {

	String nome, cpf, rg;
	
	public Pessoa(String nome, String cpf, String rg){
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	
	/**
	 * Método toString é usado para imprimir os daddos do objeto
	 */
	
	public String toString(){
		String texto;
		texto = "Nome: "+this.nome+"\n";
		texto += "CPF: "+this.cpf+"\n";
		texto += "RG: "+this.rg;
		return texto;
	}
	
}
