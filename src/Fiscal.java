
public class Fiscal extends Funcionario implements Autenticavel {

	private int senha;
	
	@Override
	public double getBonificacao() {
		return 30;
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
			if(this.senha == senha) {
				return true;
			} else {
			   return false;
		}
	}
}
