package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException { //o IOEception cobre as execoes de FileInputStream e BufferedReader
		/*
		 * Fluxo de Entrada com Arquivo
		 */
		
		
		FileInputStream fis = new FileInputStream("lorem.txt");
		
		/*
		 * o InputStreamReader eh capaz de ler um input tipo int em caracteres 
		 */
		InputStreamReader isr = new InputStreamReader(fis);
		
		/*
		 * Neste caso, conseguimos transformar bits e bytes em caracteres, mas ainda não é a melhor solução para nosso problema.
		 * A ideia eh que sejamos capazes de ler as linhas inteiras do arquivo de texto, para isso, temos que "guardar" cada um dos caracteres, ate sermos capazes de completar uma linha, e assim por diante.
		 * Para esta tarefa, há o que chamamos de BufferedReader. 
		 */
		
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		while (linha!=null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		
		
		
		
		br.close(); //esse eh o suficiente, nao precisa fechar o isr e o fis.


	}

}
