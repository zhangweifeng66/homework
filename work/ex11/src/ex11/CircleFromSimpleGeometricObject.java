package ex11;

public class CircleFromSimpleGeometricObject 
	extends SimpleGeometricObject{
	private double radius;
	
	public CircleFromSimpleGeometricObject() {
	}
	
	public CircleFromSimpleGeometricObject(double radius) {
		this.radius = radius;
	}
	
	public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
		
		super(color, filled);//�����ڿ�ʼ,����
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	/*
	@partten
	*/
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() 
		/*��Ϊ���������ֱ�ӵ��û���ķ���,���ö���ӷ���*/+ 
				" and the radisu is " + radius);
	}
	@Override
	public String toString() {
		return super.toString() + "\nradius is " + radius;
	}
}
