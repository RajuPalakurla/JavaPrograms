public class SearchBigPalindrome {

	public static void main(String[] args) {
		String cBigString="ertuytugdxvvmlcmmabbadghj aaaaadaaaaagasdlgllueqwertyuipsdfghjklzxcvbnm",sMaxPalinString=null;
		int index=0,length=cBigString.length(),maxpalLen=0,subCounter=0;
		while(index<length) {
			subCounter=index;
			while(subCounter<length) {
				String subString=cBigString.substring(index,subCounter);
				if(checkPalindrome(subString)) {
					if(maxpalLen < subString.length()) {
						maxpalLen=subString.length();
						sMaxPalinString=subString;
					}
				}
				subCounter++;
			}
			index++;
		}
		System.out.println("Big Palindrom of \""+cBigString+"\" is");
		System.out.println(sMaxPalinString);
	}
	public static boolean checkPalindrome(String sSubString) {
		if(sSubString.length()==1 || sSubString.length()==0) return true;
		else if(sSubString.charAt(0)!=sSubString.charAt(sSubString.length()-1)) return  false;
		return checkPalindrome(sSubString.substring(1,sSubString.length()-1));
	}
}
