package ex11;

public class RectangleFromSimpleGeometricObject 
	extends SimpleGeometricObject{
	
	private double width;
	private double height;
	
	public RectangleFromSimpleGeometricObject() {
	}
	
	public RectangleFromSimpleGeometricObject(
			double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
		
	}
	
	public RectangleFromSimpleGeometricObject(
			double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeigeht(double height ) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	
}
