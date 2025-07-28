package com.mybook.model;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    static ArrayList<Book> books = new ArrayList<>();
    static int idCounter = 1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do{
            System.out.println("\n____________________________");
            System.out.println("\nBook Management System Menu: ");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Remove Book by Id");
            System.out.println("5. Exit");
            System.out.print("Enter you choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("\n______________________________");

            switch (choice){
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    removeBook();
                    break;
                case 5:
                    System.out.println("Exiting... Thanks for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }while (choice != 5);
    }

    static void addBook(){
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Book Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Book price: ");
        double price = sc.nextInt();

        Book newBook = new Book(idCounter++,title,author,price);
        books.add(newBook);
    }

    static void viewBook(){
        if(books.isEmpty()){
            System.out.println("No books in the system.");
        }else{
            for(Book book : books){
                book.display();
            }
        }
    }

    static void searchBook(){
        System.out.print("Enter title to search: ");
        String title = sc.nextLine();
        boolean found = false;

        for(Book book : books){
            if(book.title.equalsIgnoreCase(title)){
                book.display();
                found = true;
            }
        }

        if(!found){
            System.out.println("Book not found.");
        }
    }

    static void removeBook(){
        System.out.print("Enter book ID to remove: ");
        int id = sc.nextInt();
        boolean removed = books.removeIf(book -> book.id == id);

        if(removed){
            System.out.println("Book removed successfully");
        }else{
            System.out.println("Book with given Id not found.");
        }
    }
}
