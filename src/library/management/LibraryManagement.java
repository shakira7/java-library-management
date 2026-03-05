package library.management;

public class LibraryManagement {

    public static void main(String[] args) {
        
        Students manager = new Students();
        manager.addStudent("Nabuu");
        
        System.out.println(manager.getStudent(0).getInfo());
        
        Books bookManager = new Books();
        bookManager.addBook("Poppy playtime", "Markiplier", 1);
        bookManager.addBook("Peepee", "Poopoo", 1);
        
        System.out.println(bookManager.getBook(1).getInfo());
        
        manager.getStudent(0).addBorrowedBook(bookManager.getBook(0));
        manager.getStudent(0).addBorrowedBook(bookManager.getBook(1));
        manager.getStudent(0).addBorrowedBook(bookManager.getBook(1));
        manager.getStudent(0).addBorrowedBook(bookManager.getBook(1));
        
        manager.getStudent(0).displayBorrowedBook();
        
        
        
    }
    
}
