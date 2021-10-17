
public class Palindrome {
	public static void main(String[] args) {
		String value="0001000";
		System.out.println("Checking palindrome...");
		displayResult(checkPalindrome(value),value);
		System.out.println("\nRecursive checking Palindrome...");
		displayResult(recursiveCheck(value),value);
	}
	public static boolean checkPalindrome(String stringValue) {
		int len=stringValue.length(),index=0;
		while(index<len && len != 0) {
			if(stringValue.charAt(index++) != stringValue.charAt(len---1))return false;
		}
		return true;
	}
	public static boolean recursiveCheck(String value) {
		if(value.length()==1 || value.length()==0) return true;
		else if(value.charAt(0) != value.charAt(value.length()-1)) return false;
		return recursiveCheck(value.substring(1,value.length()-1));
	}
	public static void displayResult(Boolean flag,String value) {
		if(flag)
			System.out.println("Given string \""+value+"\" is palindrome");
		else {
			System.out.println("Given String \""+value+"\" is not palindrome");
		}
	}
}
