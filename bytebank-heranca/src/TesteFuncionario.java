
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario fabio = new Funcionario();
		fabio.setNome("Fabio Kfas");
		fabio.setCpf("12345678-90");
		fabio.setSalario(1080);
		
		System.out.println(fabio.getNome());
		System.out.println(fabio.getBonificacao());

	}

}
