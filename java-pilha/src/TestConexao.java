
public class TestConexao {

	public static void main(String[] args) {
		
		//Esse novo metodo de Try, ja faz o try e o Finally
		//chamado de Try-with-resources
		try (Conexao con = new Conexao()){
			con.leDados();
		} catch (Exception e) {
			System.out.println("Deu erro na Conexao");
		}
		
//		//---------------------------
//
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			
//		} catch (Exception e) {
//			System.out.println("Deu erro na Conexao");
//			
//		} finally {
//			con.fecha();
//		}

	}

}
