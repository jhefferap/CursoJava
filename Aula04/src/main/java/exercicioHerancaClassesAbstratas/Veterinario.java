package exercicioHerancaClassesAbstratas;

public class Veterinario extends Humano{
	
	public void examinar(Animal pet){
		if(pet instanceof Humano){
			throw new IllegalArgumentException("Não posso examinar humanos!");
		}
		pet.emitirSom();
	}

}
