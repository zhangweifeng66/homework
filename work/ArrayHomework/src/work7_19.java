import java.util.Scanner;

public class work7_19 {
	public static void main(String[] args) {
		boolean tmp = false;
		System.out.print("Enter list: ");
		Scanner scanner = new Scanner(System.in);
		
		int iInput = scanner.nextInt();
		int[] array = new int[iInput];
		int i;
		for(i=0; i<iInput; i++) {
			array[i] = scanner.nextInt();
		}
		for(i=0; i<iInput-1; i++) {
			if(array[i] > array[i+1] ){
				tmp = true;
				System.out.println("The list is not sorted ");
				break;
			}
			
		}
		if(!tmp) {
			System.out.println("The list is already sorted ");	
			}
	}
}
