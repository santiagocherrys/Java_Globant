package Ejercicio11;

import Ejercicio3.Vehiculo;

public class Auto extends Vehiculo {

    private int numPuertas;

    public Auto(String marca, String modelo, int velocidadMaxima, int velocidadActual, int numPuertas) {
        super(marca, modelo, velocidadMaxima, velocidadActual);
        this.numPuertas = numPuertas;
    }

    //Getters and setters

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca= " + this.getMarca() + " Modelo " + this.getModelo()+ " velocidad Máxima " + this.getVelocidadMaxima() + " #puertas" + this.getNumPuertas();
    }
}
