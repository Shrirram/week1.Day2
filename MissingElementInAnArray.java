package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		for (int i=1;i< 6 ;i++) {
			
			if(i == arr[i-1]) {
				
				System.out.println("array index number is :" +arr[i]);
			}
			else 
		System.out.println("Missing number is :" +i);
			
		}
	}

}
