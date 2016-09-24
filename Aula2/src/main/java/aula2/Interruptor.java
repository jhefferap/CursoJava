package aula2;

public class Interruptor {
	
	Lampada lampadaTeste;
	
	public Interruptor (Lampada lampadaTeste){
		this.lampadaTeste = lampadaTeste;		
	}
	
	public void apertar(){
		if(lampadaTeste.estaLigada()){
			lampadaTeste.desligar();
		}else {
			lampadaTeste.ligar();
		}
			
	}

}
