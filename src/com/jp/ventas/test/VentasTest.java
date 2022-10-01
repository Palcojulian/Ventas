
package com.jp.ventas.test;

import com.jp.ventas.Orden;

public class VentasTest {
    public static void main(String[] args) {
        Orden ordenUno = new Orden();
        Orden ordenDos = new Orden();
        ordenUno.agregarProducto();
        ordenDos.agregarProducto();
        
        ordenUno.imprimirProductos();
        ordenDos.imprimirProductos();

       
    }

}
