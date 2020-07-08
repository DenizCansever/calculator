
public class Calculator {
	
	
	public int add(int number1,int number2) {
		int result= number1+number2;
		System.out.print("Addition of given 2 numbers: ");
		return result;
	}
	
	public int sub(int number1,int number2) {
		int result= number1-number2;
		System.out.print("Subtraction of given 2 numbers: ");
		return result;
	}
	
	public double div(double number1,double number2) {
		double result= number1/number2;
		System.out.print("Division of given 2 numbers: ");
		return result;
	}
	
	public int mul(int number1,int number2) {
		int result= number1*number2;
		System.out.print("Multiplication of given 2 numbers: ");
		return result;
	}
	
	public void printChoices() {
		
		System.out.println("\nWelcome to the Calculator.");
		System.out.println("For addition, please press 1");
		System.out.println("For subtraction, please press 2");
		System.out.println("For division, please press 3");
		System.out.println("For multiplication, please press 4");
		System.out.println("Have fun! -DC ");
		
	}
	
	
	
}
