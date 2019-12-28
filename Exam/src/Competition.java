/*
 * <p> {@code Competition} 可以得到比赛名字,也可以得到参加该比赛的运动员名字,和他的学院,和他的成绩
 *  和指向运动员名字和成绩的整数型指针,整数型指针对应数组中的位置,两个指针指向数组时,两个指针的数都是一个数,只是用两个更清楚. 
 *  {@code Competition}类的创建方式只能传入比赛的名字
 *  比赛成绩只记录前八强,可以增加,改变运动员成绩,可以返回他们的成绩,
 *  也可以字符串的返回他们名字+学院+成绩      这里的成绩是实际成绩
 *  
 *  <p> {@code sort} [@link sort} 对成绩进行排序,从小到大
 *  <p> {@code changeAthlete} {@link changeAthlete} {@return boolean} 更改运动员比赛成绩, 返回是否成功,因为可能运动员名字输入出错 
 *  {@code changeAthlete}传入参数 Boolean size 因为成绩分为田赛径赛,田赛需要从大到小排序,传入size 如果是田赛,就(100-田赛成绩)进行排序
 *  <p> {@code addAthlete} {@link addAthlete} {return boolean}因为比赛只取前八,可能新增的运动员的成绩还不够进入前八,所以无法加入,返回false
 *  {@code addAthlete}传入参数 Boolean size 因为成绩分为田赛径赛,田赛需要从大到小排序,传入size 如果是田赛,就(100-田赛成绩)进行排序
 *  <p> {@code getCompetitionScore} {@link getCompetitionScore} {@return String} 返回 比赛的运动员学院,名字,成绩
 *   {@code getCompetitionScore}传入参数 Boolean size 因为成绩分为田赛径赛,田赛需要从大到小排序,传入size 如果是田赛,就(100-田赛成绩)进行排序
 *   一个还有一个参数String Instituation}返回传入这个学院的 运动员学院,名字,成绩
 *   一个还有一个参数  int i  指针指向对应的运动员
 *   另一个就直接将所有运动员返回;
 * 
 * @author 张伟峰
 */




public class Competition {
	
	private String Competition;
	private String[] Instituation = new String[8];
	private double[] Ranking = new double[8];
	private String[] AthleteName = new String[8];
	
	private int NumberAthlete ;
	private int NumberRanking ;
	
	public Competition() {
	}
	
	public Competition(String Competition) {
		this.Competition = Competition;
		this.NumberAthlete = 0;
		this.NumberRanking = 0;
	}
		
	public String getCompetition() {
		return this.Competition;
	}
	
	public int getNumberAthlete() {
		return this.NumberAthlete;
	}
	
	public int getNumberRanking() {
		return this.NumberRanking;
	}
	
	public int getRanking(String Athlete) {
		for(int i=0;i<NumberAthlete;i++) {
			if(AthleteName[i].equals(Athlete)) {
				return i;
			}
		}
		return 100;
	}
	
	public String getAthleteOfInstituation(int i) {
		return Instituation[i];
	}
	
	public String getAthlete(int i) {
		return AthleteName[i];
	}
	
	public void sort() {
		String Stmp;
		double Dtmp;
		String STMP;
		
		if(this.NumberRanking < 8) {
			for(int i=0; i < this.NumberRanking-1; i++) {
				if(this.Ranking[this.NumberRanking-1] < this.Ranking[i]) {
					Stmp = this.AthleteName[this.NumberAthlete-1];
					Dtmp = this.Ranking[this.NumberRanking-1];
					STMP = this.Instituation[this.NumberAthlete-1];
					
					for(int j = this.NumberRanking-1; j>i; j--) {
						this.AthleteName[j] = this.AthleteName[j-1];
						this.Ranking[j] = this.Ranking[j-1];
						this.Instituation[j] = this.Instituation[j-1];
					}
					this.AthleteName[i] = Stmp;
					this.Ranking[i] = Dtmp; 
					this.Instituation[i] = STMP;
					break;
				}
			}
		}
		else {
			for(int i=0; i<7; i++) {
				if(this.Ranking[7] < this.Ranking[i]) {
					Stmp = this.AthleteName[7];
					Dtmp = this.Ranking[7];
					STMP = this.Instituation[7];
					for(int j = 7; j>i; j--) {
						this.AthleteName[j] = this.AthleteName[j-1];
						this.Ranking[j] = this.Ranking[j-1];
						this.Instituation[j] = this.Instituation[j-1];
					}
					this.AthleteName[i] = Stmp;
					this.Ranking[i] = Dtmp; 
					this.Instituation[i] = STMP;
					break;
				}
					
			}
		}
	}
	
