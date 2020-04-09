
// contrato Autenticavel
// 		quem assina esse contrato precisa implementar 
//			metodo setSenha
//			metoso autentica
public abstract interface Autenticavel {

	public abstract boolean autentica(int senha);

	public abstract void setSenha(int senha);
}

//
//public abstract class Autenticavel {
//
//	private int senha;
//	
//	public boolean autentica(int senha) {
//		if(this.senha ==senha) {
//			return true;
//		}
//		return false;
//	}
//	
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}
//}
