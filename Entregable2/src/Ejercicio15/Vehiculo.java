package Ejercicio15;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int kilometraje;

    //Constructor

    public Vehiculo(String marca, String modelo, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }
}