	public boolean changeScore(String Athlete, double Ranking,boolean size) {
		
		if(size == false) {
			Ranking = 100 - Ranking;
		}
		
		String Stmp;
		String STMP;
		double Dtmp;
		boolean state;
		if(this.NumberAthlete <= 8) {
			state = true;
			for(int i=0; i < this.NumberAthlete; i++) {
				if(this.AthleteName[i].equals(Athlete)) {
					this.Ranking[i] = Ranking;
					
					state = false;
					Stmp = this.AthleteName[i];
					Dtmp = this.Ranking[i];
					STMP = this.Instituation[i];
					while(Ranking > this.Ranking[i+1]) {
						this.Ranking[i] = this.Ranking[i+1];
						this.AthleteName[i] = this.AthleteName[i+1];
						this.Instituation[i] = this.Instituation[i+1];
						i++;
						if(i == this.NumberAthlete-1) {
							break;
						}
					}
					while(Ranking < this.Ranking[i-1]) {
						this.Ranking[i] = this.Ranking[i-1];
						this.AthleteName[i] = this.AthleteName[i-1];
						this.Instituation[i] = this.Instituation[i-1];
						i--;
						if(i == 0) {
							break;
						}
					}
					this.Ranking[i] = Dtmp;
					this.AthleteName[i] = Stmp;	
					this.Instituation[i] = STMP;
					break;
				}	
			}
			if(state == true) {
				System.out.println("运动员名字输错了,没有这个运动员");
				return false;
			}
			return true;
		}
		else {
			state = true;
			for(int i=0; i < 8; i++) {
				if(this.AthleteName[i].equals(Athlete)) {
					state = false;
					Stmp = this.AthleteName[i];
					Dtmp = this.Ranking[i];
					STMP = this.Instituation[i];
					while(Ranking > this.Ranking[i+1]) {
						this.Ranking[i] = this.Ranking[i+1];
						this.AthleteName[i] = this.AthleteName[i+1];
						this.Instituation[i] = this.Instituation[i+1];
						i++;
						if(i == 7) {
							break;
						}
					}
					while(Ranking < this.Ranking[i-1]) {
						this.Ranking[i] = this.Ranking[i-1];
						this.AthleteName[i] = this.AthleteName[i-1];
						this.Instituation[i] = this.Instituation[i-1];
						i--;
						if(i == 0) {
							break;
						}
					}
					this.Ranking[i] = Dtmp;
					this.AthleteName[i] = Stmp;	
					this.Instituation[i] = STMP;
					break;
				}	
			}
			if(state == true) {
				System.out.println("运动员名字输错了,没有这个运动员");
				return false;
			}
			return true;
		}
	}
	
	public String addAthelete(String Instituation,String Athlete, double Ranking,boolean size) {
		if(size == false) {
			Ranking = 100 - Ranking;
		}
		if(this.NumberAthlete < 8) {
			this.Ranking[this.NumberRanking++] = Ranking;
			this.Instituation[this.NumberAthlete] = Instituation;
			this.AthleteName[this.NumberAthlete++] = Athlete;
			sort();
			return null;
		}
		else {
			if(this.Ranking[7] > Ranking) {
				String tmp = this.AthleteName[7];
				this.Ranking[7] = Ranking;
				this.AthleteName[7] = Athlete;
				this.Instituation[7] = Instituation;
				sort();
				return tmp;
			}
			else {
				return null;
			}
		}
		
	}
	
	public String getCompetitionScore(boolean size) {
		
		String str = "";
		str = getCompetition()+ ":\n";
		for(int i=0; i < this.NumberAthlete; i++) {
			if(i > 7) {
				break;
			}
			if(size == false) {
				if(this.Instituation[i].equals("杭州国际服务工程学院")) {
					str += this.Instituation[i] + "\t" + this.AthleteName[i] + "\t" + String.format("%.3f",(100-this.Ranking[i])) +"米"+ "\n";
				}else {
					str += this.Instituation[i] + "\t\t\t" + this.AthleteName[i] + "\t" + String.format("%.3f",(100-this.Ranking[i])) +"米"+ "\n";
				}
			}else {
				if(this.Instituation[i].equals("杭州国际服务工程学院")) {
					str += this.Instituation[i] + "\t" + this.AthleteName[i] + "\t" + String.valueOf(this.Ranking[i]) +"秒"+ "\n";
				}else {
					str += this.Instituation[i] + "\t\t\t" + this.AthleteName[i] + "\t" + String.valueOf(this.Ranking[i]) +"秒"+ "\n";
				}
			}
			
		}
		return str;
	}
	
	public String getCompetitionScore(String Instituation,boolean Size) {
		String str = "";
		for(int i=0;i<this.NumberAthlete;i++) {
			if(i>7) {
				break;
			}
			if(this.Instituation[i].equals(Instituation) == true) {
				if(Size == false) {
					str += this.Instituation[i] + "\t" + this.AthleteName[i] + "\t" +  
							String.format("%.3f",(100-this.Ranking[i])) + "米"+"\tprize: "+(i+1)+"\n";
				}
				else {
					str += this.Instituation[i] + "\t" + this.AthleteName[i] + "\t" +  
							String.valueOf(this.Ranking[i]) + "秒"+"\tprize: "+(i+1)+"\n";
				}
			}
		}
		return str;
	}
	
	public String getCompetitionScore(int i,boolean size) {
		if( i< 7) {
			if(size == false) {
				return this.Instituation + " " + this.AthleteName[i] + " " +  
						String.format("%.3f",(100-this.Ranking[i])) + "米"+"\n";
			}
			else {
				return  this.Instituation + " " +this.AthleteName[i] + " " +  
						String.valueOf(this.Ranking[i]) +"秒"+ "\n";
			}	
		}
		else {
			return null;
		}
	}
}
