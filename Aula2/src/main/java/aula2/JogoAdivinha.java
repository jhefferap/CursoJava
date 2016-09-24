package aula2;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

	public static void main (String[] args){
		Scanner leDados = new Scanner(System.in);
		
		int numero = new Random().nextInt(10) + 1;
		int valorDigitado;
		boolean acerto = false;
		
		System.out.println("Digite um número: ");
		
		for(int j=1; acerto==false; j++){
			valorDigitado = leDados.nextInt();	
			
			if(valorDigitado==numero){
				System.out.println("Parabéns, você acertou em "+j+" tentativa(s)!");
				acerto=false;
			}else{
				System.out.println("Que pena, você não acertou. Digite outro número: ");
			}
		}

		
	}
}
