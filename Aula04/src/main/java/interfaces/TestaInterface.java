package interfaces;

public class TestaInterface {
	
	public static void main(String[] args){
		System.out.println(MinhaPrimeiraInterface.MEU_ATRIBUTO);
		
		MinhaPrimeiraInterface objeto = new ImplementacaoInterface();
		objeto.fazAlgumaCoisa();
	}

}
