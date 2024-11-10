package Ejercicio20;

import java.util.ArrayList;

public class Banco {
    private ArrayList<CuentaBancaria> cuentaBancarias;

    public Banco(ArrayList<CuentaBancaria> cuentaBancarias) {
        this.cuentaBancarias = cuentaBancarias;
    }

    //setters and getters

    public ArrayList<CuentaBancaria> getCuentaBancarias() {
        return cuentaBancarias;
    }

    public void setCuentaBancarias(ArrayList<CuentaBancaria> cuentaBancarias) {
        this.cuentaBancarias = cuentaBancarias;
    }

    //toString

    @Override
    public String toString() {
        return "Banco{" +
                "cuentaBancarias=" + cuentaBancarias +
                '}';
    }
}
