public class Square extends GeometricObject implements Colorable {
	private double side;
	public Square() {
		super();side = 2;
		}
	public Square(String color, boolean filled, double side) {
		super(color, filled);this.side = side;
		}
	public void howToColor() {
		System.out.println("Color a square by coloring inside the 4 sides of the geometric object.");
		}
	public double getArea() {
		return side * side;
		}
	public double getPerimeter() {
		return side * 4;
		}
	public static void main(String [] args) {
		Square[] g = new Square[5];
		
		g[0] = new Square("Blue", true, 5);
		g[1] = new Square("Blue", true, 5);
		g[2] = new Square("Blue", true, 5);
		g[3] = new Square("Red", false, 3);
		g[4] = new Square("Orange", false, 4);
		
		for(int i = 0; i < g.length; i++) {
			if(g[i].isFilled())
				g[i].howToColor();
			}
		}
	@Override
	public void howtoColor() {
		// TODO Auto-generated method stub
		
	}
	}