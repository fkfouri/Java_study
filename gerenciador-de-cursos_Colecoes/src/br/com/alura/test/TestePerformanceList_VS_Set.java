package br.com.alura.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
 * Este teste serve para evidenciar a diferenca de tempo em milisegundos para 
 * criar uma lista com n elementos e tempo de busca.
 * 
 * Observe que o Set eh muito mais rapido
 */
public class TestePerformanceList_VS_Set {

	public static void main(String[] args) {
		Collection<Integer> numeros = new ArrayList<Integer>();
		
		int sizeTest = 100000;
		
		test(new ArrayList<Integer>(), sizeTest);
		
		numeros = new HashSet<>();
		test(new HashSet<>(), sizeTest);

	}

	public static void test(Collection<Integer> numeros, int sizeTest) {
		
        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= sizeTest; i++) {
            numeros.add(i);
        }

        long intermediate = System.currentTimeMillis();
        
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoAdicao = intermediate - inicio;
        long TempoBusca = fim - intermediate;
        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo Adicao: " + tempoAdicao + ", Tempo de Busca: " + TempoBusca + ", Tempo Total: " + tempoDeExecucao);

	}
	
	
}
