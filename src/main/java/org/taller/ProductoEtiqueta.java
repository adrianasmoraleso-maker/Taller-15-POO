package org.taller;

// ProductoEtiqueta — generación de etiquetas
public class ProductoEtiqueta {
    public void imprimirEtiqueta(Producto producto) {
        System.out.println("[ETIQUETA] " + producto.getNombre());
    }
}