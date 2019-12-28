/*
 * <p> {@code Competition} ���Եõ���������,Ҳ���Եõ��μӸñ������˶�Ա����,������ѧԺ,�����ĳɼ�
 *  ��ָ���˶�Ա���ֺͳɼ���������ָ��,������ָ���Ӧ�����е�λ��,����ָ��ָ������ʱ,����ָ���������һ����,ֻ�������������. 
 *  {@code Competition}��Ĵ�����ʽֻ�ܴ������������
 *  �����ɼ�ֻ��¼ǰ��ǿ,��������,�ı��˶�Ա�ɼ�,���Է������ǵĳɼ�,
 *  Ҳ�����ַ����ķ�����������+ѧԺ+�ɼ�      ����ĳɼ���ʵ�ʳɼ�
 *  
 *  <p> {@code sort} [@link sort} �Գɼ���������,��С����
 *  <p> {@code changeAthlete} {@link changeAthlete} {@return boolean} �����˶�Ա�����ɼ�, �����Ƿ�ɹ�,��Ϊ�����˶�Ա����������� 
 *  {@code changeAthlete}������� Boolean size ��Ϊ�ɼ���Ϊ��������,������Ҫ�Ӵ�С����,����size ���������,��(100-�����ɼ�)��������
 *  <p> {@code addAthlete} {@link addAthlete} {return boolean}��Ϊ����ֻȡǰ��,�����������˶�Ա�ĳɼ�����������ǰ��,�����޷�����,����false
 *  {@code addAthlete}������� Boolean size ��Ϊ�ɼ���Ϊ��������,������Ҫ�Ӵ�С����,����size ���������,��(100-�����ɼ�)��������
 *  <p> {@code getCompetitionScore} {@link getCompetitionScore} {@return String} ���� �������˶�ԱѧԺ,����,�ɼ�
 *   {@code getCompetitionScore}������� Boolean size ��Ϊ�ɼ���Ϊ��������,������Ҫ�Ӵ�С����,����size ���������,��(100-�����ɼ�)��������
 *   һ������һ������String Instituation}���ش������ѧԺ�� �˶�ԱѧԺ,����,�ɼ�
 *   һ������һ������  int i  ָ��ָ���Ӧ���˶�Ա
 *   ��һ����ֱ�ӽ������˶�Ա����;
 * 
 * @author ��ΰ��
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
				System.out.println("�˶�Ա���������,û������˶�Ա");
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
				System.out.println("�˶�Ա���������,û������˶�Ա");
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
				if(this.Instituation[i].equals("���ݹ��ʷ��񹤳�ѧԺ")) {
					str += this.Instituation[i] + "\t" + this.AthleteName[i] + "\t" + String.format("%.3f",(100-this.Ranking[i])) +"��"+ "\n";
				}else {
					str += this.Instituation[i] + "\t\t\t" + this.AthleteName[i] + "\t" + String.format("%.3f",(100-this.Ranking[i])) +"��"+ "\n";
				}
			}else {
				if(this.Instituation[i].equals("���ݹ��ʷ��񹤳�ѧԺ")) {
					str += this.Instituation[i] + "\t" + this.AthleteName[i] + "\t" + String.valueOf(this.Ranking[i]) +"��"+ "\n";
				}else {
					str += this.Instituation[i] + "\t\t\t" + this.AthleteName[i] + "\t" + String.valueOf(this.Ranking[i]) +"��"+ "\n";
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
							String.format("%.3f",(100-this.Ranking[i])) + "��"+"\tprize: "+(i+1)+"\n";
				}
				else {
					str += this.Instituation[i] + "\t" + this.AthleteName[i] + "\t" +  
							String.valueOf(this.Ranking[i]) + "��"+"\tprize: "+(i+1)+"\n";
				}
			}
		}
		return str;
	}
	
	public String getCompetitionScore(int i,boolean size) {
		if( i< 7) {
			if(size == false) {
				return this.Instituation + " " + this.AthleteName[i] + " " +  
						String.format("%.3f",(100-this.Ranking[i])) + "��"+"\n";
			}
			else {
				return  this.Instituation + " " +this.AthleteName[i] + " " +  
						String.valueOf(this.Ranking[i]) +"��"+ "\n";
			}	
		}
		else {
			return null;
		}
	}
}
