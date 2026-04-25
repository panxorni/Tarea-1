package org.example;
abstract public class Producto {
    protected TipoProducto tipo;
    public Producto (TipoProducto tipo){
        this.tipo=tipo;
    }
    abstract public String consumir();
}