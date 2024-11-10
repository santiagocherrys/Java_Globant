package Ejercicio16;

import Ejercicio8.Producto8;

import java.util.ArrayList;

public class Inventario16 {
    private ArrayList<Producto8> productos;

    public Inventario16(){
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

    public Producto8 buscarPorNombre(String nombre){

        for(Producto8 producto8: this.productos){
            if(producto8.getNombre().equals(nombre)){
                return producto8;
            }
        }
        return null;
    }

    //Eliminar por nombre
    public void eliminarPorNombre(String nombre){

        for(Producto8 producto8: this.productos){
            if(producto8.getNombre().equals(nombre)){
                System.out.println("El producto a eliminar es: " + producto8);
                productos.remove(producto8);
                break;
            }
        }

    }

    public void eliminarPorCategoria(String nombre){
        for(Producto8 producto8: this.productos){
            if(producto8.getCategoria().equals(nombre)){
                System.out.println("producto eliminado " + producto8);
                this.productos.remove(producto8);
            }
        }
    }

    //Método vender producto y actualizar stock
    public void vender(String nombre, int cant){
        for(Producto8 producto8: this.productos){
            if(producto8.getNombre().equals(nombre)){
                if(cant <= producto8.getCantidad()){
                    System.out.println("Se ha vendido " + nombre + " con la cantidad " + cant);
                    int index = this.productos.indexOf(producto8);
                    producto8.setCantidad((producto8.getCantidad() - cant));
                    this.productos.set(index,producto8);
                }
            }
        }
    }
}
