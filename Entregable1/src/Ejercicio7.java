import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

    static ArrayList<String[]> reservas = new ArrayList<>();

    public static void main(String[] args){
        //Ejercicio7
        boolean ciclo = true;
        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        while(ciclo) {
            switch (menu()) {
                case "1":
                    //Reservar mesa
                    String[] reserva ={"Persona que reserva", "Mesa","Fecha/Hora","Estado(confimado-cancelado)"};
                    System.out.println("Ingrese el nombre de la persona que reserva");
                    reserva[0]= scanner.nextLine();
                    System.out.println("Ingrese el número de la mesa");
                    reserva[1] = scanner.nextLine();
                    System.out.println("Ingrese fecha y la hora");
                    reserva[2] = scanner.nextLine();
                    System.out.println("Ingrese 1 para confirmar que asiste y 0 para cancelar reserva");
                    reserva[3] = scanner.nextLine();
                    reservas.add(reserva);
                    System.out.println("");

                    System.out.println("Los datos ingresados fueron");
                    System.out.println(reserva[0] + " MESA: " + reserva[1] + " en la FECHA: " + reserva[2] + " ESTADO RESERVACIÓN: " + reserva[3]);



                    break;
                case "2":
                    //Cancelar reserva
                    System.out.println("");
                    System.out.println("Se puede cancelar por mesa o nombre de la persona");
                    System.out.println("Ingrese 1 para cancelar por mesa o 2 por nombre");
                    String opcion = scanner.nextLine();
                    if(opcion.equals("1")){
                        //por mesa
                        System.out.println("ingrese el numero de la mesa");
                        String mesa = scanner.nextLine();
                        for(String[] reservaMesa : reservas){
                            if(reservaMesa[1].equals(mesa)){
                                int index = reservas.indexOf(reservaMesa);
                                reservaMesa[3] = "0";
                                reservas.set(index, reservaMesa);
                                System.out.println("La siguiente reservación se canceló");
                                System.out.println(reservaMesa[0] + " MESA: " + reservaMesa[1] + " FECHA: " + reservaMesa[2] + " ESTADO RESERVACIÓN: " + reservaMesa[3]);
                                break;
                            }
                        }
                    }else if(opcion.equals("2")){
                        //por nombre

                        System.out.println("Ingrese el nombre de la persona");
                        String nombre = scanner.nextLine();
                        for(String[] reservaNombre : reservas){
                            if(reservaNombre[0].equals(nombre)){
                                int index = reservas.indexOf(reservaNombre);
                                reservaNombre[3] = "0";
                                reservas.set(index, reservaNombre);
                                System.out.println("La siguiente reservación se canceló");
                                System.out.println(reservaNombre[0] + " MESA: " + reservaNombre[1] + " FECHA: " + reservaNombre[2] + " ESTADO RESERVACIÓN: " + reservaNombre[3]);
                                break;
                            }
                        }

                    }else{
                        System.out.println("opcion no valida");
                    }

                    break;
                case "3":
                    //Mostrar todo
                    System.out.println("Estas son las reservas");
                    showReservas();
                    break;
                case "4":
                    System.out.println("Se sale del programa ");
                    ciclo =  false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            showResrvasConfirmadas();
        }

    }

    public static String menu(){
        System.out.println("--------------------------------------");
        System.out.println("|                 MENU               |");
        System.out.println("|1. Reservar mesa                    |");
        System.out.println("|2. Cancelar reserva                 |");
        System.out.println("|3. Mostrar todo                     |");
        System.out.println("|4. Salir                            |");
        System.out.println("--------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry option");
        return scanner.nextLine();

    }

    public static void showReservas(){
        for (String[] reserva : reservas){
            System.out.println(reserva[0] + " MESA: " + reserva[1] + " FECHA: " + reserva[2] + " ESTADO RESERVACIÓN: " + reserva[3]);
        }
   }

   public static void showResrvasConfirmadas(){
       System.out.println("\n\nEstas son las reservas confirmadas");
       for (String[] reserva : reservas){
           if(reserva[3].equals("1")) {
               System.out.println(reserva[0] + " MESA: " + reserva[1] + " FECHA: " + reserva[2] + " ESTADO RESERVACIÓN: " + reserva[3]);
           }
       }
   }
}
