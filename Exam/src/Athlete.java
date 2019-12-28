/*
 * @see Instituation
 * @link Instituation
 * <p>{@code Athlete} ���Եõ��˶������� һ���˶�Ա�����Բμ�������Ŀ,���μӵ���Ŀ����+�ɼ�
 * {@code Athlete}�ഴ��ʱҪ��������ѧԺ����������,���μӵ�һ����Ŀ�ͳɼ���ѡ����
 * 
 * <p> {@code setScore}{@link setScore} {@return boolean} �����˶�Ա�μӵ���Ŀ�ͳɼ�,�����һ������,�����õڶ���
 * һ���˶�Ա�����Բμ�������Ŀ,����е���������ͷ���false
 * <p> {@code changeAthlete} {@link changeAthlete} �ı��˶�Ա�ɼ�
 * <p> {@code getCompetitoin} {@link getCompetitoin} {@return String} ���ַ�����ʽ�õ��˶�Ա�μӵ���Ŀ�ͳɼ�,���ֻ��һ���˾ͷ���һ��,�������ͷ�������
 * 
 * 
 * @author ��ΰ��
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
