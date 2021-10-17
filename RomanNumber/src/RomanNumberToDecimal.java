import java.util.HashMap;

public class RomanNumberToDecimal {

	public static void main(String[] args) {
		String sRomanValue="MMMMDCCCXII";
		int iDecimalNumber=getDecimanNumber(sRomanValue);
		System.out.println("Decimal Value of "+sRomanValue+" is "+iDecimalNumber);
	}
	public static int getDecimanNumber(String sRomanValue) {
		HashMap<Character, Integer> resultMap = getRomanMap();
		int valueLenght=sRomanValue.length();
		int index=0,Number=0;
		while(index<valueLenght) {
			char ch2=Character.toUpperCase(sRomanValue.charAt(index));
			if(index>=1) {
				char ch1=Character.toUpperCase(sRomanValue.charAt(index-1));
				if(resultMap.get(ch1) >= resultMap.get(ch2)){
					Number+=resultMap.get(ch2);
				}
				else {
					Number-=resultMap.get(ch1);
					Number+=resultMap.get(ch2)-resultMap.get(ch1);
				}
			}
			else {
				Number+=resultMap.get(ch2);
			}
			index++;
		}
		return Number;
	}
	public static HashMap<Character, Integer> getRomanMap() {
		HashMap<Character, Integer> romanMap=new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		return romanMap;
	}
	

}
