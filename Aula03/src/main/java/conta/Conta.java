package conta;

public class Conta {
	
	double saldo;
	
	public Conta(){
		this.saldo = 0;
	}
	/**
	 * 
	 * Contrutor da classe. Não rececebe nenhum
	 * parametro, apenas inicializa com zero
	 * @return
	 */
	
	public boolean sacar(double valor){
		if(valor > saldo){
			return false;
		}
		saldo -= valor;
		return true;
	}
	
	public void depositar(double valor){
		saldo += valor;
	}
	
	public double obterSaldo(double saldo){
		return saldo;
	}

}
