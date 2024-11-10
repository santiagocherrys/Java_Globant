package Ejercicio8;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto8> productos;

    public Inventario(){
        productos = new ArrayList<>();
    }

    public void mostrarInventario(){
        System.out.println("El inventario es:");
        for(Producto8 producto: this.productos){
            System.out.println("Producto: " + producto.getNombre() + " precio:" + producto.getPrecio() + " cantidad: " + producto.getCantidad() + " categoria:" + producto.getCategoria());
        }
    }

    public void mostrarInventarioFiltrado(ArrayList<Producto8> productos){
        if(productos.isEmpty()){
            System.out.println("No hay productos con esa categoria");
        }else{
            System.out.println("\nEl inventario filtrado es:");
            for(Producto8 producto: productos){
                System.out.println("Producto: " + producto.getNombre() + " precio:" + producto.getPrecio() + " cantidad: " + producto.getCantidad() + " categoria:" + producto.getCategoria());
            }
        }

    }

    public void agregarProducto(Producto8 producto){
        this.productos.add(producto);
    }

    public ArrayList<Producto8> buscarCategoria(String nombre){
        ArrayList<Producto8> producto8s = new ArrayList<>();
        for(Producto8 producto8: this.productos){
            if(producto8.getCategoria().equals(nombre)){
                producto8s.add(producto8);
            }
        }
        return producto8s;
    }
}
