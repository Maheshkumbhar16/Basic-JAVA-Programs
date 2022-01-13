package examples;

public class Volume_of_cylinder {
	public static void main(String args[]) {
		int r=6,h=8;
		final double pi =3.14;
		double volumeofcylinder;
		volumeofcylinder = pi*r*r*h;
		System.out.println("Radius of cylinder is : " + r);
		System.out.println("Height of cylinder is : " + h);
		System.out.println("Volume of cylinder is : " + volumeofcylinder);
	}
}
