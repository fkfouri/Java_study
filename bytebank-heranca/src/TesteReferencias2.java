
public class TesteReferencias2 {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000);
		System.out.println(g1.getNome());
		
		
		//Funcionario f = new Funcionario(); //Este agora eh um objeto abstrato. Apenas para ser usado por heranca.
		//f.setSalario(2000);
		
		EditorDeVideo ev = new EditorDeVideo();
		ev.setSalario(2500);
		
		Designer d = new Designer();
		d.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		

	}

}
