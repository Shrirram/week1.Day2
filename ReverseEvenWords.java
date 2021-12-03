package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a tester"; 
		String [] txt1 = test.split(" ");
		for(int i=0; i< txt1.length;i++)
		{
		if (i % 2 == 1) {
			char [] temptext = txt1[i].toCharArray();
			for (int k=temptext.length-1;k>=0; k--) {
				System.out.println(temptext[k]);
			}
			System.out.println(" ");
		}
		else System.out.println(txt1[i] + " ");
		}
		}

}
