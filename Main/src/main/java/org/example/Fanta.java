package org.example;

public class Fanta extends Bebida{
    public Fanta (TipoProducto tipo){
        super(TipoProducto.FANTA);
    }
    public String consumir(){
        return "fanta";
    }
}