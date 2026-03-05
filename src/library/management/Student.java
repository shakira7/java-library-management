package library.management;

public class Student { 
    
    private static int idCounter = 0; 
    
    private String name;
    private int studentID;
    private Book[] bookBorrowed;
    
    public Student (String name){
        this.name = name;
        this.studentID = idCounter++; 
        this.bookBorrowed = new Book[3];
    }
    
    // Getter
    
    public int getID(){
        return studentID;
    }
    
    public String getName(){
        return name;
    }
    
    public String getInfo(){
        return ("— Student Info" +
                "\n | Student ID: " + studentID +
                "\n | Name: " + name);
    }
    
    // Setter
    
    public void changeName(String name){
        if (this.name.equals(name)){
            System.out.println("Choose a different name!");
        }
        else {
            this.name = name;
        }
    }
    
    // Book
    
    public boolean canBorrowBook(){
        for (int i = 0; i < 3; i++){
            if (bookBorrowed[i] == null){
                return true;
            }
        }
        return false;
    }
    
    public void addBorrowedBook(Book b){ 
        if (b == null){ // check if book is available 
            System.out.println("——— WARNING! ———\n"
                    + "Book unavailable!\n");
            return;
        }
        
        // check slot
        for (int i = 0; i < 3; i++){
            if (bookBorrowed[i] == null){
                bookBorrowed[i] = b;
                System.out.println("Book added! " + (i+1) + "/3");
                return;
            }
        }
        
        System.out.println("——— WARNING! ———\n"
                    + "Too many books borrowed! Return at least one book!\n");
        
        
    }
    
    public void displayBorrowedBook(){
        System.out.println("——— Borrowed Book");
        
        for (int i = 0; i < 3; i++){
            if (bookBorrowed[i] != null){
                System.out.println((i+1) + ". " + bookBorrowed[i].getTitle() + " by " + bookBorrowed[i].getAuthor());
            }
            else {
                System.out.println((i+1) + ". Empty Slot");
            }
        }
    }
    
    // Other
    
    public void decrementCounter(){
        idCounter--;
    }
    
}
