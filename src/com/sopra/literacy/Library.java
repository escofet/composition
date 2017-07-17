package com.sopra.literacy;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    // Constructors
    public Library() {
        books = new ArrayList<>();
    }
    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    // Getter/Setter
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    // Behaviour
    public void addBook(Book book) {
        books.add(book);
    }
    public Book getBook(int idx) {
        return idx < books.size() ? books.get(idx) : null;
    }
    // Get a book author if this title exist otherwise null
    public String getBookAuthor(String title) {
       for(Book book : books) {
           if(book.getTitle().equalsIgnoreCase(title)) {
               return book.getAuthor();
           }
       }
       return null;
    }
    @Override
    public String toString() {
        return "library = " + books;
    }
}