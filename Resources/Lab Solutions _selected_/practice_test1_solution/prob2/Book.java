package prob2;

public class Book extends LendingItem {
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	public Book(String isbn, String title, String authorFirstName, String authorLastName) {
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthorFirstName() {
		return authorFirstName;
	}
	public String getAuthorLastName() {
		return authorLastName;
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Book)) return false;
		Book book = (Book)ob;
		return book.authorFirstName.equals(authorFirstName) &&
				book.authorLastName.equals(authorLastName) &&
				book.title.equals(title)  &&
				book.isbn.equals(isbn);
	}
}
