package library.management;

public class LibraryManagement {

    public static void main(String[] args) {
        
        Students manager = new Students();
        manager.addStudent("Test");
        
        System.out.println(manager.getStudent(0).getInfo());
        
        Books bookManager = new Books();
        bookManager.addBook("Book Title 1", "Jane Doe", 1);
        bookManager.addBook("Book Title 2", "John Doe", 1);
        bookManager.addBook("Book Title 3", "John Doe", 5);
        
        System.out.println(bookManager.getBook(1).getInfo());
        
        manager.getStudent(0).addBorrowedBook(bookManager.borrowBook(0));
        manager.getStudent(0).addBorrowedBook(bookManager.borrowBook(1));
        manager.getStudent(0).addBorrowedBook(bookManager.borrowBook(1));
        manager.getStudent(0).addBorrowedBook(bookManager.borrowBook(1));
        
        manager.getStudent(0).displayBorrowedBook();
        
        bookManager.displayBooks();
        
        
        
    }
    
}
