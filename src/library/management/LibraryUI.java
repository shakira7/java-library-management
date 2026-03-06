/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management;

import java.util.Scanner;

public class LibraryUI {
    
    private Students studentManager;
    private Books bookManager;
    private Scanner scanner = new Scanner(System.in);
    
    
    public LibraryUI(Students studentManager, Books bookManager) {
        this.studentManager = studentManager;
        this.bookManager = bookManager;
    }
    
    // Start code
    public void start(){
        
        boolean isRunning = true;
        
        while (isRunning){
            System.out.print(
                "\n——— LIBRARY MANAGEMENT ———\n" + 
                "1. Access Book List\n" +
                "2. Access Student List\n" +
                "0. Exit\n" +
                "Input choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    bookUI();
                    break;
                case 2: // TODO add studentUI
                    break;
                case 0:
                    System.out.println("— System: Shutting down!");
                    isRunning = false;
                    break;
                default: 
                    System.out.println("Warning! Invalid Option");
                    break;
            }
        }
    }
    
        
    // begin bookUI
    public void bookUI(){
        boolean isRunning = true;
        
        while (isRunning){
            System.out.print(
                "\n——— Accessing Book List ———\n" + 
                "1. Display all books\n" +
                "2. Add book\n" +
                "3. Edit book\n" +
                "4. Search book\n" +
                "0. Back\n" +
                "Input choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1: // display book
                    bookManager.displayBooks();
                    break;
                case 2: // add book
                    System.out.println("\n——— Adding Book");
                    System.out.print("Add title: ");
                    String title = scanner.nextLine();
                    
                    
                    System.out.print("Add author: ");
                    String author = scanner.nextLine();
                    
                    // TODO #1 add try & catch (InputMismatchException e)
                    System.out.print("Add Quantity: ");
                    int qty = scanner.nextInt();
                    scanner.nextLine();
                    
                    bookManager.addBook(title, author, qty);
                    break;
                case 3: // edit book...
                    System.out.println("\n——— Editing Book");
                    System.out.print("Input ID of Book: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    
                    for (int i = 0; i < bookManager.getSize(); i++){
                        if (bookManager.getBook(i).getID() == id){
                            boolean isEditing = true;
                            System.out.print("\n— Book Found");
                            
                            while (isEditing){
                                System.out.print("\n" + bookManager.getBook(i).getInfo() + "\n——— Editing Book\n1. Edit Title\n2. Edit Author\n3. Edit Quantity\n0. Stop editing\nInput choice: ");
                                
                                int subChoice = scanner.nextInt();
                                scanner.nextLine();

                                switch(subChoice){
                                    case 1: // change title 
                                        System.out.println("\n— Changing Title");
                                        System.out.print("Insert new title: ");
                                        String newTitle = scanner.nextLine();
                                        
                                        if (newTitle.equalsIgnoreCase(bookManager.getBook(i).getTitle())){
                                            System.out.println("— Change title to a different title!");
                                        }
                                        else{
                                            bookManager.getBook(i).setTitle(newTitle);
                                            System.out.println("— Title changed successfully.");
                                        }
                                        
                                        break;
                                    case 2: // change author
                                        System.out.println("\n— Changing Author");
                                        System.out.print("Insert new author: ");
                                        String newAuthor = scanner.nextLine();
                                        
                                        if (newAuthor.equalsIgnoreCase(bookManager.getBook(i).getAuthor())){
                                            System.out.println("— Change author to a different author!");
                                        }
                                        else{
                                            bookManager.getBook(i).setAuthor(newAuthor);
                                            System.out.println("— Author changed successfully.");
                                        }
                                        break;
                                    case 3: // change qty
                                        System.out.println("\n— Changing Quantity");
                                        System.out.print("Insert new quantity: ");
                                        
                                        // TODO #2 add try & catch (InputMismatchException e)

                                        int newQty = scanner.nextInt();
                                        scanner.nextLine();
                                        if (newQty == bookManager.getBook(i).getQty()){
                                            System.out.println("— Change quantity to a different quantity!");
                                        }
                                        
                                        else{
                                            bookManager.getBook(i).setQty(newQty);
                                            System.out.println("— Quantity changed successfully.");
                                        }
                                        break;
                                    case 0:
                                        isEditing = false;
                                        break;

                                }
                                break;
                            }
                            
                        }
                        else{
                            System.out.println("\n— Book not found");
                            break;
                        }
                    }
                    
                    
                            
                case 4:
                    // TODO search book
                    break;
                case 0:
                    isRunning = false;
                    break;
                default: 
                    System.out.println("Warning! Invalid Option");
                    break;
            }
        }
        
    }
    
    // Accessing Books
    
    // Accessing Students
    
    
    
}
