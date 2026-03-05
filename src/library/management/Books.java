package library.management;

import java.util.ArrayList;

public class Books {
    
    private ArrayList<Book> bookList;
    
    public Books(){
        bookList = new ArrayList<>();
    }
    
    public void addBook(String title, String author, int qty) {
        Book newBook = new Book(title, author, qty);
        bookList.add(newBook);
        
    }
    
    public Book getBook(int index){
        return bookList.get(index);
    }
    
    
    
}
