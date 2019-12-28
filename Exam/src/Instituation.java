/*
 * @see College
 * @link College
 * <p> {@code Instituation} 得到本学院名字
 *  @author 张伟峰
 */


public class Instituation extends College {
	
	private String Instituation;
	
	public Instituation() {
	}
	
	public Instituation(String name) {
		this.Instituation = name;
	}
	
	public String getInstituation() {
		return this.Instituation;
	}
	
	public void setInstituation(String Instituation) {
		this.Instituation = Instituation;
	}
}
