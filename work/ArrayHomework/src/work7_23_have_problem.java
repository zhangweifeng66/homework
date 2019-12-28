
public class work7_23_have_problem {

	private int total = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		boolean[] statement= new boolean[100];
		for(i=0;i<100;i++) {
			statement[i] = false;
		}
		for(i=1;i<=100;i++) {
			state(statement,i);
		}
		for(i=0;i<100;i++) {
			if(statement[i] == true) {
				System.out.print(i +" ");
			}
//			if(i % 10 == 9) {
//				System.out.println();
//			}
		}
	}
	static void state(boolean[] Case, int num) {
		int i;
		for(i=num-1;i < 100; i = i + num) {
			if(Case[i] == false) {
				Case[i] = true;
			}else {
				Case[i] = false;
			}
		}
	}
}
