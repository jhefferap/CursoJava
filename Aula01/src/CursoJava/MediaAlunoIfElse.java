package CursoJava;

import java.util.Scanner;

public class MediaAlunoIfElse {

	public static void main(String[] args) {
		// Exercício 7 - Verifica se o aluno foi aprovado ou não com if e else
		
		Scanner leTeclado = new Scanner(System.in);
		
		String nome;
		double n1, n2, n3, media;
		
		System.out.println("Informe o seu nome: ");
		nome = leTeclado.next();
		System.out.println("Digite a sua primeira nota: ");
		n1 = leTeclado.nextDouble();
		System.out.println("Digite a sua segunda nota: ");
		n2 = leTeclado.nextDouble();
		System.out.println("Digite a sua terceira nota: ");
		n3 = leTeclado.nextDouble();
		
		media = (n1+n2+n3)/3;
		
		if(media>=7){
			System.out.println("Sua média foi: " +media+ ". Você foi aprovado.");
		}else if(media>=4){
			System.out.println("Sua média foi: " +media+ ". Você ficou de exame.");
		}else{
			System.out.println("Sua média foi: " +media+ ". Você foi reprovado.");
		}
		System.out.println("Programa encerrado");
		leTeclado.close();
		
	}

}
