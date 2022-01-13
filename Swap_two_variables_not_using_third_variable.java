package examples;

public class Swap_two_variables_not_using_third_variable {
	public static void main(String args[]) {
		int num1=25, num2=20;
	    System.out.println("Input 1st number : " + num1);
	    System.out.println("Input 2nd number : " + num2);
	    num2=num2+num1;
	    num1=num2-num1;
	    num2=num2-num1;
	    System.out.println("After swapping the 1st number is : " + num1);
	    System.out.println("After swapping the 2nd number is : " + num2);
	}
}
