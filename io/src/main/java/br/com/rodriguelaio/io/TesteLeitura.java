package br.com.rodriguelaio.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("guelaio.txt");   //
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); //Design Pattern - DECORATOR
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);        //

		readLine(bufferedReader);

		bufferedReader.close();
	}

	static void readLine(BufferedReader bufferedReader) throws IOException {
		String newLine = bufferedReader.readLine();
		while (newLine != null){
			System.out.println(newLine);
			newLine = bufferedReader.readLine();
		}
	}
}
