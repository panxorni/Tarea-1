package org.example;

public class CocaCola extends Bebida{
    public CocaCola (){
        super (TipoProducto.COCACOLA);
    }
    public String consumir(){
        return "cocacola";
    }
}