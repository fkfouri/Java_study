public class Variaveis{

    // constante so pode ser definida no nivel da classe, nao do metodo.
    static final float VALOR_PI = 3.14f;
    static final double VALOR_DOUBLE = 3.14d;

    public static void main(String[] args){ 
        // variavels
        int idade = 25;
        idade = 30;

        //constante

        System.out.println(String.format("Minha idade eh %d", idade));
        System.out.println(String.format("O valor de PI eh %f", VALOR_PI));
        System.out.println(String.format("Constante Double eh %f", VALOR_DOUBLE));
    }

    

}