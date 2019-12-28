package aggre_and_combine;

public class example {
	private String Name;
	private TextBook textBook;
	private Instructor instructor;
	
	public String toString() {
		return "Name: " + Name + "\nTextBook: " + textBook + "\nInstructor: " + instructor; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example example1 = new example();
		TextBook textbook1 = new TextBook("sea","Ãû×Ö",".....");
		Instructor instructor1 = new Instructor("lll","hhh","ccc");
		
		example1.textBook = textbook1;
		example1.instructor = new Instructor("lll","hhh","ccc");
		System.out.println(example1);
		
		textbook1.set("seesea", "´ó¸ç", "...");
		instructor1.set("fff", "ddd", "sss");
		System.out.println(example1);
		
		example1.instructor.set("fff", "ddd", "sss");
		System.out.println(example1);
		
	}

}
