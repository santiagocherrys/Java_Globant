package Ejercicio19;

import java.sql.Time;
import java.util.Arrays;
import java.util.Date;

public class Vuelo {
    private String nombreVuelo;
    private String origen;
    private String destino;
    private Date fecha;
    private Time hora;
    private String[] asientos;

    public Vuelo(String nombreVuelo, String origen, String destino, Date fecha, Time hora) {
        this.nombreVuelo = nombreVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        //this.asientos = new String[]{"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"};
        this.asientos = new String[]{"O", "O", "O", "O", "O"};
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo = nombreVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String[] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[] asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "nombreVuelo='" + nombreVuelo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", asientos=" + Arrays.toString(asientos) +
                '}';
    }
}
