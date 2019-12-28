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
		System.out.println("请选择学院:");
		System.out.println("1 -> " + data.getInsName(0));
		System.out.println("2 -> " + data.getInsName(1));
		System.out.println("3 -> " + data.getInsName(2));
		System.out.println("4 -> " + data.getInsName(3));
		System.out.println("5 -> 返回上一级");
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
			System.out.println("无效的选择,请重新输入!!");
			return 100;	
		}
	}

	public int Competition() {
		System.out.println("请选择比赛项目:");
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
		System.out.println("11 -> 返回上一级");
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
			System.out.println("无效的选择,请重新输入!!");
			Competition();
			return 100;	
		}
	}
	
	public void addAthlete() {
		int Instituation;
		int Competition;
		String Athlete;
		double Ranking;

		System.out.println("请依次输入想要增加的运动员的学院,比赛项目,姓名,比赛成绩");
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
		System.out.println("请输入运动员的姓名和比赛成绩:  ");
		System.out.println("\n提醒:  输入中文时请将光标点到要输入的地方");
 		System.out.println("或者先打个空格再输入要输入的中文");
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

		System.out.println("请依次输入想要改变的运动员比赛成绩");
		System.out.println("请依次输入他的的学院,比赛项目,姓名,比赛成绩");
		
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
		
		System.out.println("请输入运动员的姓名和比赛成绩:  ");
		System.out.println("提醒:  输入中文时请将光标点到要输入的地方");
 		System.out.println("或者先打个空格再输入要输入的中文");
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
		System.out.println("欢迎用户: " + user);
		System.out.println("----------------------------------------------------------------------------------------------------");
		Second();
	}
	
	public void Second() {
		int Instituation;
		int Competition;
		System.out.println("1 -> 得到学院成绩");
		System.out.println("2 -> 得到运动员的成绩");
		System.out.println("3 -> 得到比赛所有成绩");
		System.out.println("4 -> 得到比赛学院成绩");
		System.out.println("5 -> 增加运动员");
		System.out.println("6 -> 修改运动员成绩");
		System.out.println("7 -> 返回上一级");
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
			System.out.println("请输入运动员姓名");
			System.out.println("提醒:  输入中文时请将光标点到要输入的地方");
	 		System.out.println("或者先打个空格再输入要输入的中文");
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
			System.out.println("无效命令");
//			Second();
			break;	
		}
		Second();
		return;
	}
	
	
}
