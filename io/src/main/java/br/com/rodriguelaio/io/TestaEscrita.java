package br.com.rodriguelaio.io;

import java.io.*;

public class TestaEscrita {
	public static void main(String[] args) throws IOException {

		String fileName = "guelaio2.txt";

		createFile(fileName);

		//1a FORMA
//		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
//		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
//		try {
//			bufferedWriter.write("WOW PEI");
//			bufferedWriter.newLine();
//			bufferedWriter.write("FLAU");
//			bufferedWriter.newLine();
//		} finally {
//			bufferedWriter.close();
//		}

		//2a FORMA
		//Mais simples e menos burocratica
//		PrintStream printStream = new PrintStream(fileName);
//		printStream.println("WOW PEI");
//		printStream.println();
//		printStream.println("FLAU");
//		printStream.println();
//		printStream.close();

		//3a FORMA
		//Bem parecida com a forma anterior.
		//Intruduzido a partir do java 1.1
		PrintWriter printWriter = new PrintWriter(fileName);
		printWriter.println("WOW PEI");
		printWriter.println();
		printWriter.println("FLAU");
		printWriter.println();
		printWriter.close();
	}

	static void createFile(String fileName) throws IOException {
		File newFile = new File(fileName);
		if (!newFile.exists()) System.out.println(newFile.createNewFile());
	}
}
