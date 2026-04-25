package org.example;

public class CocaCola extends Bebida{
    public CocaCola (TipoProducto tipo){
        super (TipoProducto.COCACOLA);
    }
    public String consumir(){
        return "cocacola";
    }
}