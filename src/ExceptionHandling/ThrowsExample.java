package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
	
	public static void readFile(String filePath) throws FileNotFoundException{
		File file = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		try {
			while((st = br.readLine()) != null) {
				System.out.println(st);
			}
		} catch(IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		try {
			readFile("nonexistent.txt");
		} catch(FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}

}
