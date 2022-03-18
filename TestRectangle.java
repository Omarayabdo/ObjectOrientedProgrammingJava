
public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(4,40);
		Rectangle b = new Rectangle(3.5,35.9);
		Rectangle.setColor("red");
		
		System.out.printf("Rectangle a: color %s, height %f, width %f, area %f, perimeter %f",
				Rectangle.getColor(), a.getHeight(), a.getWidth(), a.getArea(), a.getPerimeter());
		
		System.out.println();
		
		System.out.printf("Rectangle b: color %s, height %f, width %f, area %f, perimeter %f",
				Rectangle.getColor(), b.getHeight(), b.getWidth(), b.getArea(), b.getPerimeter());
		
		a.setWidth(20);
		System.out.println();
		System.out.printf("Rectangle a: color %s, height %f, width %f, area %f, perimeter %f",
				Rectangle.getColor(), a.getHeight(), a.getWidth(), a.getArea(), a.getPerimeter());
	}

}
