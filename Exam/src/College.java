
/*
 * <p>  ��¼��ѧУ������,���м���ѧԺ,������û��ʹ��,��Ϊ{@code College}��������������
 * û������ѧԺ�ĵĹ���,����ֻ����Ҫ���Ӿ���,�в��.
 * @author ��ΰ��
 */

public class College {
	private String CollegeName = "����ʦ����ѧ";
	private static int TheNumberOfInstituation;
	
	public College() {
	}
	
	public void setCollogeName(String name) {
		this.CollegeName = name;
	}
	
	public String getCollogeName() {
		return this.CollegeName;
	}
	
	public static void setTheNumberOfInstituation(int number) {
		TheNumberOfInstituation = number;
	}
	
	public static int getTheNumberOfInstituation() {
		return TheNumberOfInstituation;
	}
	
	public static void addTheNumberOfInstituation() {
		TheNumberOfInstituation++;
	}
}
