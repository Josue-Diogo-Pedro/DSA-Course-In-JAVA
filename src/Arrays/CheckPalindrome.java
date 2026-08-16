package Arrays;

public class CheckPalindrome {
	
	private static boolean isPalindrome(String word) {
		char[] charArray = word.toCharArray();
		int start = 0, end = word.length() - 1;
		while(start < end) {
			if(charArray[start] != charArray[end]) {
				return false;
			}
			
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("madam"));
	}

}
