package library;

public class Book extends LibraryItem {
    private final String title;

    public Book(String inventoryNumber, String author, String title) {
        super(inventoryNumber, author);
        this.title = title;
    }

    @Override
    public String getDescription() {
        return "Book: " + title + " by " + getAuthor();
    }
}
