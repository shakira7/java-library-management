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
        this.bookQty = qty;
        if (qty == 0){
            this.isAvailable = false;
        }
        else{
            this.isAvailable = true;
        }
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
    
    public boolean getAvailability(){
        return isAvailable;
    }
   
    
    public int getQty(){
        return bookQty;
    }
    
    public String getInfo(){
        return ("— Book Info\n" +
                " | Book ID: " + bookID +
                "\n | Title: " + title +
                "\n | Author: " + author +
                "\n | Availability: " + getAvailability() + 
                "\n | Quantity: " + bookQty + "\n");
    }
    
   // setter
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setAvailability(){
        if (bookQty > 0){
            isAvailable = true;
        }
        else {
            isAvailable = false;
        }
    }
    
    public void setQty(int qty){
        bookQty = qty;
        setAvailability();
    }
        
    public void addQty(){
        bookQty += 1;
        setAvailability();
    }
    
    public void addQty(int qty){
        bookQty += qty;
        setAvailability();
    }
    
    public void removeQty(){
        if (isAvailable){
            bookQty -= 1;
        }
        else {
            System.out.println("——— WARNING! ———\n"
                    + "Book is already unavailable!\n");
        }
        setAvailability();
    }
    
}
