
/*
 * {@code IU}{@link IU} 数据的初始化,学院只有四个,比赛项目也只有10,都不能增加,conDIffenrence来区分田赛径赛
 * @author 张伟峰
 */

public class IU {

	private String[] InsName = {"杭州国际服务工程学院","人文学院","法学院","医学院"};
	private String[] ComName = {"100米跑","1000米跑","跳远","跳高","三级跳","标枪","400米跑","200米跑","800米跑","铁饼"};
	private boolean[]    comDiffenrence = {true,true,false,false,false,false,true,true,true,false,true};

	private int NumCom = ComName.length;
	private int NumInst = InsName.length;
	private int NumAth = 25;
	
	private int Ath1 = 0;
	private int Ath2 = 0;
	private int Ath3 = 0;
	private int Ath4 = 0;
	
	public InstituationScore[] Instituations = new InstituationScore[NumInst];
	public Competition[] Competitions = new Competition[NumCom];
	
	public Athlete[] Instituation1 = new Athlete[25];
	public Athlete[] Instituation2 = new Athlete[25];
	public Athlete[] Instituation3 = new Athlete[25];
	public Athlete[] Instituation4 = new Athlete[25];	
	
	public IU () {	
		
		Instituations = InstituationName(Instituations);
		
		Instituation1 = AthleteIns1(Instituation1);
		Instituation2 = AthleteIns2(Instituation2);
		Instituation3 = AthleteIns3(Instituation3);
		Instituation4 = AthleteIns4(Instituation4);
		
		Competitions[0] = Competition1(Competitions[0]);
		Competitions[1] = Competition2(Competitions[1]);
		Competitions[2] = Competition3(Competitions[2]);
		Competitions[3] = Competition4(Competitions[3]);
		Competitions[4] = Competition5(Competitions[4]);
		Competitions[5] = Competition6(Competitions[5]);
		Competitions[6] = Competition7(Competitions[6]);
		Competitions[7] = Competition8(Competitions[7]);
		Competitions[8] = Competition9(Competitions[8]);
		Competitions[9] = Competition10(Competitions[9]);
		
		Instituations[0] = setInstituations(Instituations[0],Competitions);
		Instituations[1] = setInstituations(Instituations[1],Competitions);
		Instituations[2] = setInstituations(Instituations[2],Competitions);
		Instituations[3] = setInstituations(Instituations[3],Competitions);
		
	}
	
	
	public  InstituationScore[] InstituationName(InstituationScore[] Instituations) {

		for(int i=0;i<NumInst;i++) {
			Instituations[i] = new InstituationScore(InsName[i]);

		}
		InstituationScore.setTheNumberOfInstituation(NumInst);
		return Instituations;	
	}
	
	public  Athlete[] AthleteIns1(Athlete[] Athlete1) {
		Athlete1[0] = new Athlete(InsName[0], "张三","100米跑",11.23);
		Athlete1[1] = new Athlete(InsName[0], "李四","100米跑",11.68);
		Athlete1[2] = new Athlete(InsName[0], "王五","1000米跑",200);
		Athlete1[3] = new Athlete(InsName[0], "李明","1000米跑",210);
		Athlete1[4] = new Athlete(InsName[0], "小明","跳远",3.56);
		Athlete1[5] = new Athlete(InsName[0], "李亮","跳高",2.10);
		Athlete1[6] = new Athlete(InsName[0], "王景","三级跳",5.65);
		Athlete1[7] = new Athlete(InsName[0], "裴谦","标枪",26.56);
		Athlete1[8] = new Athlete(InsName[0], "龙傲天","400米跑",55);
		Athlete1[9] = new Athlete(InsName[0], "黄靖伦","200米跑",25.66);
		Athlete1[10] = new Athlete(InsName[0], "李静","800米跑",175);	
		Athlete1[0].setScore("跳高", 2.08);
		Athlete1[5].setScore("铁饼", 15.6);
		Ath1 = 11;
		Athlete1[11] = new Athlete();
		Athlete1[12] = new Athlete();
		Athlete1[13] = new Athlete();
		Athlete1[14] = new Athlete();
		Athlete1[15] = new Athlete();
		Athlete1[16] = new Athlete();
		Athlete1[17] = new Athlete();
		Athlete1[18] = new Athlete();
		Athlete1[19] = new Athlete();
		Athlete1[20] = new Athlete();
		Athlete1[21] = new Athlete();
		Athlete1[22] = new Athlete();
		Athlete1[23] = new Athlete();
		Athlete1[24] = new Athlete();
		return Athlete1;
	}
	
