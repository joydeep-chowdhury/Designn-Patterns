package solution;

public class Book implements BookHandler {
	private String authorName;
	private int noOfPages;
	private BookPersistor persistor;
	private BookPrinter printer;

	public Book() {
	}

	public Book(String authorName, int noOfPages) {
		super();
		this.authorName = authorName;
		this.noOfPages = noOfPages;
		persistor=new BookPersistor();
		printer=new BookPrinter();
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

	@Override
	public void save() {
		persistor.save(this);

	}

	@Override
	public void print() {
		printer.save(this);

	}

}
