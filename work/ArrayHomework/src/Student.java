
public class Student {
	private String name;
	private int exam;
	
	public Student(String name, int exam) {
		this.exam = exam;
		this.name = name;
	}
	
	public Student() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setExam(int exam) {
		this.exam = exam;
	}
	
	public String getName() {
		return name;
	}
	
	public int getExam() {
		return exam;
	}
}
