package examples;

public class Fahrenheit_to_Kelvin {
	public static void main(String args[]) {
		//formula is k= (((f-32)*5)/9)+273.15
		double f = 80.33,k;
		k = (((f-32)*5)/9)+ 273.15;
		System.out.println("Temp in Fahrenheit is : " + f);
		System.out.println("Temp in Kelvin is : " + k);
	}
}
