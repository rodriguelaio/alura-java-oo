package br.com.rodriguelaio.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteScanner {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("guelaio.txt"), "UTF-8");
		while (scanner.hasNextLine()) {
			Scanner newScanner = new Scanner(scanner.nextLine());
			System.out.println(newScanner);
			newScanner.close();
		}
		scanner.close();
	}
}
