
package com.jp.ventas.test;

import com.jp.ventas.Orden;
import java.util.Scanner;
import com.jp.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        System.out.println("Ingrese su orden, max " + Orden.getMAX_PRODUCTOS() + " productos:");
        Producto producto = new Producto("Arroz", 200);
        Producto producto2 = new Producto("Carne", 100);
        Producto producto3 = new Producto("Aceite", 150);        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.imprimirProductos();
        System.out.println("Total: "+orden1.calcularTotal());
//        
        
//        System.out.println(producto);
//        System.out.println(producto2);
//        System.out.println(producto3);
        
        Orden orden2 = new Orden();
        
        for (int i = 0; i < Orden.getMAX_PRODUCTOS(); i++) {
            orden2.agregarProducto(pedirProducto());
        }
        orden2.imprimirProductos();
        System.out.println("Total:Arr "+ orden2.calcularTotal());
    }
    
    public static Producto pedirProducto(){
        Scanner input = new Scanner(System.in);
        Producto producto = new Producto("", 0);
        System.out.println("Producto: ");
        producto.setNombreProducto(input.nextLine());
        System.out.println("Precio: ");
        producto.setPrecio(input.nextDouble());
        return  producto;
    }
    
}
