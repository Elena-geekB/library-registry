package library;

public abstract class LibraryItem {
    private final String inventoryNumber;
    private final String author;

    public LibraryItem(String inventoryNumber, String author) {
        this.inventoryNumber = inventoryNumber;
        this.author = author;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public String getAuthor() {
        return author;
    }

    public abstract String getDescription();
}
