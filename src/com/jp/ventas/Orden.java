package com.jp.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 3;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        
        if (producto.getIdProducto() <=  MAX_PRODUCTOS) {
            this.productos[producto.getIdProducto()-1] = producto;
        }else{
            System.out.println("Cantidad de productos EXEDIDA"+ producto.getIdProducto());
        }
    }
    
    public void imprimirProductos(){
        System.out.println("Orden N° "+this.idOrden);
        for (int i = 1; i <= this.productos.length ; i++) {
            System.out.println("Prducto N°"+i+": "+this.productos[i-1].getNombreProducto());
            System.out.println("Precio de "+productos[i-1].getNombreProducto()+": "+this.productos[i-1].getPrecio());
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i <this.productos.length; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public static int getMAX_PRODUCTOS() {
        return MAX_PRODUCTOS;
    }
}
