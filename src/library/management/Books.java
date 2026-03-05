/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management;

import java.util.ArrayList;

/**
 *
 * @author shakiragutomo
 */
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
