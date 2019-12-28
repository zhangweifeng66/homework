import java.util.Scanner;

public class work7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter ten numbers: ");
		Scanner scanner = new Scanner(System.in);
		int i,j;
		boolean Tmp = true;
		int input;
		int sum = 0;
		int[] number = new int[11];
		int[] output = new int[11];
		for(i = 0; i< 10;i++) {
			input = scanner.nextInt();
			number[i] = input;
		}
		
		output[0] = number[0];
		for(i = 1; i< 10;i++) {
			Tmp = true;
			for(j = 0;j < sum; j++) {
				if(output[j] == number[i] ) {
					Tmp = false;
					break;
				}
			}
			if(Tmp) {
				output[++sum] = number[i];
			}
		}
		System.out.println("The number of distinct number is " + (sum+1));
		System.out.print("The distinct numbers are ");
		for(j = 0;j <= sum; j++) {
			System.out.print(output[j] + " "); 
		}
	}

}
