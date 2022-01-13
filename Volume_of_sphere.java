package examples;

public class Volume_of_sphere {
	public static void main(String args[]) {
		int rad_sphere=6;
		final double PI=3.14;
		double vol_sphere=((4*PI*rad_sphere*rad_sphere*rad_sphere)/3);
		System.out.println("Radius of sphere is : " + rad_sphere);
		System.out.println("Volume of sphere is : " + vol_sphere);
	}
}
