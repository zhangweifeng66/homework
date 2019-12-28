package ex02;
import java.util.Scanner;

public class work01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double PI = 3.14159;
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        double area = radius * radius * PI;
        
        System.out.println("The area for the citcle of radius " +
        radius + " is " + area);
        
        input.close();
        
	}

}
