import java.util.Arrays;
import java.util.Scanner;

public class work7_17and7_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number;
		String name;
		int exam;
		int sum=0;
		int i,j;
		Student Tmp ;
		
		Student[] student  = new Student[100];
		
		System.out.println("Enter the number of student: ");
		number = scanner.nextInt();
		System.out.println("Enter the name of student\nthe exam: ");
		System.out.println("Please follow the order ");
		
		int[] score = new int[number];
		for(i=0;i<number;i++) {
			student[i] = new Student(scanner.next(),scanner.nextInt());
		}
		for(i=0;i<number-1;i++) {
			for(j=0;j<number-1-i;j++) {
				if(student[i].getExam() >= student[i+1].getExam()) {
					Tmp = student[i+1];
					student[i+1] = student[i];
					student[i] = Tmp;
				}
			}
		}
		for(i=number-1;i>=0;i--) {
			System.out.println(student[i].getExam() + " "+ student[i].getName());
		}
	}

}
