package CursoJava;

import java.util.Random;
import java.util.Scanner;

public class JogoParImpar {

	public static void main(String[] args) {
		// Exercício 6
		
		Scanner leTeclado = new Scanner(System.in);
		
		String jogador1, jogador2;
		int valor1, valor2;
		
		//instância um objeto da classe Random usando o construtor padrão
		Random gerador = new Random();
		
		//imprime sequência de 10 números inteiros aleatórios
	    
		for (int i = 0; i < 6; i++) {
	    	System.out.println(gerador.nextInt());
	 	}
		
		/*
		System.out.println("Jogador número 1 (é par), informe seu nome: ");
		jogador1 = leTeclado.next();
		System.out.println("Digite seu número: ");
		valor1 = leTeclado.nextInt();
		System.out.println("Jogador número 2 (é ímpar), informe seu nome: ");
		jogador2 = leTeclado.next();
		System.out.println("Digite seu número: ");
		valor2 = leTeclado.nextInt();
		
		System.out.println("O resultado do jogo foi: "+(valor1+valor2)+"! O jogador " + (((valor1+valor2)%2) == 0 ? jogador1 : jogador2) + " venceu!");
*/
	}

}
