package aula01;

import java.util.Scanner;

public class ComparacaoNomes {

	
	public static void main(String[] args) {
		
		Scanner leTeclado = new Scanner(System.in);
		
		//Exercício 2 - Compara se os nomes são iguais

		String primeiroNome, segundoNome;
		System.out.println("Informe o primeiro nome: ");
		primeiroNome = leTeclado.next();
		System.out.println("Informe o segundo nome: ");
		segundoNome = leTeclado.next();
		
		boolean validacaoNome = primeiroNome.equals(segundoNome);
		
		System.out.println("Nomes iguais:"+(validacaoNome));

		
	}

	
}
