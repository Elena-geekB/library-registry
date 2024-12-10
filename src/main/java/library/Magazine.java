package library;

public class Magazine extends LibraryItem {
    private final String title;

    public Magazine(String inventoryNumber, String author, String title) {
        super(inventoryNumber, author);
        this.title = title;
    }

    @Override
    public String getDescription() {
        return "Magazine: " + title + " by " + getAuthor();
    }
}
