package org.example;
import java.util.ArrayList;

public class Deposito<T> {
    private ArrayList<T> almacen;

    public Deposito() {
        almacen = new ArrayList<>();
    }

    public void addElemento(T elemento) {
        almacen.add(elemento);
    }

    public T getElemento() {
        if (almacen.isEmpty()) {
            return null;
        }

        return almacen.remove(0);
    }
}