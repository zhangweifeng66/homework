import java.util.Scanner;

public class data {
	public IU data = new IU();
	
	Scanner input = new Scanner(System.in);
	
	public data() {
	}
	
	public void getInstituationScore(String Instituation) {
		for(int i=0;i < data.getNumInst();i++) {
			if(data.getInsName(i).equals(Instituation)) {
				System.out.println(data.Instituations[i].getInstituationScore());
			}
		}
	}
	
	public void getAthlete(String Instituation, String Athlete) {
		int i;
		for(i=0;i < data.getNumInst();i++) {
			if(data.getInsName(i).equals(Instituation)) {
				break;
			}
		}
				switch (i){
				case 0:
					for(int j = 0;j<data.getAth1();j++) {
						if(data.Instituation1[j].getAthlete().equals(Athlete)) {
							System.out.println(data.Instituation1[j].getCompetitoin());
							
						}
					}
					break;
				case 1:
					for(int j = 0;j<data.getAth2();j++) {
						if(data.Instituation2[j].getAthlete().equals(Athlete)) {
							System.out.println(data.Instituation2[j].getCompetitoin());
							break;
						}
					}
					break;
				case 2:
					for(int j = 0;j<data.getAth3();j++) {
						if(data.Instituation3[j].getAthlete().equals(Athlete)) {
							System.out.println(data.Instituation3[j].getCompetitoin());
							
						}	
					}
					break;
				case 3:
					for(int j = 0;j<data.getAth4();j++) {
						if(data.Instituation4[j].getAthlete().equals(Athlete)) {
							System.out.println(data.Instituation4[j].getCompetitoin());
							
						}
					}
					break;
				
				}
	}
		
	

	public void getCompetition(String Competition) {
		for(int i=0;i<data.getNumCom();i++) {
			if(data.getComName(i).equals(Competition)) {
				System.out.print(data.Competitions[i].getCompetitionScore(data.getComDiffenrence(i)));
			}
		}
		
	}
	
	public void getInstCom(String Instituation, String Competition) {
		int j;
		for(j=0;j<data.getNumCom();j++) {
			if(data.getComName(j).equals(Competition)) {
				break;
			}
		}
		System.out.println(data.Competitions[j].getCompetitionScore(Instituation, data.getComDiffenrence(j)));
	}
	
	public int Instituation() {
		System.out.println("��ѡ��ѧԺ:");
		System.out.println("1 -> " + data.getInsName(0));
		System.out.println("2 -> " + data.getInsName(1));
		System.out.println("3 -> " + data.getInsName(2));
		System.out.println("4 -> " + data.getInsName(3));
		System.out.println("5 -> ������һ��");
		switch (input.nextInt()) {
		case 1:
			System.out.println(data.getInsName(0));
			return 0;
			
		case 2:
			System.out.println(data.getInsName(1));
			return 1;
			
		case 3:
			System.out.println(data.getInsName(2));
			return 2;
			
		case 4:
			System.out.println(data.getInsName(3));
			return 3;
		case 5:
			return 100;
		default:
			System.out.println("��Ч��ѡ��,����������!!");
			return 100;	
		}
	}

	public int Competition() {
		System.out.println("��ѡ�������Ŀ:");
		System.out.println("1  -> " + data.getComName(0));
		System.out.println("2  -> " + data.getComName(1));
		System.out.println("3  -> " + data.getComName(2));
		System.out.println("4  -> " + data.getComName(3));
		System.out.println("5  -> " + data.getComName(4));
		System.out.println("6  -> " + data.getComName(5));
		System.out.println("7  -> " + data.getComName(6));
		System.out.println("8  -> " + data.getComName(7));
		System.out.println("9  -> " + data.getComName(8));
		System.out.println("10 -> " + data.getComName(9));
		System.out.println("11 -> ������һ��");
		switch (input.nextInt()) {
		case 1:
			System.out.println(data.getComName(0));
			return 0;
			
		case 2:
			System.out.println(data.getComName(1));
			return 1;
			
		case 3:
			System.out.println(data.getComName(2));
			return 2;
			
		case 4:
			System.out.println(data.getComName(3));
			return 3;
			
		case 5:
			System.out.println(data.getComName(4));
			return 4;
			
		case 6:
			System.out.println(data.getComName(5));
			return 5;
			
		case 7:
			System.out.println(data.getComName(6));
			return 6;
			
		case 8:
			System.out.println(data.getComName(7));
			return 7;
			
		case 9:
			System.out.println(data.getComName(8));
			return 8;
			
		case 10:
			System.out.println(data.getComName(9));
			return 9;
		case 11:
			return 100;
		default:
			System.out.println("��Ч��ѡ��,����������!!");
			Competition();
			return 100;	
		}
	}
	
