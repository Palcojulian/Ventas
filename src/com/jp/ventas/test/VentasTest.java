
package com.jp.ventas.test;

import com.jp.ventas.Orden;

public class VentasTest {
    public static void main(String[] args) {
        System.out.println("Ingrese su orden, max " + Orden.getMAX_PRODUCTOS() + " productos:");
        Orden ordenUno = new Orden();
        ordenUno.agregarProducto();
        ordenUno.imprimirProductos();
        
     
        
        
        
//        
    }

}
