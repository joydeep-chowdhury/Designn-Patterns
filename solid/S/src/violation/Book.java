package violation;

public class Book {
	private String authorName;
	private int noOfPages;

	public Book() {
	}

	public Book(String authorName, int noOfPages) {
		super();
		this.authorName = authorName;
		this.noOfPages = noOfPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "Book [authorName=" + authorName + ", noOfPages=" + noOfPages + "]";
	}

	public void save() {
		System.out.println("Saving book");
	}

	public void print() {
		System.out.println("Printing book");
	}
}
