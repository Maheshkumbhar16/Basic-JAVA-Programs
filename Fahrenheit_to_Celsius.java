package examples;

public class Fahrenheit_to_Celsius {
	public static void main(String args[]) {
		//formula is C=(F-32)/1.8
		double f = 95;
		double c=(f-32)/1.8;
		System.out.println("Temp in Fahrenheit is : " + f);
		System.out.println("Temp in Celsius is : " + c);
	}
}