	public void addAthlete() {
		int Instituation;
		int Competition;
		String Athlete;
		double Ranking;

		System.out.println("������������Ҫ���ӵ��˶�Ա��ѧԺ,������Ŀ,����,�����ɼ�");
		Instituation = Instituation();
		
		if(Instituation == 100) {
			Second();
			return;
		}
		Competition = Competition();
		if(Competition == 100) {
			Second();
			return;
		}
		
		if( Instituation == 100 || Competition == 100) {		
			return;
		}
		System.out.println("�������˶�Ա�������ͱ����ɼ�:  ");
		System.out.println("\n����:  ��������ʱ�뽫���㵽Ҫ����ĵط�");
 		System.out.println("�����ȴ���ո�������Ҫ���������");
		Athlete = input.next();
		Ranking = input.nextDouble();
		if(data.addComAndInst(data.Instituations, data.Competitions, 
				data.getInsName(Instituation), data.getComName(Competition), Athlete, Ranking)==true) {
			data.addAthlete(data.Instituation1, data.Instituation2, data.Instituation3, data.Instituation4,
					data.getInsName(Instituation), data.getComName(Competition), Athlete, Ranking);
		}
		
		return;
		
	}
	
	public void changeAthlete() {
		int Instituation;
		int Competition;
		String Athlete;
		double Ranking;

		System.out.println("������������Ҫ�ı���˶�Ա�����ɼ�");
		System.out.println("�������������ĵ�ѧԺ,������Ŀ,����,�����ɼ�");
		
		Instituation = Instituation();
		Competition = Competition();
		if(Instituation == 100) {
			Second();
			return;
		}
		if(Competition == 100) {
			Second();
			return;
		}
		
		System.out.println("�������˶�Ա�������ͱ����ɼ�:  ");
		System.out.println("����:  ��������ʱ�뽫���㵽Ҫ����ĵط�");
 		System.out.println("�����ȴ���ո�������Ҫ���������");
 		getInstCom(data.getInsName(Instituation), data.getComName(Competition));
		Athlete = input.next();
		Ranking = input.nextDouble();
		data.changeComAndInst(data.Instituations, data.Competitions,
				data.getInsName(Instituation), data.getComName(Competition), Athlete, Ranking);
		data.changeAthlete(data.Instituation1, data.Instituation2,data.Instituation3, data.Instituation4,
				data.getInsName(Instituation), data.getComName(Competition), Athlete, Ranking);
		return;
	}
	
	public void First(String user) {
		System.out.println("��ӭ�û�: " + user);
		System.out.println("----------------------------------------------------------------------------------------------------");
		Second();
	}
	
	public void Second() {
		int Instituation;
		int Competition;
		System.out.println("1 -> �õ�ѧԺ�ɼ�");
		System.out.println("2 -> �õ��˶�Ա�ĳɼ�");
		System.out.println("3 -> �õ��������гɼ�");
		System.out.println("4 -> �õ�����ѧԺ�ɼ�");
		System.out.println("5 -> �����˶�Ա");
		System.out.println("6 -> �޸��˶�Ա�ɼ�");
		System.out.println("7 -> ������һ��");
		switch(input.nextInt()) {
		case 1:
			Instituation = Instituation();
			if(Instituation == 100) {
				Second();
				return;
			}
			
			getInstituationScore(data.getInsName(Instituation));
//			Second();
			break;
		case 2:
			Instituation = Instituation();
			if(Instituation == 100) {
				Second();
				return;
			}
			System.out.println();
			System.out.println(data.Instituations[Instituation].getInstituationAthlete());
			System.out.println();
			System.out.println("�������˶�Ա����");
			System.out.println("����:  ��������ʱ�뽫���㵽Ҫ����ĵط�");
	 		System.out.println("�����ȴ���ո�������Ҫ���������");
			getAthlete(data.getInsName(Instituation),input.next());
//			Second();
			break;
		case 3:
			Competition = Competition();
			if(Competition == 100) {
				Second();
				return;
			}
			
			getCompetition(data.getComName(Competition));
//			Second();
			break;
		case 4:
			Instituation = Instituation();
			Competition = Competition();
			if(Instituation == 100) {
				Second();
				return;
			}
			if(Competition == 100) {
				Second();
				return;
			}
			
			getInstCom(data.getInsName(Instituation),data.getComName(Competition));
//			Second();
			break;
		case 5:
			addAthlete();
//			Second();
			break;
		case 6:
			changeAthlete();
//			Second();
			break;
		case 7:
//			Second();
			break;
		default:
			System.out.println("��Ч����");
//			Second();
			break;	
		}
		Second();
		return;
	}
	
	
}
