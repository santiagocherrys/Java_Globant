package Ejercicio20;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentaBancaria {
    private String nombre;
    private String cedula;
    private String numCuenta;
    private float saldo;
    private ArrayList<Transferencias> historialTransferencias;


    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombre, String cedula, String numCuenta, float saldo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.historialTransferencias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public CuentaBancaria transferir(CuentaBancaria cuenta){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a transferir");
        float transf = scanner.nextFloat();
        if(transf > this.saldo){
            System.out.println("No tiene fondos suficientes para transferir");
        }else{
            this.saldo -= transf;
            cuenta.setSaldo((cuenta.getSaldo()+ transf));
            Transferencias transferencia = new Transferencias(this.numCuenta, cuenta.getNumCuenta(), transf);
            this.historialTransferencias.add(transferencia);
            return cuenta;
        }

        return null;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void showTransferencias(){
        if(this.historialTransferencias != null){
            System.out.println("Estas son las trasnferencias de la cuenta: " + this.numCuenta);
            for(Transferencias transferencia: this.historialTransferencias){
                System.out.println("Cuenta Origen: " + transferencia.getCuentaOrigen() + " cuenta destino: " + transferencia.getCuentaDestino() + " saldo transf: " + transferencia.getSaldoTransferido() + " fecha " + transferencia.getFecha());
            }
        }else{
            System.out.println("NO HAY HISTORIAL DE TRANSFERENCIAS");
        }
    }

}
