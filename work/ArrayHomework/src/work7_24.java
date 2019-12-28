
public class work7_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] color = new boolean[4];
		int[] Num = new int[4];
		int i;
		
		String[] kk = {"ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] kkl ={"Spades","Clubs","Hearts","Diamonds"};
		int[] num = new int[53];
		for(i =0;i<53;i++) {
			num[i] = 0;
		}
		int sum=0;
		int Tmp;
		for( i=0;i<4;i++) {
			color[i] = false;
		}
		i = 0;
		while(sum!=4) {
			
			Tmp = (int) (Math.random()*52);
			
			if(num[Tmp] == 0) {
				i++;
				num[Tmp] = 1;
			}else {
				continue;
			}
			if(color[Tmp/13] == false) {
				color[Tmp/13] = true;
				sum++;
				System.out.println(kk[Tmp%13] + " of " + kkl[Tmp/13]);
			}
			
		}
		System.out.println("Number of picks " + i);
	}

}
