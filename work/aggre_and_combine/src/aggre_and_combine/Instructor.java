package aggre_and_combine;

public class Instructor {
	private String Firstname;
	private String Secondname;
	private String Thirdname;
	
	public void set(String First, String Second, String End) {
		Firstname = First;
		Secondname = Second;
		Thirdname = End;
	}
	public String toString() {
		return "Firstname: " + Firstname + "\nSecondname: " + Secondname + "\nThirdname: " + Thirdname;
	}
	
	public String getFirstname() {
		return Firstname;
	}
	
	public String getSecondname() {
		return Secondname;
	}
	
	public String getThirdname() {
		return Thirdname;
	}
	
	public Instructor(String First, String Second, String End) {
		set(First,Second,End);
	}
}
