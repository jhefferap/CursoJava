package aula2;

public class Ponto {
	//Por ser um atributo, é inicializado com valor padrão
	double x = 0.0;
	//Posso inicializar
	double y = 0.0;
	
	/**
	 * Método construtor
	 * @param coordx
	 * @param coordy
	 */
	public Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}

	/**
	 * Método deslocar que recebe dois parâmetros double
	 * @param deltax
	 * @param deltay
	 */
	
	public void deslocar(double deltax, double deltay){
		x += deltax;
		y += deltay;		
	}

	
	public void zerar(){
		x = 0;
		y = 0;
	}
	
	/**
	 * Example method with return
	 * @return
	 */
	
	public boolean isYMenorQueZero(){
		if(y<0)
			return true;
		return false;
	}
}
