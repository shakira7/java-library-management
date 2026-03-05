package library.management;

public class Book {
    
    private static int idCounter = 0; 
    
    private String title;
    private String author;
    private int bookID; 
    private boolean isAvailable;
    private int bookQty;
    
    public Book(String title, String author, int qty){
        this.title = title;
        this.author = author;
        this.bookID = idCounter++;
        this.isAvailable = true;
        this.bookQty = qty;
    }
    
    // Getter
    
    public int getID(){
        return bookID;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getAvailability(){
        if (isAvailable){
            return "Available";
        }
        else {
            return "Not Available";
        }
    }
    
    public int getQty(){
        return bookQty;
    }
    
    public String getInfo(){
        return ("— Book Info\n" +
                " | Book ID: " + bookID +
                "\n | Title: " + title +
                "\n | Author: " + author +
                "\n | Availability: " + getAvailability() + "\n");
    }
    
   // setter
    
    
    
}
