import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new RegularPolygon().getArea());
		System.out.println(new RegularPolygon(6,4).getArea());
		System.out.println(new RegularPolygon(10,4,5.6,7.8).getArea());
		
		System.out.println(new RegularPolygon().getPerimeter());
		System.out.println(new RegularPolygon(6,4).getPerimeter());
		System.out.println(new RegularPolygon(10,4,5.6,7.8).getPerimeter());
		
		System.out.println("Enter the number of rows and colums in the array:  ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		Location[] Location = new Location[a*b];
		System.out.println("Enter the array: ");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				Location[b*i+j] = new Location(i,j,input.nextDouble());
			}
		}
		double Max = 0;
		int j=0;
		for(int i=0;i<a*b;i++) {
			if(Location[i].getMaxValue() > Max) {
				Max = Location[i].getMaxValue();
				j =i;
			}
		}
		
		if((int)Max == Max) {
			System.out.println("The location of the largest element is " + (int)Max +" at "+"(" + Location[j].getX() + ","+Location[j].getY() +")" );
		}
		else {
			System.out.println("The location of the largest element is " + Max +" at "+"(" + Location[j].getX() + ","+Location[j].getY() +")" );
		}
		
		
	}

}
