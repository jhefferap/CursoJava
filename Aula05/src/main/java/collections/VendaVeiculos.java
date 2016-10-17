package collections;

import java.util.Scanner;

public class VendaVeiculos {

	public static void main(String[] args) {
		
		String marca, modelo, placa;
		int ano, opcao=0;
		double preco;
		
		Scanner leDados = new Scanner(System.in);
		
		Garagem minhaGaragem = new Garagem ();
		
		while(opcao!=5){
			
			System.out.println("************MENU DA GARAGEM************");		
			System.out.println("Digite o número correspondente à opção:");
			System.out.println("\n1-Adicionar");
			System.out.println("2-Vender(por placa)");
			System.out.println("3-Buscar(por placa)");
			System.out.println("4-Listar");
			System.out.println("5-Sair\n");
			
			opcao = leDados.nextInt();
			
			if(opcao == 1){
				System.out.print("\nDigite a marca: ");
				marca = leDados.next();
				System.out.print("\nDigite o modelo: ");
				modelo = leDados.next();
				System.out.print("\nDigite a placa: ");
				placa = leDados.next();
				System.out.print("\nDigite o ano: ");
				ano = leDados.nextInt();
				System.out.print("\nDigite o preço: ");
				preco = leDados.nextDouble();
				Veiculo novoVeiculo = new Veiculo (marca, modelo, placa, ano, preco);
				minhaGaragem.Adicionar(novoVeiculo);
			}
			else if(opcao == 2){
				System.out.print("\nDigite a placa do veículo que será vendido: ");
				placa = leDados.next();
				minhaGaragem.Vender(placa);
			}
			else if(opcao == 3){
				System.out.print("\nDigite a placa do veículo a ser buscado: ");
				placa = leDados.next();
				minhaGaragem.Buscar(placa);
			}
			else if(opcao == 4){
				minhaGaragem.Listar();
			}
			else{
				opcao = 5;
			}
		}
		
		
		
		

	}

}
