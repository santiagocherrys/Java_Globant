package Ejercicio1;

public class Producto
{
    private String nombre;
    private float precio;
    private int cantidadEnStock;

    public Producto(String nombre, float precio, int cantidadEnStock){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    //setters and getters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public void setCantidadEnStock(int cantidadEnStock){
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre(){
        return this.nombre;
    }

    public float getPrecio(){
        return this.precio;
    }

    public int getCantidadEnStock(){
        return this.cantidadEnStock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadEnStock=" + cantidadEnStock +
                '}';
    }

    //métodos personalizados
    //Aumentar Stock
    public void aumentarStock(int cant){
        if(cant >= 0){
            this.cantidadEnStock += cant;
        }else{
            System.out.println("No se permiten cantidades negativas");
        }
    }

    //Disminuir Stock

    public void disminuirStock(int cant){
        if(cant >=0){
            if(this.cantidadEnStock - cant >=0){
                this.cantidadEnStock -= cant;
            }
        }else{
            System.out.println("No se permiten cantidades negativas");
        }
    }

}