	public Athlete[] AthleteIns2(Athlete[] Athlete2) {
		Athlete2[0] = new Athlete(InsName[1], "江天","100米跑",12.33);
		Athlete2[1] = new Athlete(InsName[1], "江珊","100米跑",11.78);
		Athlete2[2] = new Athlete(InsName[1], "任性","1000米跑",211);
		Athlete2[3] = new Athlete(InsName[1], "冯淑芬","1000米跑",203);
		Athlete2[4] = new Athlete(InsName[1], "胡海华","跳远",3.54);
		Athlete2[5] = new Athlete(InsName[1], "华良家","跳高",2.15);
		Athlete2[6] = new Athlete(InsName[1], "田间加","三级跳",5.56);
		Athlete2[7] = new Athlete(InsName[1], "周泰","标枪",26.44);
		Athlete2[8] = new Athlete(InsName[1], "沈亮加","400米跑",61);
		Athlete2[9] = new Athlete(InsName[1], "单劳托","200米跑",27.35);
		Athlete2[10] = new Athlete(InsName[1], "毕书翰","800米跑",180);	
		Athlete2[8].setScore("跳高", 2.25);
		Athlete2[3].setScore("铁饼", 13.3);
		Athlete2[11] = new Athlete();
		Athlete2[12] = new Athlete();
		Athlete2[13] = new Athlete();
		Athlete2[14] = new Athlete();
		Athlete2[15] = new Athlete();
		Athlete2[16] = new Athlete();
		Athlete2[17] = new Athlete();
		Athlete2[18] = new Athlete();
		Athlete2[19] = new Athlete();
		Athlete2[20] = new Athlete();
		Athlete2[21] = new Athlete();
		Athlete2[22] = new Athlete();
		Athlete2[23] = new Athlete();
		Athlete2[24] = new Athlete();
		Ath2 = 11;
		return Athlete2;
	}
	
	public Athlete[] AthleteIns3(Athlete[] Athlete3) {
		Athlete3[0] = new Athlete(InsName[2], "李三","100米跑",11.20);
		Athlete3[1] = new Athlete(InsName[2], "张四","100米跑",13.02);
		Athlete3[2] = new Athlete(InsName[2], "李五","1000米跑",226);
		Athlete3[3] = new Athlete(InsName[2], "裴明","1000米跑",231);
		Athlete3[4] = new Athlete(InsName[2], "王明","跳远",3.68);
		Athlete3[5] = new Athlete(InsName[2], "小亮","跳高",1.98);
		Athlete3[6] = new Athlete(InsName[2], "李景","三级跳",6.35);
		Athlete3[7] = new Athlete(InsName[2], "李谦","标枪",23.63);
		Athlete3[8] = new Athlete(InsName[2], "黄傲天","400米跑",75);
		Athlete3[9] = new Athlete(InsName[2], "龙靖伦","200米跑",30.26);
		Athlete3[10] = new Athlete(InsName[2], "王静","800米跑",179);	
		Athlete3[1].setScore("跳高", 1.88);
		Athlete3[2].setScore("铁饼", 14.33);
		Ath3 = 11;
		Athlete3[11] = new Athlete();
		Athlete3[12] = new Athlete();
		Athlete3[13] = new Athlete();
		Athlete3[14] = new Athlete();
		Athlete3[15] = new Athlete();
		Athlete3[16] = new Athlete();
		Athlete3[17] = new Athlete();
		Athlete3[18] = new Athlete();
		Athlete3[19] = new Athlete();
		Athlete3[20] = new Athlete();
		Athlete3[21] = new Athlete();
		Athlete3[22] = new Athlete();
		Athlete3[23] = new Athlete();
		Athlete3[24] = new Athlete();
		return Athlete3;
	}
	
