package modificadoresAcesso;

public class Televisao {

	public String marca;
	public String modelo;
	public int polegada;
	public int volume;
	public int canal;
	public boolean power;
	private int diodo;

	public Televisao (String marca, String modelo, int polegada){
		this.marca = marca;
		this.modelo = modelo;
		this.polegada = polegada;
	}

	public void ligar(){				
		if(power==false){
			System.out.println("TV ligada");
			power = true;
		}else{
			System.out.println("A TV já está ligada");
		}
	}
	
	public void desligar(){
		if(power==true){
			System.out.println("TV desligada");
			power = false;
		}else{
			System.out.println("A TV já está desligada");
		}
		
	}
	
	public void aumentarVolume(int volume){
		System.out.println("Volume atual: "+this.volume);
		this.volume += volume;		
		System.out.println("O volume foi alterado para: "+this.volume);
	}
	
	public void diminuirVolume(){
		
	}
	
	private void ajustarVoltagem(){
		
	}
	
	public void aumentarCanal(){
		
	}
	
	public void diminuirCanal(){
		
	}
	
	private void ligartela(){
		
	}
	
	private void regularDiodo(){
		
	}
	
}
