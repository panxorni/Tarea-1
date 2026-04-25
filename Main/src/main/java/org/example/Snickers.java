package org.example;

public class Snickers extends Dulce{
    public Snickers(TipoProducto tipo){
        super(TipoProducto.SNICKERS);
    }
    public String consumir(){
        return "snickers";
    }
}
