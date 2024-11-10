package Ejercicio19;

import java.util.ArrayList;

public class Reserva {
    private Vuelo vuelo;
    private ArrayList<Pasajero> pasajeros;

    public Reserva() {
    }

    public Reserva(Vuelo vuelo) {
        this.vuelo = vuelo;
        this.pasajeros = new ArrayList<>();
    }

    //getters and setters

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    //add pasajero
    public void addPasajero(Pasajero pasajero){
        this.pasajeros.add(pasajero);
    }

    //to_String();

    @Override
    public String toString() {
        return "Reserva{" +
                "vuelo=" + vuelo +
                ", pasajeros=" + pasajeros +
                '}';
    }
}
