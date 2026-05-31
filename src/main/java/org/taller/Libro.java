package org.taller;

// Antes (viola SRP - todo en una clase):
// public class Libro { info + reporte + persistencia }

// Después (aplicando SRP):

// Libro — solo datos del libro
public class Libro {
    private String titulo;
    private String autor;
    private int año;

    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAño() { return año; }
}