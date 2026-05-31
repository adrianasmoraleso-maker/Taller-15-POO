package org.taller;

public class PruebaLibro {
    public static void main(String[] args) {
        Libro libro = new Libro("Clean Code", "Robert C. Martin", 2008);
        new LibroReporte().generarReporte(libro);
        new LibroRepositorio().guardar(libro);
    }
}