	public Athlete[] AthleteIns4(Athlete[] Athlete4) {
		Athlete4[0] = new Athlete(InsName[3], "陈建","100米跑",12.10);
		Athlete4[1] = new Athlete(InsName[3], "沈凌","100米跑",12.45);
		Athlete4[2] = new Athlete(InsName[3], "郝亮厝","1000米跑",240);
		Athlete4[3] = new Athlete(InsName[3], "盛实存","1000米跑",233);
		Athlete4[4] = new Athlete(InsName[3], "瑞审湖","跳远",3.84);
		Athlete4[5] = new Athlete(InsName[3], "姜昕魋","跳高",1.75);
		Athlete4[6] = new Athlete(InsName[3], "卞流瑞","三级跳",5.37);
		Athlete4[7] = new Athlete(InsName[3], "姚经与","标枪",27.31);
		Athlete4[8] = new Athlete(InsName[3], "牛零零","400米跑",83);
		Athlete4[9] = new Athlete(InsName[3], "吴离","200米跑",36.41);
		Athlete4[10] = new Athlete(InsName[3], "京东方","800米跑",190);	
		Athlete4[10].setScore("跳高", 1.96);
		Athlete4[4].setScore("铁饼", 10.24);
		Ath4 = 11;
		Athlete4[11] = new Athlete();
		Athlete4[12] = new Athlete();
		Athlete4[13] = new Athlete();
		Athlete4[14] = new Athlete();
		Athlete4[15] = new Athlete();
		Athlete4[16] = new Athlete();
		Athlete4[17] = new Athlete();
		Athlete4[18] = new Athlete();
		Athlete4[19] = new Athlete();
		Athlete4[20] = new Athlete();
		Athlete4[21] = new Athlete();
		Athlete4[22] = new Athlete();
		Athlete4[23] = new Athlete();
		Athlete4[24] = new Athlete();
		return Athlete4;
	}
	
	public Competition Competition1(Competition Competition) {
		Competition = new Competition(ComName[0]);
		Competition.addAthelete(InsName[0],"张三", 11.23,comDiffenrence[0]);
		Competition.addAthelete(InsName[2],"李三", 11.20,comDiffenrence[0]);
		Competition.addAthelete(InsName[1],"江天", 12.33,comDiffenrence[0]);
		Competition.addAthelete(InsName[3], "陈建", 12.10,comDiffenrence[0]);
		Competition.addAthelete(InsName[0],"李四", 11.68,comDiffenrence[0]);
		Competition.addAthelete(InsName[1],"江珊", 11.78,comDiffenrence[0]);
		Competition.addAthelete(InsName[3], "沈凌", 12.45,comDiffenrence[0]);
		Competition.addAthelete(InsName[2],"张四", 13.02,comDiffenrence[0]);
		return Competition;
	}
	
	public Competition Competition2(Competition Competition) {
		Competition = new Competition(ComName[1]);
		Competition.addAthelete(InsName[0],"王五",200,comDiffenrence[1]);
		Competition.addAthelete(InsName[0],"李明",210,comDiffenrence[1]);
		Competition.addAthelete(InsName[1],"任性",211,comDiffenrence[1]);
		Competition.addAthelete(InsName[1],"冯淑芬",203,comDiffenrence[1]);
		Competition.addAthelete(InsName[2],"李五",226,comDiffenrence[1]);
		Competition.addAthelete(InsName[2], "裴明",231,comDiffenrence[1]);
		Competition.addAthelete(InsName[3], "郝亮厝",240,comDiffenrence[1]);
		Competition.addAthelete(InsName[3], "盛实存",233,comDiffenrence[1]);
		return Competition;
	}
	
	public Competition Competition3(Competition Competition) {
		Competition = new Competition(ComName[2]);
		Competition.addAthelete(InsName[0],"小明",3.56,comDiffenrence[2]);
		Competition.addAthelete(InsName[1],"胡海华",3.54,comDiffenrence[2]);
		Competition.addAthelete(InsName[2],"王明",3.68,comDiffenrence[2]);
		Competition.addAthelete(InsName[3],"瑞审湖",3.84,comDiffenrence[2]);
		return Competition;
	}
	
	public Competition Competition4(Competition Competition) {
		Competition = new Competition(ComName[3]);
		Competition.addAthelete(InsName[0],"李亮",2.10,comDiffenrence[3]);
		Competition.addAthelete(InsName[1],"华良家",2.15,comDiffenrence[3]);
		Competition.addAthelete(InsName[3],  "姜昕魋",1.75,comDiffenrence[3]);
		Competition.addAthelete(InsName[2],"小亮",1.98,comDiffenrence[3]);
		Competition.addAthelete(InsName[0],"张三",2.08,comDiffenrence[3]);
		Competition.addAthelete(InsName[1], "沈亮加", 2.25,comDiffenrence[3]);
		Competition.addAthelete( InsName[2],"张四",1.88,comDiffenrence[3]);
		Competition.addAthelete(InsName[3], "京东方",1.96,comDiffenrence[3]);
		return Competition;
	}
	
	public Competition Competition5(Competition Competition) {
		Competition = new Competition(ComName[4]);
		Competition.addAthelete(InsName[0],"王景",5.65,comDiffenrence[4]);
		Competition.addAthelete(InsName[1],"田间加",5.56,comDiffenrence[4]);
		Competition.addAthelete(InsName[2],"李景",6.35,comDiffenrence[4]);
		Competition.addAthelete(InsName[3], "卞流瑞",5.37,comDiffenrence[4]);
		return Competition;
	}
	
