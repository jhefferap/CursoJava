package modificadoresAcesso;

public class CriarUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Jefferson";
		String email = "jefferson@gmail.com";
		String senha = "123ab";
		
		Usuario novoUsuario = new Usuario (nome, email, senha);
/*
		novoUsuario.contemNumero(senha);
		novoUsuario.contemLetra(senha);
*/
		System.out.println(novoUsuario.getSenha());
		
	}

}
