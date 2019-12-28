
import java.util.Arrays;
import java.util.Scanner;
public class work7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the integers between 1 and 100: ");
		Scanner scanner = new Scanner(System.in);
		int[] number =  new int[100];
		int sum = 0;
		int i=0;
		int input;
		int count=1;
		
		input = scanner.nextInt();
		while(input != 0) {
			number[i++] = input;
			input = scanner.nextInt();
		}
		sum = i;
		int[] newNum = new int[sum];
	    System.arraycopy(number, 0, newNum, 0, sum);
		Arrays.sort(newNum);
		
		for(i=0;i<newNum.length;i++) {
			if(i != newNum.length-1 && newNum[i] == newNum[i+1]) {
				count+=1;
			}else {
				System.out.println(newNum[i] + " occurs " + count + " time");
				count = 1;
			}
		}
	}
	
	
	

}
