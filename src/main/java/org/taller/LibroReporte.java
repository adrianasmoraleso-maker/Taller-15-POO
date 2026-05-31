package org.taller;

// LibroReporte — solo generación de reportes
public class LibroReporte {
    public void generarReporte(Libro libro) {
        System.out.println("\n=== Reporte del Libro ===\n");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año: " + libro.getAño());
    }
}