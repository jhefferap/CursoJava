package aula2;

public class TestarLampada {

	public static void main(String[] args) {
		
	
		Lampada l = new Lampada(60,"fabricanteLamp");
		Interruptor i = new Interruptor(l);
		
		i.apertar();
		i.apertar();
		i.apertar();
		i.apertar();
		

	}

}
