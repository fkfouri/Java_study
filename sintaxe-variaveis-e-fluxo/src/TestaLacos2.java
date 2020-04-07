
public class TestaLacos2 {

	public static void main(String[] args) {
		System.out.println("brincando de ASCIIart");
		for(int linha =1; linha <10; linha++) {
			for(int coluna =0; coluna <10; coluna++) {
				if(coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("outra forma");
		for(int linha =1; linha <10; linha++) {
			for(int coluna =0; coluna <linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
