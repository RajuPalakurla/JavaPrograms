package LearnString;

public class StringApplication {

	public static void main(String[] args) {
		String bufferString = "Palakurla Raju https://www.youtube.com/watch?v=4CIiYzC0W5Q12312/async dsgf sdhf dsf ksdfh";
		String bufferString2 = "Palakurla Raju Palakurla Raju Palakurla Raju https://www.youtube.com/watch?v=4CIiYzC0W5Q6778/sync  sksfkk";
		String bufferString3 = "fdf sds Palakurla Raju Palakurla Raju https://www.youtube.com/watch?v=4CIiYzC0W5Q9000008/sync with sdfhjhd dskfhh";
		System.out.println(getUrl(bufferString, "https://"));
		System.out.println(getUrl(bufferString2, "https://"));
		System.out.println(getUrl(bufferString3, "https://"));
	}
	
	public static String getUrl(String line,String matchString) {
		int index=line.indexOf(matchString);
		return line.substring(index,line.indexOf(" ",index));
	}
}
