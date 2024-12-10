package library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryRegistry {
    private final List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public List<LibraryItem> searchByAuthor(String author) {
        return items.stream()
                .filter(item -> item.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public List<LibraryItem> searchByInventoryNumber(String inventoryNumber) {
        return items.stream()
                .filter(item -> item.getInventoryNumber().equals(inventoryNumber))
                .collect(Collectors.toList());
    }
}
