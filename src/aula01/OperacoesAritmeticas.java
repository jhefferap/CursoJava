package aula01;

import java.util.Scanner;

public class OperacoesAritmeticas {
	
	public static void main(String[] args) {
		
		Scanner leTeclado = new Scanner(System.in);
		
		//Exercício 3 - Realiza as operações aritiméticas

		double num1, num2;
		
		System.out.println("Digite o primeiro número:");
		num1 = leTeclado.nextDouble();
		System.out.println("Digite o segundo número:");
		num2 = leTeclado.nextDouble();
		
		System.out.println("*************OPERADORES ARITMÉTICOS*************");
		System.out.println("\nSOMA");
		System.out.println(num1+ " + " +num2+ " = " +(num1+num2));
		System.out.println("\nSUBTRAÇÃO");
		System.out.println(num1+ " - " +num2+ " = " +(num1-num2));
		System.out.println("\nMULTIPLICAÇÃO");
		System.out.println(num1+ " * " +num2+ " = " +(num1*num2));
		System.out.println("\nDIVISÃO");
		System.out.println(num1+ " / " +num2+ " = " +(num1/num2));
		System.out.println("\nMÓDULO/RESTO DA DIVISÃO");
		System.out.println(num1+ " % " +num2+ " = " +(num1%num2));

		
	}


}
