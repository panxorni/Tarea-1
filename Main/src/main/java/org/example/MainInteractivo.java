package org.example;

import java.util.Scanner;

public class MainInteractivo {
    public static void main(String[] args) {
        Scanner escaner= new Scanner(System.in);
        Expendedor exp=new Expendedor(3);

        boolean corriendo=true;
        while(corriendo){
            System.out.println("\n||>=====================<||");
            System.out.println("||  Maquina expendedora  ||");
            System.out.println("||>=====================<||");
            System.out.println("|| 1. CocaCola     $1000 ||");
            System.out.println("|| 2. Fanta        $1000 ||");
            System.out.println("|| 3. Sprite       $1000 ||");
            System.out.println("|| 4. Super8        $300 ||");
            System.out.println("|| 5. Snickers      $400 ||");
            System.out.println("|| 0. Salir              ||");
            System.out.println("||>=====================<||");
            System.out.println("\nSeleccione el producto");
            int eleccion= escaner.nextInt();

            if(eleccion==0){
                corriendo=false;
                break;
            }

            TipoProducto tipo;
            switch (eleccion){
                case 1:
                    tipo= TipoProducto.COCACOLA;
                    break;
                case 2:
                    tipo= TipoProducto.FANTA;
                    break;
                case 3:
                    tipo= TipoProducto.SPRITE;
                    break;
                case 4:
                    tipo= TipoProducto.SUPER8;
                    break;
                case 5:
                    tipo= TipoProducto.SNICKERS;
                    break;
                default:
                    System.out.println("Producto invalido");
            }

            System.out.println("Ingrese el pago, solo se aceptan monedas de 100, 500, 1000 y 1500");
            int valor= escaner.nextInt();

            Moneda m;
            switch (valor){
                case 100:
                    m=new Moneda100();
                    break;
                case 500:
                    m=new Moneda500();
                    break;
                case 1000:
                    m=new Moneda1000();
                    break;
                case 1500:
                    m=new Moneda1500();
                    break;
                default:
                    System.out.println("Metodo de pago invalido");
            }
        }
    }
}