	public Competition Competition6(Competition Competition) {
		Competition = new Competition(ComName[5]);
		Competition.addAthelete(InsName[0],"裴谦",26.56,comDiffenrence[5]);
		Competition.addAthelete(InsName[1],"周泰",26.44,comDiffenrence[5]);
		Competition.addAthelete(InsName[2],"李谦",23.63,comDiffenrence[5]);
		Competition.addAthelete(InsName[3], "姚经与",27.31,comDiffenrence[5]);
		return Competition;
	}
	
	public Competition Competition7(Competition Competition) {
		Competition = new Competition(ComName[6]);
		Competition.addAthelete(InsName[0],"龙傲天",55,comDiffenrence[6]);
		Competition.addAthelete(InsName[1], "沈亮加",61,comDiffenrence[6]);
		Competition.addAthelete(InsName[2],"黄傲天",75,comDiffenrence[6]);
		Competition.addAthelete(InsName[3], "牛零零",83,comDiffenrence[6]);
		return Competition;
	}
	
	public Competition Competition8(Competition Competition) {
		Competition  = new Competition(ComName[7]);
		Competition.addAthelete(InsName[0],"黄靖伦",25.66,comDiffenrence[7]);
		Competition.addAthelete(InsName[1],"单劳托",27.35,comDiffenrence[7]);
		Competition.addAthelete(InsName[2],"龙靖伦",30.26,comDiffenrence[7]);
		Competition.addAthelete(InsName[3], "吴离",36.41,comDiffenrence[7]);
		return Competition;
	}
	
	public Competition Competition9(Competition Competition) {
		Competition = new Competition(ComName[8]);
		Competition.addAthelete(InsName[0],"李静",175,comDiffenrence[8]);
		Competition.addAthelete(InsName[1],"毕书翰",180,comDiffenrence[8]);
		Competition.addAthelete(InsName[3], "京东方",190,comDiffenrence[8]);
		Competition.addAthelete(InsName[2],"王静",179,comDiffenrence[8]);
		return Competition;
	}
	
	public Competition Competition10(Competition Competition) {
		Competition = new Competition(ComName[9]);
		Competition.addAthelete(InsName[0],"李亮", 15.6,comDiffenrence[9]);
		Competition.addAthelete(InsName[1],"冯淑芬", 13.3,comDiffenrence[9]);
		Competition.addAthelete(InsName[2],"李五", 14.33,comDiffenrence[9]);
		Competition.addAthelete(InsName[3], "瑞审湖", 10.24,comDiffenrence[9]);
		return Competition;
	}
	
	public InstituationScore setInstituations(InstituationScore Instituations,Competition[] Competitions) {
		
		for(int i=0;i<NumCom;i++) {
			for(int j =0;j<Competitions[i].getNumberAthlete();j++) {
				if(Competitions[i].getAthleteOfInstituation(j) == Instituations.getInstituation()) {
					Instituations.addAthlete(Competitions[i].getAthlete(j),Competitions[i].getCompetition(), j+1);
				}
			}
			
		}
		return Instituations;
	}
	
	public boolean addComAndInst(InstituationScore[] Instituations, Competition[] Competitions,
			String Instituation,String Competition,String Athlete,double Ranking) {
		int i;
		int j;
		for(i=0;i<NumInst;i++) {
			if(InsName[i] == Instituation) {
				break;
			}
		}
		
		for(j =0;j<NumCom;j++) {
			if(ComName[j] == Competition) {
				break;
			}
		}
		if(Instituations[i].addAthlete(Athlete, Competition, Competitions[j].getRanking(Athlete)+1) == false) {
			System.out.println("对不起 每个学院每个项目最多只能有两个运动员参加!!!");
			return false;
		}
		else {
			String tmp = Competitions[j].addAthelete(InsName[i], Athlete, Ranking,comDiffenrence[j]);
			if(tmp != null) {
				for(int z=0;z<NumInst;z++) {
					Instituations[z].cutAthlete(tmp);
				}
				return true;
			}
			else {
				if(Competitions[j].getNumberAthlete()>=8) {
					Instituations[i].cutAthlete(Athlete);
					System.out.println("该运动员的成绩还不足进入前八!!");
					return false;
				}else {
					return true;
				}
			}
		}
			
		
	}
	
