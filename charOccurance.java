package week1.day2;

public class charOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int occ=0;
		str.toCharArray();
		str.length();
		for(int i=0; i< str.length();i++) {
			if(str.charAt(i)== 'e') {
				occ++;				
				System.out.println("The number of 'e' Occurences in given string is: " + occ);
			}
		}
		
	}

}
