package Ejercicio20;

import java.util.Date;

public class Transferencias {
    private String cuentaOrigen;
    private String cuentaDestino;
    private float saldoTransferido;
    private Date fecha;



    public Transferencias(String cuentaOrigen, String cuentaDestino, float saldoTransferido) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.saldoTransferido = saldoTransferido;
        this.fecha = new Date();
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public float getSaldoTransferido() {
        return saldoTransferido;
    }

    public void setSaldoTransferido(float saldoTransferido) {
        this.saldoTransferido = saldoTransferido;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Transferencias{" +
                "cuentaOrigen='" + cuentaOrigen + '\'' +
                ", cuentaDestino='" + cuentaDestino + '\'' +
                ", saldoTransferido=" + saldoTransferido +
                ", fecha=" + fecha +
                '}';
    }
}
