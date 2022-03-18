
public class Test {

	public static void main(String[] args) {
		
		Circle2D a = new Circle2D();
		System.out.printf("X: %s   Y: %s  Radius: %s", a.getX(), a.getY() , a.getRadius());
		System.out.println();
		
		Circle2D b = new Circle2D(5,0,5);
		System.out.printf("X: %s   Y: %s  Radius: %s", a.getX(), a.getY() , a.getRadius());
		System.out.println();
		
		System.out.println("The area is " + a.getArea());
		System.out.println("The Perimeter is " + a.getPerimeter());
		
		double[] point = {0,0};
		System.out.println(a.contains(point[0], point[1]));
		
		double[] invalidPoint = {100,100};
		System.out.println(a.contains(invalidPoint[0], invalidPoint[1]));
		
		System.out.println(b.contains(a));
		System.out.println(a.contains(b));
		System.out.println(a.overlaps(b));
	}
}