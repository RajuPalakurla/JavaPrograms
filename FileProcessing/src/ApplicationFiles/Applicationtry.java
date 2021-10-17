package ApplicationFiles;
import java.io.*;

public class Applicationtry {

	public static void main(String[] args){
		File file = new File("Exampleasa.txt");
		FileReader fileReader =null;
		BufferedReader bufferedReader =null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line=bufferedReader.readLine();
			while(line != null) {
				System.out.println(line);
				line=bufferedReader.readLine();
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
