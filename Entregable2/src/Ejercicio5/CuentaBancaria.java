package Ejercicio5;

import java.util.ArrayList;

public class CuentaBancaria {
    private Long numeroCuenta;
    private String titular;
    private float saldo;
    private ArrayList<String[]> historial;
    //String historial
    //historial = {"tipo_transacción", "monto"};

    public CuentaBancaria(Long numeroCuenta, String titular, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.historial = new ArrayList<>();
    }

    //Getter and Setters

    public Long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ArrayList<String[]> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<String[]> historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta=" + numeroCuenta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", historial=" + historial +
                '}';
    }

    public void depositar(float deposito){
        if(deposito < 0){
            System.out.println("No se puede depositar cantidades negativas");
        }else{
            this.saldo += deposito;
            System.out.println("Su saldo actual es: " + this.saldo);
            String[] history = {"deposito", String.valueOf(this.saldo)};
            this.historial.add(history);

        }
    }

    public void retirar(float retiro){
        if((this.saldo - retiro) < 0){
            System.out.println("El saldo no es suficiente");
        }else{
            this.saldo -= retiro;
            System.out.println("Su saldo actual es: " + this.saldo);
            String[] history = {"retiro", String.valueOf(this.saldo)};
            this.historial.add(history);
        }
    }

    public void showHistorial(){
        System.out.println("El historial de: " + this.titular + " con cuenta: " + this.numeroCuenta + " es:");
           for(String[] historia: this.historial){
               System.out.println("TIPO: " + historia[0] + " MONTO: " + historia[1]);
           }
    }
}
