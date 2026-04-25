package org.example;

public class Sprite extends Bebida{
    public Sprite(TipoProducto tipo){
        super(TipoProducto.SPRITE);
    }
    public String consumir() {
        return "sprite";
    }
}
