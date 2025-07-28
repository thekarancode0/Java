package com.mybook.model;

public class Book {
    String title;
    String author;
    int id;
    double price;

   public Book(int id, String title, String author, double price){
        this.title = title;
        this.author = author;
        this.id = id;
        this.price = price;
       System.out.println("Book added successfully...");
    }
    public void display(){
        System.out.println("Id: " + id + " | Title: " + title + " | Author: " + author + " | price: " + price);
    }
}
