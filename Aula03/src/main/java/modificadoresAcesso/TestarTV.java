package modificadoresAcesso;

public class TestarTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Televisao tv = new Televisao ("Sony", "SMART", 60);
		
		tv.ligar();
		tv.aumentarVolume(10);

	}

}
