package aula01;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		// Exercício 9 - Ordem crescente de três números
		
		Scanner leTeclado = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Informe o primeiro número: ");
		a = leTeclado.nextInt();
		
		System.out.println("Informe o segundo número: ");
		b = leTeclado.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		c = leTeclado.nextInt();
		
		if((a<b)&&(a<c)){
			System.out.println(a);
			if(b<c){
				System.out.println(b);
				System.out.println(c);
			}else{
				System.out.println(c);
				System.out.println(b);
			}
		}else if (b<c){
			System.out.println(b);
			if(c<a){
				System.out.println(c);
				System.out.println(a);
				
			}else{
				System.out.println(a);
				System.out.println(c);
			}
		}else{
			System.out.println(c);
			if(b<a){
				System.out.println(b);
				System.out.println(a);
				
			}else{
				System.out.println(a);
				System.out.println(b);
			}
		}

		
		leTeclado.close();
		
	}

}
