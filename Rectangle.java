
public class Rectangle {
	private double width;
	private double height;
	private static String color;
	
	
	public Rectangle() {
		width = 1;
		height = 1;
		color = "color"; }
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		color = "color"; }
	
	
	public double getWidth() {
		return width; }
	public double getHeight() {
		return height; }
	public static String getColor() {
		return color; }
	
	
	public void setWidth(double width) {
		this.width = width; }
	public void setHeight(double height) {
		this.height = height; }
	public static void setColor(String newColor) {
		color = newColor; }
	
	
	public double getArea() {
		return width * height; }
	public double getPerimeter() {
		return 2*width + 2*height; }
}
