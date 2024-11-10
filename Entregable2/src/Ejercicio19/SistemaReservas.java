package Ejercicio19;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaReservas {
    private ArrayList<Reserva> reservas;

    public SistemaReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void reservar(String nombreVuelo){
        Scanner scanner = new Scanner(System.in);
        Reserva reserva = new Reserva();
        Pasajero pasajero = new Pasajero();
        System.out.println("Ingrese el nombre del pasajero");
        pasajero.setNombre(scanner.nextLine());
        System.out.println("Ingrese cedula del pasajero");
        pasajero.setCedula(scanner.nextLine());
        System.out.println("Ingrese telefono");
        pasajero.setTelefono(scanner.nextLine());

        reserva = buscarVuelo(nombreVuelo);
        int index = this.reservas.indexOf(reserva);
        if(reserva == null){
            System.out.println("Reserva null");
        }else{
            mostrarAsientos(reserva.getVuelo().getAsientos());
            System.out.println("escoja el numero del asiento");
            int asiento = scanner.nextInt();

            if(reserva.getVuelo().getAsientos()[(asiento-1)].equals("O")){
                reserva.getVuelo().getAsientos()[(asiento - 1)] = "X";
                pasajero.setAsiento(asiento);
                reserva.addPasajero(pasajero);
                System.out.println("la reserva es: " + reserva);

                //Chequear que sea en el mismo vuelo
                if(reserva.getVuelo().getNombreVuelo().equals(nombreVuelo)){
                    this.reservas.set(index,reserva);
                }else{
                    reservas.add(reserva);
                }


            }else{
                System.out.println("Asiento acupado");
            }
        }

    }

    public void cancelar(String nombreVuelo){
        Reserva reserva;
        Pasajero pasajero;
        reserva = buscarVuelo(nombreVuelo);
        Scanner scanner = new Scanner(System.in);
        int asiento = 0;
        if(reserva == null){
            System.out.println("No existe vuelo");
        }else{
            System.out.println("este es el vuelo con sus pasajeros " +  reserva);
            System.out.println("ingrese cédula");
            String cedula = scanner.nextLine();
            pasajero = buscarPasajero(reserva.getPasajeros(), cedula);
            if(pasajero == null){
                System.out.println("No existe pasajero");
            }else{
                boolean flag;
                flag = cancelarVuelo(pasajero.getAsiento(),reserva.getVuelo().getAsientos());
                if(flag){
                    System.out.println("Se elimina pasajero del vuelo " + pasajero);
                    Vuelo vuelo = reserva.getVuelo();
                    String[] asientos = vuelo.getAsientos();
                    asientos[(pasajero.getAsiento()-1)] = "O";
                    vuelo.setAsientos(asientos);
                    int index = this.reservas.indexOf(reserva);
                    reserva.setVuelo(vuelo);
                    //borrar el pasajero de la reserva
                    ArrayList<Pasajero> pasajeros = reserva.getPasajeros();
                    pasajeros.remove(pasajero);
                    reserva.setPasajeros(pasajeros);
                    this.reservas.set(index, reserva);

                    //this.reservas.remove(reserva);
                }
                System.out.println("asi quedan el vuelo " + reserva);
            }
        }
    }

    private Reserva buscarVuelo(String nombreVuelo){
        for(Reserva reserva: this.reservas ){
            if(reserva.getVuelo().getNombreVuelo().equals(nombreVuelo)){
                System.out.println("Encontré vuelo");
                return reserva;
            }
        }
        return null;
    }

    private Pasajero buscarPasajero(ArrayList<Pasajero> pasajeros, String cedula){
        for(Pasajero pasajero : pasajeros){
            if(pasajero.getCedula().equals(cedula)){
                return pasajero;
            }
        }
        return null;
    }

    private boolean cancelarVuelo(int asiento, String[] asientos){
        if(asientos[asiento].equals("X")){
            return true;
        }else{
            System.out.println("No está acupado el puesto, no se puede cancelar");
            return false;
        }
    }

    private void mostrarAsientos(String[] asientos){

        System.out.println("Estos son los asientos O-> disponible X-> ocupado");
        for(int i=0; i < asientos.length; i++){
            System.out.print((i+1) +"   ");
        }
        System.out.println("");
        for(int i=0; i < asientos.length; i++){
            System.out.print(asientos[i] +"   ");
        }
    }

    @Override
    public String toString() {
        return "SistemaReservas{" +
                "reservas=" + reservas +
                '}';
    }
}
