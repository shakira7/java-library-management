package library.management;

import java.util.ArrayList;

public class Books {
    
    private ArrayList<Book> bookList;
    
    public Books(){
        bookList = new ArrayList<>();
    }
    
    public void addBook(String title, String author, int qty) {
        
        Book newBook = new Book(title, author, qty);
        
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getTitle().equalsIgnoreCase(title)
                && bookList.get(i).getAuthor().equalsIgnoreCase(author)){
                    System.out.println("Book already exists! Adding quantity...");
                    bookList.get(i).addQty(qty);
                    return;
            }
        }
        
        bookList.add(newBook);
        System.out.println("Book successfully added!");
        
    }
    
    public int getSize(){
        return bookList.size();
    }
    
    public Book getBook(int index){
        return bookList.get(index);
    }
    
    public Book borrowBook(int index){
        if (bookList.get(index).getAvailability()){
            bookList.get(index).removeQty();
            return bookList.get(index);
        }
        else {
            return null;
        }
    }
    
    public void returnBook(int index){
        bookList.get(index).addQty();
    }
    
    public void displayBooks(){
        System.out.println("\n——— Displaying All Books");
        
        //check if list is not empty
        if (!(bookList.isEmpty())){
            
            for (int i = 0; i < bookList.size(); i++){
                System.out.println(bookList.get(i).getInfo());
            }
            
            return;
        }
        System.out.println("| No book in list. ");
    }
    
    
    
}
