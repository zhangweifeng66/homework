package aggre_and_combine;

public class TextBook {
	private String titl;
	private String author;
	private String book;
	
	public void set(String First, String Second, String End) {
		titl = First;
		author = Second;
		book = End;
	}
	public String toString() {
		return "titl: " + titl + "\nauthor: " + author + "\nbook: " + book;
	}
	
	public String getTitl() {
		return titl;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getBook() {
		return book;
	}
	
	public TextBook(String First, String Second, String End) {
		set(First,Second,End);
	}
}
