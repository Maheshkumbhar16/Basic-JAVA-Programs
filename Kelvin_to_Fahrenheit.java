package examples;

public class Kelvin_to_Fahrenheit {
	public static void main(String args[]) {
		//formula is f=(k-273.15)*1.8+32
		double k=300,f;
		f=(k-273.15)*1.8+32;
		System.out.println("Temp in Kelvin is : " + k);
		System.out.println("Temp in Fahrenheit is : " + f);
	}
}
