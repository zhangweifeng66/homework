
/*
 * @see Instituation
 * @link Instituation
 * <p> {@code InstituationScore}������������,�ֱ��Ӧ��ѧԺ�е��˶�Ա,���ǲμӵı����ͳɼ�,�Լ�����������ָ���Ӧ�����е�λ��,
 * ����ָ��ָ������ʱ,����ָ���������һ����,ֻ�������������,�����ɼ�ֻ��¼ǰ��ǿ,��������,�ı��˶�Ա�ɼ�,���Է������ǵĳɼ�,
 * Ҳ�����ַ����ķ�����������+����+�ɼ�  ����ĳɼ������ڱ����е�����
 * 
 * <p> {@code InstituationScore}����{@code addAthlete}{@link addAthlete}�����˶�Ա,
 * {@code addAthlete}{@return boolean}��Ϊÿ��ѧԺֻ���������˶�Ա�μ�ͬһ����Ŀ,����{@code addAthlete}����ʧ��
 * 
 * <p>{@code setCompetition} {@link setCompettition} ��ֻ���������������{@code addAthlete}�γɻ���,���������������{@code addAthlete}Ч��һ��
 * <p> {@code changeAthlete} {@link changeAthlete} �ı��˶�Ա�ɼ�
 * ��{@code Competition.changeAthlete}{@link Competition.changeAthlete}���  ���Ը����˶�Ա�μӵı����ɼ�,���ܸ������ǲμӵı���
 * <p>{@code cutAthlete} {@link cutAthlete}����һ���˶�Ա
 * ��{@code Competition.addAthlete}{@link Competition.addAthlete}���  �����������µ�ѡ�ֳɼ����,ʹһ���˶�Ա��������ǿ,Ҫ����ȥ��
 * <p>{@code getInstituationScore}{@link getInstituationScore} {@return String}  ���ַ�����ʽ�ķ��������˶�Ա����+����+�ɼ�
 * ���������뷽ʽ,һ���Ա�������,һ��������ָ��ָ������Ҫ������
 * <p>{@code getInstituationScore} {@link getInstituationScore} {@return String} ���ַ�����ʽ��������ѧԺ�����˶�Ա������+����+�ɼ�
 * @author ��ΰ��
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
			System.out.println("ÿ��ѧԺֻ���������˶�Ա�μ�ͬһ����Ŀ\n"
					+ " ����������!!");
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
			System.out.println("�˶�Ա���������,û������˶�Ա");
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
