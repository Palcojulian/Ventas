package com.jp.ventas;



public class Producto {

    private int idProducto;
    private String nombreProducto;
    private double precio;
    private static int contadorProductos;

    public Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

//    public Producto(String nombre, double precio) {
//        this();
//        this.nombreProducto = nombre;
//        this.precio = precio;
//    }
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombreProducto=").append(nombreProducto);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

}
