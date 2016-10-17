package collections;

import java.util.HashMap;
import java.util.Map;

public class Garagem {
	
	private Map<String, Veiculo> mapaVeiculos;
	
	public Garagem(){
		this.mapaVeiculos = new HashMap<>();
	}
	
	public void Adicionar (Veiculo automovel){
		if(mapaVeiculos.containsKey(automovel.getPlaca())==true){
			System.out.println("\nVeículo já existente!\n");
		}else{
			mapaVeiculos.put(automovel.getPlaca(), automovel);
			System.out.println("\nVeículo adicionado!\n");
		}
	}
	
	public void Vender (String placa){
		if(mapaVeiculos.containsKey(placa)==true){
		mapaVeiculos.remove(placa);
		System.out.println("\nVeículo vendido!");
		}else{
			System.out.println("\nVeículo não encontrado!\n");
		}
	}
	
	public void Buscar (String placa){		
		if(mapaVeiculos.containsKey(placa)==true){
			System.out.println(mapaVeiculos.get(placa));
		}else{
			System.out.println("Veículo não encontrado!\n");
		}
	}
	
	
	public void Listar (){		
	
	}
	
	public void Sair (){
	}

}
