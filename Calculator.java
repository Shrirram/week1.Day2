package week1.day2;

public class Calculator {

	private int add(int num1, int num2) {
		return num1+num2;

	}
	private int sub(int num1, int num2) {
		return num1-num2;

	}
	private int mul(int num1, int num2) {
		return num1*num2;

	}
	private int div(int num1, int num2) {
		return num1/num2;

	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(5, 10));
		System.out.println(calc.sub(10, 5));
		System.out.println(calc.mul(5, 10));
		System.out.println(calc.div(10, 2));
		
	}
}
