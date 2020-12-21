
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		
		Gerente nico = new Gerente();
		nico.setNome("Paulo Silveira");
		nico.setCpf("111222333-55");
		nico.setSalario(25000.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		 //nico.salario = 300.0;
		
	}
	
}
