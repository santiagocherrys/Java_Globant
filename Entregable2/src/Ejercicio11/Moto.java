package Ejercicio11;

import Ejercicio3.Vehiculo;

public class Moto extends Vehiculo {
    private String tipoCasco;

    public Moto(String marca, String modelo, int velocidadMaxima, int velocidadActual, String tipoCasco) {
        super(marca, modelo, velocidadMaxima, velocidadActual);
        this.tipoCasco = tipoCasco;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }

    @Override
    public String toString() {
        return super.toString() + " Moto{" +
                "tipoCasco='" + tipoCasco + '\'' +
                '}';
    }
}
