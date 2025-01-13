public class CacluladoraIMC {

    public static void main(String[] args) {

        double peso = 80;
        double altura = 1.80f;
        double imc = peso / (altura * altura);
        System.out.println("O IMC para o peso " + peso + " e altura " + altura + " eh " + imc);
    }


    
}
