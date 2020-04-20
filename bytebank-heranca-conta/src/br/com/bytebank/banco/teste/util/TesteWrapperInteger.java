package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

	     int[] idades = new int[5];
         String[] nomes = new String[5];

         int idade = 29; //Integer
         Integer idadeRef = new Integer(29);
         List<Integer> numeros = new ArrayList<Integer>();
         numeros.add(29); //Autoboxing
         
         //Essa forma esta deprecated. Nao deveria ser possivel incluir usando o new Integer
         Integer idade2 = new Integer(20);
         
         // O mode correto de criaçao de objeto eh apartir do metodo estatico da classe Integer chamado valueOf
         Integer idade3 = Integer.valueOf(20); //autoboxing
         
         //Lendo o valor do objeto
         int val = idade3.intValue(); //Unboxing
         
         System.out.println(idade3);
		
         
         numeros.add(29); //Internamente o Java esta fazendo o autoboxing
         numeros.add(Integer.valueOf(29)); //O Java esta na verdade fazendo isso.
         
         
         /*
          * Outros metodos interessantes da classe Integer.
          * */
         
         
         Integer numero = Integer.valueOf("10"); //Leitura de uma String
         int numeroPrimitivo = Integer.parseInt("11"); // Realizando um parsing, transforma String em inteiro.
         
         System.out.println(numero + " - " + numeroPrimitivo);
         
         
         //Transformando em outro tipo de Primitivo
         System.out.println(numero.doubleValue());
         
         
         System.out.println("A tipo primitivo int suporta numeros entre " + numero.MIN_VALUE + " e " + numero.MAX_VALUE );
         System.out.println("E tem tamanho de " + numero.BYTES + " bytes.");
         
     
         Integer ref = Integer.valueOf("3");
         ref++;
         System.out.println(ref); 
	}

}
