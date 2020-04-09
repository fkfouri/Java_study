
public class TesteReferencias2 {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000);
		System.out.println(g1.getNome());
		
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		
		EditorDeVideo ev = new EditorDeVideo();
		ev.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
		

	}

}
