package aula2;

import java.util.Scanner;

public class TestarPessoa {

	public static void main(String[] args) {
		
		Scanner leDados = new Scanner(System.in);
		
		String nome;
		String cpf;
		String rg;
		
		System.out.println("Nome: ");
		nome = leDados.next();
		System.out.println("CPF: ");
		cpf = leDados.next();
		System.out.println("RG: ");
		rg = leDados.next();
		
		Pessoa p = new Pessoa(nome, cpf, rg);
		
		System.out.println(p);
		

	}

}
