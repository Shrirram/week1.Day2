package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String word1 = "Mom";
		String word2 = "Mom";
		
		if(word1.equalsIgnoreCase(word2)) {
			System.out.println("The given String is Palindrome");
		}
		else
			System.out.println("The given string is not Palindrome");
	}

}
