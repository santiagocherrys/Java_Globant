package Ejercicio17;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString(){
        return "Pedido{" +
                "productos=" + productos +
                '}';
    }

    public void showPedido(){
        float totalPrecio = 0;
        for(Producto producto: this.productos){
            totalPrecio += (producto.getPrecio()*producto.getCantidad());
            System.out.println("Producto: " + producto.getNombre() + " Cantidad: " + producto.getCantidad() + " precio: " + producto.getPrecio());
        }
        System.out.println("Con precio total: " + totalPrecio);
    }

    public void addPedido(Producto producto){
        this.productos.add(producto);
    }
}
