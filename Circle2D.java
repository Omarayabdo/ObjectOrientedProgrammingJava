public class Circle2D {
	private double x;
	private double y;
	private double radius;
	
	public Circle2D() {
		this.x = Math.PI;
		this.y = Math.PI;
		this.radius = 1;
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	
	public boolean contains(double x, double y) {
		return distance(this.x, this.y, x, y) <= this.radius;
	}
	
	public boolean contains(Circle2D circle) {
		double distanceBetweenCenters = distance(this.x, this.y, circle.x, circle.y);
		return distanceBetweenCenters + circle.radius <= this.radius;
	}
	
	public boolean overlaps(Circle2D circle) {
		double  distanceBetweenCenters = distance(this.x, this.y, circle.x, circle.y);
		return distanceBetweenCenters <= (this.radius + circle.radius)
			&& distanceBetweenCenters >= Math.abs(this.radius - circle.radius);
	}
}
