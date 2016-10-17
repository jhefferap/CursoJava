package modificadoresAcesso;

public class TestarLogica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Jefferson";
		double sal = 1000;
		String cargo = "Técnico";
		double porcent = 5;
		
		Funcionario func =  new Funcionario (nome,sal,cargo,porcent);
		
		System.out.println(func.getSalario());
		System.out.println(func.getPorcentagemBonificacao());
		
		//func.setSalario(1600);
		func.setPorcentagemBonificacao(10);
		
		System.out.println(func.getSalario());
		
		

	}

}
