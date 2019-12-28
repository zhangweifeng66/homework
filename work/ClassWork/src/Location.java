
public class Location {
	private int x ;
	private int y ; 
	double maxValue;
	
	public Location( int a,int b,double maxValue) {
		this.x = a;
		this.y = b;
		this.maxValue = maxValue;
	}
	
	public Location() {
		this.maxValue = 0;
		this.x = 0;
		this.y = 0;
	}
	
	public double getMaxValue() {
		return this.maxValue;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
