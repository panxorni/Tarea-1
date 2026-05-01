package org.example;
/*Main de prueba, se debe mostrar el funcionamiento de:
Crear un expendedor, monedas y comprador.
Probar todos los casos para comprador
Probar las excepciones
Ordenar lista de monedas utilizando comparable
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Expendedor exp= new Expendedor(3);
        Moneda m100=new Moneda100();
        Moneda m500=new Moneda500();
        Moneda m1000=new Moneda1000();
        Moneda m1500=new Moneda1500();
        Moneda mnull=null;

        System.out.println("Test 1: Compra exitosa");
        try{
            Comprador c_exitoso=new Comprador(m1000, TipoProducto.SPRITE, exp);
            System.out.println("Consumió "+c_exitoso.queConsumiste());
            System.out.println(("Vuelto: "+c_exitoso.cuantoVuelto()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nTest 2: Compra con vuelto");
        try{
            Comprador c_convuelto=new Comprador(m1500, TipoProducto.FANTA, exp);
            System.out.println("Consumió "+ c_convuelto.queConsumiste());
            System.out.println("Vuelto: "+c_convuelto.cuantoVuelto());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nTest 3: Pago insuficiente");
        try{
            Comprador c_pagoinsuficiente=new Comprador(m100, TipoProducto.SNICKERS, exp);
            System.out.println("Consumió "+ c_pagoinsuficiente.queConsumiste());
            System.out.println("Vuelto: "+ c_pagoinsuficiente.cuantoVuelto());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nTest 4: Moneda null");
        try{
            Comprador c_mnull=new Comprador(mnull, TipoProducto.SUPER8, exp);
            System.out.println("Consumió "+ c_mnull.queConsumiste());
            System.out.println(("Vuelto: "+ c_mnull.cuantoVuelto()));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("\nTest 5: Producto agotado");
        try{
            Comprador c_agotado=new Comprador(m1000, TipoProducto.COCACOLA, exp);
            c_agotado= new Comprador(m1000, TipoProducto.COCACOLA, exp);
            c_agotado= new Comprador(m1000, TipoProducto.COCACOLA, exp);
            c_agotado= new Comprador(m1000, TipoProducto.COCACOLA, exp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nOrdenamiento de monedas:");
        ArrayList<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda1500());
        monedas.add(new Moneda100());
        monedas.add(new Moneda1000());
        monedas.add(new Moneda500());
        System.out.println("\nMonedas desordenadas:");
        for (Moneda m : monedas){
            System.out.println(m.getValor());
        }
        Collections.sort(monedas);
        System.out.println("\nMonedas ordenadas:");
        for (Moneda m : monedas){
            System.out.println(m.getValor());
        }
    }
}