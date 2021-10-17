package ApplicationFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter some text");
		String line = sobj.nextLine();
		System.out.println(line);
		
		File fileobj = new File("Example.txt");
		@SuppressWarnings("resource")
		Scanner freader = new Scanner(fileobj);
		while(freader.hasNextLine()) {
			String text = freader.nextLine();
			System.out.println(text);
		}	
		
		
	}
}
