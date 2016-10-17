package exercicioHerancaClassesAbstratas;

public class VisitaVeterinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal baleiaAzul = new Baleia();
		Animal jacareMarrom = new Jacare();
		
		Veterinario drPet = new Veterinario();
		
		drPet.examinar(baleiaAzul);
		drPet.examinar(jacareMarrom);
		drPet.examinar(drPet);

	}

}
