package CursoJava;

import java.util.Scanner;

public class VerificaIdadeOperadorCondicional {

	public static void main(String[] args) {

		Scanner leTeclado = new Scanner(System.in);
		
		//Exercício 5 - Verifica se número é par ou ímpar
		
				int numero;
				System.out.println("Informe o número: ");
				numero = leTeclado.nextInt();
				System.out.println(numero % 2 == 0 ? "O número "+numero+ " é par." : "O número "+numero+ " é impar");
	}

}
