package array;

import java.util.Scanner;

public class InverterArray {

	public static void main(String[] args) {
		Scanner leDados = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de números: ");;
		
		int n = leDados.nextInt();
		
		int [] numeros =  new int [n], numerosInvertidos = new int [n];

		for(int i = 0; i < numeros.length; i++){
			System.out.println("Informe o número da posição "+i+": ");
			numeros[i] = leDados.nextInt();
		}
		
		for(int i = 0, j = numeros.length - 1; i < numeros.length; i++,j--){
			numerosInvertidos[i] = numeros[j];			
		}
		
		for (int numeroDaPosicao : numerosInvertidos){
			System.out.println("Número da posição "+ numeroDaPosicao);
		}
	}

}
