package collections;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	private double preco;
	
	public Veiculo (String marca, String modelo, String placa, int ano, double preco){
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
		
	@Override
	public String toString() {
		return "*Dados do veículo* \nMarca: " + marca + " \nModelo: " + modelo + "\nPlaca: "
				+ placa + "\nAno: " + ano + "\nPreço: " + preco + "\n";
	}

	public int compareTo(Veiculo outroVeiculo) {
        if (this.placa.hashCode() < outroVeiculo.placa.hashCode()) {
            return -1;
        }
        if (this.placa.hashCode() > outroVeiculo.placa.hashCode()) {
            return 1;
        }
        return 0;
    }
}
