package org.taller;

public class PruebaProducto {
    public static void main(String[] args) {

        System.out.println("\n============Producto============\n");

        Producto p = new Producto("Laptop", 2000.0);
        new ProductoEtiqueta().imprimirEtiqueta(p);
        double precioFinal = new ProductoPrecio().calcularPrecioConIva(p);
        System.out.println("Precio con IVA: " + precioFinal);
    }
}