//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Editor de Video!!!");
		return 100;
	}

}
