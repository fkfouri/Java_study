
import java.util.Scanner; // para ler dados do teclado

public class CacluladoraIMC {

    /**
     * Programa que calcula o IMC.
     *
     * O IMC eh calculado pela formula: IMC = peso / (altura * altura)
     *
     * Eh necessario informar o peso e a altura.
     *
     * O resultado sera impresso na saida padrao.
     *
     * @param args Nao eh usado.
     */
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        System.out.println("Digite o peso em kg: ");
        double peso = leitorTeclado.nextDouble();
        // double peso = 80;

        System.out.println("Digite a altura em cm: ");
        double altura = leitorTeclado.nextDouble();
        // double altura = 1.80f;

        double imc = peso / (altura * altura);
        System.out.println("O IMC para o peso " + peso + " e altura " + altura + " eh " + imc);

        // Necessario fechar o scanner, fica aberto mesmo encerrando o programa.
        leitorTeclado.close();
    }

}
