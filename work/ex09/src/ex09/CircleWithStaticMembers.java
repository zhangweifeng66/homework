package ex09;

public class CircleWithStaticMembers {
	double radius;
	static int numberOfObjects = 0;
	
	CircleWithStaticMembers(){
		radius = 1;
		numberOfObjects++;
	}
	
	CircleWithStaticMembers(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects() {
		return numberOfObjects;
		//只能用静态属性
//		return radius;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
}
