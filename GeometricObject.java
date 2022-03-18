
public abstract class GeometricObject {
	private String color;
	private boolean filled;
	
	public GeometricObject(){
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor(){
		return color;
	}
	
	public boolean getFilled(){
		return filled;
	}
	
	public abstract double getArea();

	public abstract double getPerimeter();
	
	public abstract String toString();
}
