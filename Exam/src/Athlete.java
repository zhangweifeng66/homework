/*
 * @see Instituation
 * @link Instituation
 * <p>{@code Athlete} 可以得到运动的名字 一个运动员最多可以参加两个项目,他参加的项目名字+成绩
 * {@code Athlete}类创建时要传入他的学院和他的名字,他参加的一个项目和成绩可选传入
 * 
 * <p> {@code setScore}{@link setScore} {@return boolean} 设置运动员参加的项目和成绩,如果第一个有了,就设置第二个
 * 一个运动员最多可以参加两个项目,如果有第三个传入就返回false
 * <p> {@code changeAthlete} {@link changeAthlete} 改变运动员成绩
 * <p> {@code getCompetitoin} {@link getCompetitoin} {@return String} 以字符串形式得到运动员参加的项目和成绩,如果只有一个人就返回一个,有两个就返回两个
 * 
 * 
 * @author 张伟峰
 */





public class Athlete extends Instituation{
	
	private String name;
	
	private double ScoreFirst;
	private String CompetitionFirst;
	
	private double ScoreSecond;
	private String CompetitionSecond;
	
	public Athlete() {
		ScoreFirst = 0;
		ScoreSecond = 0;
	}
	
	public Athlete(String name, String Athlete, String Competition, double Score) {
		super(name);
		this.name = Athlete;
		this.CompetitionFirst = Competition;
		this.ScoreFirst = Score;
		this.CompetitionSecond = null;
		this.ScoreSecond = 0;
	}
	
	public Athlete(String name, String Athlete) {
		super(name);
		this.name = Athlete;
	}
	
	public boolean setScore(String Competition, double Score) {
		if(this.ScoreFirst == 0) {
			this.ScoreFirst = Score;
			this.CompetitionFirst = Competition;
			
			return true;
		}
		else if(this.ScoreSecond == 0){
			this.ScoreSecond = Score;
			this.CompetitionSecond = Competition;
			return true;
		}
		else {
			System.out.println("Everyperson only has two Competition!!");
			return false;
		}
	}
	
	public void changeScore(String Competition, double Score) {
		if(this.CompetitionFirst.equals(Competition)) {
			this.ScoreFirst = Score;
		}
		else if(this.CompetitionSecond.equals(Competition)) {
			this.ScoreSecond = Score;
		}
		else {
			setScore(Competition,Score);
		}
	}
	
	public String getAthlete() {
		return this.name;
	}
	
	public double getScoreFirst() {
		return this.ScoreFirst;	
	}
	
	public double getScoreSecond() {
		return this.ScoreSecond;
	}
	
	public String getCompetitionFirst() {
		return this.CompetitionFirst;
	}
	
	public String getCompetitionSecond() {
		return this.CompetitionSecond;
	}
	
	public String getCompetitoin() {
		String str ="";
		str += getAthlete() + "  :\n";
		str += getCompetitionFirst() + "\t" + getScoreFirst() + "\n";
		if(getScoreSecond()==0) {
			return str;
		}
		else {
			str += getCompetitionSecond() + "\t" + getScoreSecond() + "\n";
			return str;
		}
		
	}
	
}
