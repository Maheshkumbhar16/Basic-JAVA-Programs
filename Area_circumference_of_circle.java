package examples;

public class Area_circumference_of_circle {
	public static void main(String args[]) {
		int r=5;
		double areaofcircle, circumferenceofcircle;
		final double pi = 3.14;
		areaofcircle = pi*r*r;
		circumferenceofcircle = 2*pi*r;
		System.out.println("Radius of circle : " + r);
		System.out.println("Area of circle : " + areaofcircle);
		System.out.println("circumference of circle : " + circumferenceofcircle);
	}
}
