public class Triange extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triange() {
		super();
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}

	public Triange(double side1, double side2, double side3, String color, boolean filled) {
		super(color,filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double hp = (side1 + side2 + side3) / 2.0;
		return Math.sqrt(hp * (hp - side1) * (hp - side2) * (hp - side3));
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return "Triangle { " + 
				"Area: " + getArea() +
				", Perimeter: " + getPerimeter() +
				", Color: " + getColor() +
				", Filled: " + getFilled() +
				" }";
	}
	
}