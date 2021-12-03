package week1.day2;

public class Amstrogno {

	public static void main(String[] args) {
		int rem;
		int cub=0;
		int org=123;
		int input=123;
		while(input>0) {
			
		rem = input%10;
		cub = cub+rem*rem*rem;
		input= input/10;
		}
		if (org==cub) {
			System.out.println("givennumber is amstrong"); 
		}else {
				System.out.println("not amstrong");
			}
			
		}
                     
	
	
	}

