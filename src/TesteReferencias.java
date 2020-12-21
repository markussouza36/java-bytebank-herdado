
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Paulo");
		g1.setSalario(8000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(8500.0);
		
		Designer d = new Designer();
		d.setSalario(7500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(g1);
		controle.registro(ev);
		controle.registro(d);
		
		System.out.println(controle.getSoma());
		
	}

}
