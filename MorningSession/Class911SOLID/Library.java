package scr.MorningSession.Class911SOLID;

import java.util.HashMap;
import java.util.Map;

// Consider a Library class that manages book inventory and handles user memberships.
// Split these responsibilities into separate classes: BookInventory and UserMembership.
public class Library {
    private BookInventory bookInventory;
    private UserMembership userMembership;

    public Library(){
        bookInventory = new BookInventory();
        userMembership = new UserMembership();
    }
    public void borrowBook(String userId, String bookTitle) {
        if (!userMembership.isUserMember(userId)) {
            System.out.println("User is not a member.");
            return;
        }

        if (bookInventory.checkBookAvailability(bookTitle) > 0) {
            bookInventory.removeBook(bookTitle);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }
    public void addBook(String title) {
        bookInventory.addBook(title);
    }
    public void removeBook(String title) {
        bookInventory.removeBook(title);
    }
}
class BookInventory{
private Map<String,Integer> inventory;

    public BookInventory() {
        this.inventory = new HashMap<>();
    }
    public void addBook(String title){
        inventory.put(title, inventory.getOrDefault(title,0)+1);
    }
    public void removeBook(String title){
        if(inventory.containsKey(title)&&inventory.get(title)>0){
            inventory.put(title, inventory.get(title)-1);
        }else{
            System.out.println("book is not available");
        }
    }public int checkBookAvailability(String title) {
        return inventory.getOrDefault(title, 0);
    }
}

class UserMembership{
    Map<String, String> users;

    public UserMembership(){
        this.users= new HashMap<>();
    }
    public void addUser(String userId, String details){
        users.put(userId,details);
    }
    public void removeUser(String userId){
        users.remove(userId);
    }
    public boolean isUserMember(String userId) {
        return users.containsKey(userId);
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Book1");
        library.removeBook("ente");

        UserMembership user = new UserMembership();
        user.addUser("3456","scool123");
        user.removeUser("345");
    }

}