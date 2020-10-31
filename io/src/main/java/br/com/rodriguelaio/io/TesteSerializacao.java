package br.com.rodriguelaio.io;

import java.io.*;

public class TesteSerializacao {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String nome = "Rodrigo Prates";
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("guelaio.bin"));
		objectOutputStream.writeObject(nome);
		objectOutputStream.close();

		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("guelaio.bin"));
		System.out.println((String) objectInputStream.readObject());
		objectInputStream.close();
	}
}
