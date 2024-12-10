package library;

public class Main {
    public static void main(String[] args) {
        LibraryRegistry registry = new LibraryRegistry();

        // Генерация объектов
        registry.addItem(new Book("INV001", "J.K. Rowling", "Harry Potter"));
        registry.addItem(new Magazine("INV002", "John Doe", "Tech Monthly"));

        // Поиск по автору
        System.out.println("Search by Author 'J.K. Rowling':");
        registry.searchByAuthor("J.K. Rowling").forEach(item ->
                System.out.println(item.getDescription()));

        // Поиск по инвентарному номеру
        System.out.println("\nSearch by Inventory Number 'INV001':");
        registry.searchByInventoryNumber("INV001").forEach(item ->
                System.out.println(item.getDescription()));
    }
}
