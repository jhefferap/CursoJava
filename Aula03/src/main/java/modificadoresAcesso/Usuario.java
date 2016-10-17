package modificadoresAcesso;

public class Usuario {

	private String nome;
	private String email;
	private String senha;
	
	public Usuario(String nome, String email, String senha){
		this.nome = nome;
		this.email = email;
		this.senha = validaSenha(senha);
	}
	
	public boolean contemNumero(String str){
		for(int i = 0; i < str.length(); i++){
			if (Character.isDigit(str.charAt(i))){
				return true;
			}
		}
		return false;
	}
	
	public boolean contemLetra(String str){
		
		for(int i = 0; i < str.length(); i++){
			if (Character.isLetter(str.charAt(i))){
				return true;
			}
		}
			return false;
		
	}
	
}
