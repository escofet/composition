package com.sopra.literacy;

public class Composition {
    public static void main(String[] args) {
        Library myLib = new Library();
        myLib.addBook(new Book("Misericordia", "Benito Pérez Galdós", "12345"));
        myLib.addBook(new Book("La catedral", "Vicente Blasco Ibáñez", "67890"));
        // Listar libros de la biblioteca
        System.out.println(myLib);
    }
}