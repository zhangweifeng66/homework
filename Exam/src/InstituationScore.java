
/*
 * @see Instituation
 * @link Instituation
 * <p> {@code InstituationScore}中有三个数组,分别对应了学院中的运动员,他们参加的比赛和成绩,以及三个整数型指针对应数组中的位置,
 * 三个指针指向数组时,三个指针的数都是一个数,只是用三个更清楚,比赛成绩只记录前八强,可以增加,改变运动员成绩,可以返回他们的成绩,
 * 也可以字符串的返回他们名字+比赛+成绩  这里的成绩是他在比赛中的排名
 * 
 * <p> {@code InstituationScore}中有{@code addAthlete}{@link addAthlete}增加运动员,
 * {@code addAthlete}{@return boolean}因为每个学院只能有两个运动员参加同一个项目,可能{@code addAthlete}可能失败
 * 
 * <p>{@code setCompetition} {@link setCompettition} 和只有两个参数传入的{@code addAthlete}形成互补,和三个参数传入的{@code addAthlete}效果一样
 * <p> {@code changeAthlete} {@link changeAthlete} 改变运动员成绩
 * 与{@code Competition.changeAthlete}{@link Competition.changeAthlete}配合  可以更改运动员参加的比赛成绩,不能更改他们参加的比赛
 * <p>{@code cutAthlete} {@link cutAthlete}减少一名运动员
 * 与{@code Competition.addAthlete}{@link Competition.addAthlete}配合  比赛可能有新的选手成绩添加,使一名运动员被挤出八强,要将他去除
 * <p>{@code getInstituationScore}{@link getInstituationScore} {@return String}  以字符串形式的返回整体运动员名字+比赛+成绩
 * 有两种输入方式,一种以比赛名字,一种以整数指针指向你想要的数据
 * <p>{@code getInstituationScore} {@link getInstituationScore} {@return String} 以字符串形式返回整个学院所有运动员的名字+比赛+成绩
 * @author 张伟峰
 */

public class InstituationScore extends Instituation{
	
	private String[] AthleteName = new String[40];
	private int[] Ranking = new int[40];
	private String[] Competition = new String[40];
	
	private int NumberAthlete ;
	private int NumberCompetition ;
	private int NumberRanking ;
	
	public InstituationScore(String Instituation) {
		super(Instituation);
		this.NumberAthlete = 0;
		this.NumberCompetition = 0;
		this.NumberRanking = 0;
	}
	
	public InstituationScore() {
	}
	
	public boolean addAthlete(String Athlete, String Competition, int Ranking) {
		int sum = 0;
		this.AthleteName[NumberAthlete++] = Athlete;
		this.Competition[NumberCompetition++] = Competition;
		this.Ranking[NumberRanking++] = Ranking;
		for(int i = 0; i < NumberCompetition; i++) {
			if(this.Competition[i].equals( Competition)) {
				sum++;
			}
		}
		if(sum > 2) {
			
			this.NumberAthlete--;
			this.NumberCompetition--;
			this.NumberRanking--;
			return false;
		}
		return true;
	}

	public void addAthlete(String Athlete, int Ranking) {
		this.AthleteName[NumberAthlete++] = Athlete;
		this.Ranking[NumberRanking++] = Ranking;
	}
	
	public void setRanking(int Ranking) {
		this.Ranking[NumberRanking++] = Ranking;
	}
	
	public void setCompetition(String Competition) {
		int sum=0;
		this.Competition[NumberCompetition++] = Competition;
		for(int i = 0; i < NumberCompetition-1; i++) {
			if(this.Competition[i].equals(this.Competition[NumberCompetition-1])) {
				sum++;
			}
		}
		if(sum >= 2) {
			System.out.println("每个学院只能有两个运动员参加同一个项目\n"
					+ " 超过限制了!!");
			this.NumberAthlete--;
			this.NumberCompetition--;
			this.NumberRanking--;
		}
		
	}
	
	public void setAthlete(String Athlete) {
		this.AthleteName[NumberAthlete++] = Athlete;
	}
	
	public void changeAthlete(String Athlete, String Competition, int Ranking) {
		boolean state = true;
		for(int i=0; i<NumberAthlete; i++) {
			if(this.AthleteName[i].equals( Athlete) && this.Competition[i].equals(Competition)) {
				this.Ranking[i] = Ranking;
				state = false;
			}
		}
		if(state == true) {
			System.out.println("运动员名字输错了,没有这个运动员");
		}
	}
	
	public void cutAthlete(String Athlete) {
		for(int i=0;i<NumberAthlete;i++) {
			if(AthleteName[i] == Athlete) {
				AthleteName[i] = null;
				Competition[i] = null;
				Ranking[i] = 0;
			}
		}
	}
	
	public String getCompetitionScore(String Competition) {
		String str = "";
		str = getInstituation() +" ";
		for(int i=0; i < this.NumberCompetition; i++) {
			if( this.Competition[i].equals(Competition) ) {
				str += "Competition:\t" + this.Competition[i]+ " name:\t" 
						+ AthleteName[i] + " Ranking: " + String.valueOf(Ranking[i]);
			}
		}
		return str;
	}
	
	public String getCompetitionScore(int i) {
		if( AthleteName[i] == null) {
			return "The athlete has deleted!!";
		}
		else {
			return getInstituation()+"\t" + this.Competition[i] + "\t" + String.valueOf(this.Ranking[i]);
		}
	}
	
	public String getInstituationScore() {
		String str = "";
		str = getInstituation() + '\n';
		for(int i=0; i < this.NumberCompetition; i++) {
			str += "Competition:\t"+this.Competition[i] + "\t" +" name:\t" + AthleteName[i] +
					"\tprice:\t"+String.valueOf(this.Ranking[i]) + "\n";
		}
		return str;
	}
	
	public void sort() {
		int tmp;
		int tmp2;
		int[][] sort = new int[26][8];
		for(int i=0;i<26;i++) {
			for(int j=0;j<8;j++) {
				sort[i][j] =0;
			}
		}
		for( int i=0; i<this.NumberCompetition; i++) {
			tmp = (int)Competition[i].substring(0,1).charAt(0)+
					(int)(Competition[i].substring(1,2).charAt(0))+
					(int)(Competition[i].substring(2,3).charAt(0))+
					(int)(Competition[i].substring(3,4).charAt(0));
			
			tmp = tmp-164 < 0 ? 228-tmp:tmp-388;
			tmp = tmp/4;
			sort[tmp][this.Ranking[i]] = i;
			tmp =0;
		}
		tmp = 0;
		for( int i=0;i<26; i++) {
			for(int j=0; j<8; j++) {
				if( sort[i][j] != 0) {
					tmp2 = sort[i][j];
					System.out.println("Competition: " + Competition[tmp2]+ " name: " 
					+ AthleteName[tmp2] + " Ranking: " + Ranking[tmp2]);
				}
			}
		}
	}

	public String getInstituationAthlete() {
		String str = "";
		str = getInstituation() + '\n';
		for(int i=0; i < this.NumberCompetition; i++) {
			str += "name:\t" + AthleteName[i] +"\n";
		}
		return str;
	}
	
	public int getTheNumberofAthlete() {
		String[] Athlete = new String[20];
		int Number = 0;
		boolean state;
		for(int i=0; i < this.NumberAthlete; i++) {
			state = true;
			for(int j =0; j <= Number; j++) {
				if(Athlete[j] == AthleteName[i]) {
					state = false;
					break;
				}
			}
			if(state  == true) {
				Athlete[Number++] = this.AthleteName[i];
			}
		}
	
		return Number-1;
	}
	
}
