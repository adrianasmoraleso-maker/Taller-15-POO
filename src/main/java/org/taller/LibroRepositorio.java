package org.taller;

// LibroRepositorio — solo persistencia
public class LibroRepositorio {
    public void guardar(Libro libro) {
        System.out.println("Guardando libro '" + libro.getTitulo() + "' en la base de datos");
    }
}