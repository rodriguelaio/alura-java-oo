package br.com.rodriguelaio.io;

import java.io.*;

public class TestaEscrita {
	public static void main(String[] args) throws IOException {

		String fileName = "guelaio2.txt";

		createFile(fileName);

		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

		try {
			bufferedWriter.write("WOW PEI");
			bufferedWriter.newLine();
			bufferedWriter.write("FLAU");
			bufferedWriter.newLine();
		} finally {
			bufferedWriter.close();
		}
	}

	static void createFile(String fileName) throws IOException {
		File newFile = new File(fileName);
		if (!newFile.exists()) System.out.println(newFile.createNewFile());
	}
}
