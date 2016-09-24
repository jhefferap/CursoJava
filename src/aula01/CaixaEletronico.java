package aula01;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		// Exercício 8 - Simula saque em caixa eletrônico
		
		Scanner leTeclado = new Scanner(System.in);
		
		int valorSaque;
		
		System.out.println("Informe o valor do saque: ");
		valorSaque = leTeclado.nextInt();
		
		if(valorSaque/100>0){
			System.out.println("Notas de R$ 100 = "+valorSaque/100);
			valorSaque = valorSaque%100;
		}
		if(valorSaque/50>0){
			System.out.println("Notas de R$ 50 = "+valorSaque/50);
			valorSaque = valorSaque%50;
		}
		if(valorSaque/20>0){
			System.out.println("Notas de R$ 20 = "+valorSaque/20);
			valorSaque = valorSaque%20;
		}
		if(valorSaque/10>0){
			System.out.println("Notas de R$ 10 = "+valorSaque/10);
			valorSaque = valorSaque%10;
		}
		if(valorSaque/5>0){
			System.out.println("Notas de R$ 5 = "+valorSaque/5);
		}

		
		leTeclado.close();
		
	}

}
