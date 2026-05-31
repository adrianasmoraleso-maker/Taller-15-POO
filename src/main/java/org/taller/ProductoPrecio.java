package org.taller;

// ProductoPrecio — cálculo de precios
public class ProductoPrecio {
    public double calcularPrecioConIva(Producto producto) {
        return producto.getPrecioBase() * 1.19;
    }
}