	public void addAthlete(Athlete[] Instituation1,Athlete[] Instituation2,Athlete[] Instituation3,Athlete[] Instituation4,
							String Instituation,String Competition,String Athlete,double Ranking) {
		int i;
		int j;
		for(i=0;i<NumInst;i++) {
			if(InsName[i] == Instituation) {
				break;
			}
		}
		switch(i){
			case 0:
				for(j = 0;j<Ath1;j++) {
					if(Instituation1[j].getAthlete() == Athlete) {
						 Instituation1[j].setScore(Competition, Ranking);
						 break;
					}
				}
				if(Ath1 == NumAth) {
					System.out.print("The number of instituations has been over!!");
					break;
				}
				else {
					Instituation1[++Ath1].setScore(Competition, Ranking);
				}
				
				
				break;
			case 1:
				for(j = 0;j<Ath2;j++) {
					if(Instituation2[j].getAthlete() == Athlete) {
						 Instituation2[j].setScore(Competition, Ranking);
						 break;
					}
				}
				if(Ath2 == NumAth) {
					System.out.print("The number of instituations has been over!!");
					break;
				}
				else {
					Instituation2[++Ath2].setScore(Competition, Ranking);
				}
				break;
			case 2:
				for(j = 0;j<NumAth;j++) {
					if(Instituation3[j].getAthlete() == Athlete) {
						 Instituation3[j].setScore(Competition, Ranking);
						 break;
					}
				}
				if(Ath3 == NumAth) {
					System.out.print("The number of instituations has been over!!");
					break;
				}
				else {
					Instituation3[++Ath3].setScore(Competition, Ranking);
				}
				break;
			case 3:
				for(j = 0;j<NumAth;j++) {
					if(Instituation4[j].getAthlete() == Athlete) {
						 Instituation4[j].setScore(Competition, Ranking);
						 break;
					}
				}
				if(Ath4 == NumAth) {
					System.out.print("The number of instituations has been over!!");
					break;
				}
				else {
					Instituation1[++Ath4].setScore(Competition, Ranking);
				}
				break;
		}
		
		
	}
	
	
	public boolean changeComAndInst(InstituationScore[] Instituations, Competition[] Competitions,
			String Instituation,String Competition,String Athlete,double Ranking) {
		int i;
		int j;
		for(i=0;i<NumInst;i++) {
			if(InsName[i].equals(Instituation)) {
				break;
			}
		}
		
		for(j =0;j<NumCom;j++) {
			if(ComName[j].equals(Competition)) {
				break;
			}
		}
		if(Competitions[j].changeScore(Athlete, Ranking,comDiffenrence[j]) == true) {
			Instituations[i].changeAthlete(Athlete, Competition, Competitions[j].getRanking(Athlete)+1);
			return true;
		}
		return false;
		
	}
	
	public boolean changeAthlete(Athlete[] Instituation1,Athlete[] Instituation2,Athlete[] Instituation3,Athlete[] Instituation4,
				String Instituation,String Competition,String Athlete,double Ranking) {
		int i;
		for(i=0;i<NumInst;i++) {
			if(InsName[i].equals(Instituation)) {
				break;
			}
		}
		switch(i){
		case 0:
			for(int j = 0;j<Ath1;j++) {
				if(Instituation1[j].getAthlete().equals(Athlete)) {
					Instituation1[j].changeScore(Competition, Ranking);
					return true;
				}
			}
			break;
		case 1:
			for(int j = 0;j<Ath2;j++) {
				if(Instituation2[j].getAthlete().equals(Athlete)) {
					Instituation2[j].changeScore(Competition, Ranking);
					return true;
				}
			}
			break;
		case 2:
			for(int j = 0;j<Ath3;j++) {
				if(Instituation3[j].getAthlete().equals(Athlete)) {
					Instituation3[j].changeScore(Competition, Ranking);
					return true;
				}	
			}
			break;
		case 3:
			for(int j = 0;j<Ath4;j++) {
				if(Instituation4[j].getAthlete().equals(Athlete)) {
					Instituation4[j].changeScore(Competition, Ranking);
					return true;
				}
			}
			break;
		}
		return false;
	}
	
	public String getInsName(int i) {
		if(i < NumInst) {
			return InsName[i];
		}
		else {
			System.out.println("已经超出了学院数目!");
			return null;
		}
	}
	
	public int getNumInst() {
		return NumInst;
	}
	
	public int getNumCom() {
		return NumCom;
	}
	
	public String getComName(int i) {
		if( i < NumCom) {
			return ComName[i];
		}
		else {
			System.out.println("已经超出了比赛数目!");
			return null;
		}
	}
	
	public int getAth1() {
		return Ath1;
	}
	
	public int getAth2() {
		return Ath2;
	}
	
	public int getAth3() {
		return Ath3;
	}
	
	public int getAth4() {
		return Ath4;
	}
	
	public boolean getComDiffenrence(int i) {
		return comDiffenrence[i];
	}
	
}
