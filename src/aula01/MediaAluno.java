package aula01;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		// Exercício 5 - Verifica se o aluno foi aprovado ou não
		
		Scanner leTeclado = new Scanner(System.in);
		
		String nome;
		double n1, n2, n3, n4;
		
		System.out.println("Informe o seu nome: ");
		nome = leTeclado.next();
		System.out.println("Digite a sua primeira nota: ");
		n1 = leTeclado.nextDouble();
		System.out.println("Digite a sua segunda nota: ");
		n2 = leTeclado.nextDouble();
		System.out.println("Digite a sua terceira nota: ");
		n3 = leTeclado.nextDouble();
		
		System.out.println((n1+n2+n3/3) >= 7 ? "Você foi APROVADO, não fez mais que sua obrigação." : "Você foi REPROVADO, estude mais energúmino.");

	}

}
