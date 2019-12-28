package helloworld;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Length,Area;
		//调用PI
		Length=Math.PI*2*5.5;
	    Area=Math.PI*5.5*5.5;
	    Scanner scanf=new Scanner(System.in);
	    int hh = scanf.nextInt();
	    System.out.println("半径为5。5的周长和面积分别为"+Length+","+Area+":"+hh);
	}

}
