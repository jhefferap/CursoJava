package aula01;

import java.util.Scanner;

public class VerificaIdade {

	public static void main(String[] args) {
			
			Scanner leTeclado = new Scanner(System.in);
			
			//Exercício 1 - Verifica idade
			
			int idade;
			System.out.println("Informe a sua idade: ");
			idade = leTeclado.nextInt();
			System.out.println("Você é maior de idade:"+(idade>18));
			
		}

}
