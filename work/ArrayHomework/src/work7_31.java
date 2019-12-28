import java.util.Scanner;

public class work7_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int input;
		System.out.print("Enter list1: ");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		int[] list1 = new int[input];
		for(i=0;i<input;i++) {
			list1[i] = scanner.nextInt();
		}
		System.out.print("Enter list1: ");
		input = scanner.nextInt();
		int[] list2 = new int[input];
		for(i=0;i<input;i++) {
			list2[i] = scanner.nextInt();
		}
		System.out.print("The merged list ");
		int[] sum;
		sum = merge(list1,list2);
		for(i=0;i<sum.length;i++) {
			System.out.print(sum[i] + " ");
		}
		
	}
	public static int[] merge(int[] list1, int[] list2) {
		int i=0,j=0,k=0;
		int[] sum = new int[list1.length + list2.length];
		while(i<list1.length && j<list2.length) {
			if(list1[i] < list2[j]) {
				sum[k++] = list1[i++];
			}else {
				sum[k++] = list2[j++];
			}
		}
		if(i == list1.length) {
			for(i = j;i<list2.length;i++) {
				sum[k++] = list2[i];
			}
		}
		if(j == list2.length) {
			for(j = i;j<list1.length;j++) {
				sum[k++] = list1[j];
			}
		}
		return sum;
	}

}
