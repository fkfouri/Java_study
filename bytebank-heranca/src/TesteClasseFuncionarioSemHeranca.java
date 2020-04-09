
public class TesteClasseFuncionarioSemHeranca {

	public static void main(String[] args) {
		ClasseFuncionarioSemHeranca f1 = new ClasseFuncionarioSemHeranca();
		f1.setSalario(3000);
		System.out.println(f1.getTipo());
		System.out.println(f1.getBonificacao());
		
		ClasseFuncionarioSemHeranca f2 = new ClasseFuncionarioSemHeranca();
		f2.setTipo(2);
		f2.setSalario(5000);
		System.out.println(f2.getTipo());
		System.out.println(f2.getBonificacao());
		
	}
	
}
