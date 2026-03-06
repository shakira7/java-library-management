package library.management;

public class LibraryManagement {

    public static void main(String[] args) {

        Students studentManager = new Students();
        Books bookManager = new Books();

        LibraryUI ui = new LibraryUI(studentManager, bookManager);

        ui.start();
    }
    
}
