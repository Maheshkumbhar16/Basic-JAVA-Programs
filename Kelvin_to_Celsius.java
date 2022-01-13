package examples;

public class Kelvin_to_Celsius {
	public static void main(String args[]) {
		//formula is c=k-273.15
		double k=300,c;
		c=k-273.15;
		System.out.println("Temp in Kelvin is : " + k);
		System.out.println("Temp in Celsius is : " + c);
	}
}
