package array;

import java.util.Scanner;

public class TestarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leDados = new Scanner(System.in);
		
		int [] numerosArray = new int [10];
		int numeroInformado;
		
		for(int i = 0;i<numerosArray.length;i++){
			System.out.println("Digite o número para a posição "+i);
			numeroInformado = leDados.nextInt();
			numerosArray[i] = numeroInformado;
		}
		
		for(int numeroDaPosicao : numerosArray){
			System.out.println("Número da posição "+ numeroDaPosicao);
		}

	}

}
