package br.com.alura.java.io.Serializacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerialize {

	public static void main(String[] args) throws IOException {

		String nome = "Fabio Kfouri";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		
		oos.writeObject(nome);
		oos.close();
		
		
		
	}

}
