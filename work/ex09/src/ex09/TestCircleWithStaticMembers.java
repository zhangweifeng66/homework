package ex09;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating object");
		System.out.println("The number of Circle objects is "
				+ CircleWithStaticMembers.numberOfObjects);
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();
		
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + 
				") and number of Circle object (" + 
				c1.numberOfObjects + ")");
		
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
		
		c1.radius = 9;
		
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + 
				") and number of Circle object (" + 
				c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + 
				") and number of Circle object (" + 
				c2.numberOfObjects + ")");
		System.out.println("\n getNumberOfObjects is " +
				c2.getNumberOfObjects());
		//类名  和  应用变量都可以使用静态方法
		
		
		
	}

}
