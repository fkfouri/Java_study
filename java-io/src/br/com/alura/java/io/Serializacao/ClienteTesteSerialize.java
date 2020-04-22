package br.com.alura.java.io.Serializacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClienteTesteSerialize {

	public static void main(String[] args) throws IOException {
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Fabio Kfouri");
		cliente.setProfissao("Engenheiro");
		cliente.setCpf("123");

	
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		
		oos.writeObject(cliente);
		oos.close();
		
		
		
	}

}
