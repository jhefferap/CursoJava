package aula2;

public class Lampada {

	int numeroWatts;
	String fabricante;
	boolean ligada;
	
	public Lampada(int numeroWatts, String fabricante){
		this.numeroWatts = numeroWatts;
		this.fabricante = fabricante;
	}
	
	public void ligar(){
		System.out.println("Ligada");
		this.ligada = true;
	}
	
	public void desligar(){
		System.out.println("Desligada");
		this.ligada = false;
	}
	
	public boolean estaLigada(){
		return ligada;
	}
}
