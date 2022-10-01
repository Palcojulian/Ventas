package com.jp.ventas;

import java.util.Scanner;

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 3;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public Producto pedirProducto(int i) {
        
        System.out.println("Orden " + this.idOrden + ", Maximo " + Orden.MAX_PRODUCTOS + " productos: ");
        Scanner input = new Scanner(System.in);
        Producto producto = new Producto();
        System.out.println("Producto "+(i+1)+": ");
        producto.setNombreProducto(input.nextLine());
        System.out.println("Precio: ");
        producto.setPrecio(input.nextDouble());
        return producto;
    }

    public void agregarProducto() {
        int contador = 0;
        while (contador < this.productos.length) {
            this.productos[contador] = pedirProducto(contador);
            contador++;
        }
    }

    public void imprimirProductos() {
        System.out.println("Orden N° " + this.idOrden);
        for (int i = 0; i < this.productos.length; i++) {
            System.out.println("Producto N°" + (i + 1) + ": " + this.productos[i].getNombreProducto());
            System.out.println("Precio de " + productos[i].getNombreProducto() + ": " + this.productos[i].getPrecio());
        }
        System.out.println("Precio por Productos: " + calcularTotal());
        System.out.println("-------------------------------------");
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.productos.length; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }
}
