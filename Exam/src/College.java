
/*
 * <p>  记录了学校的名字,和有几个学院,但基本没有使用,因为{@code College}和他的派生类中
 * 没有增加学院的的功能,个人只是想要更加具体,有层次.
 * @author 张伟峰
 */

public class College {
	private String CollegeName = "杭州师范大学";
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
