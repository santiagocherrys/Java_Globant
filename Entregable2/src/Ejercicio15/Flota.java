package Ejercicio15;

import java.util.ArrayList;

public class Flota {
    private ArrayList<Vehiculo> vehiculos;

    public Flota(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void hacermantenimiento(){
        System.out.println("El matenimiento se hace segun el kilometraje");

        for(Vehiculo vehiculo: this.vehiculos){
            System.out.println(vehiculo);
            if (vehiculo.getKilometraje() < 5000){
                mantenimiento0_5000();
            }else if(vehiculo.getKilometraje() >= 5000 && vehiculo.getKilometraje() < 10000){
                mantenimiento5000_10000();
            }else{
                mantenimiento10000ymas();
            }
            System.out.println("\n");
        }

    }

    public void mantenimiento0_5000(){
        System.out.print("Mantenimiento sencillo");
    }

    public void mantenimiento5000_10000(){
        System.out.print("mantenimiento intermedio");
    }

    public void mantenimiento10000ymas(){
        System.out.print("Mantenimiento exhaustivo");
    }
}
