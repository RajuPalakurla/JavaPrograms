package ApplicationFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Applicationtryresouce {

	public static void main(String[] args) {
		File file = new File("Example.txt");
		try (FileReader fileReader =new FileReader(file);
				BufferedReader bufferedReader =new BufferedReader(fileReader);){
			String line=bufferedReader.readLine();
			while(line != null) {
				System.out.println(line);
				line=bufferedReader.readLine();
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("Finally block!!!");
		}

	}

}
