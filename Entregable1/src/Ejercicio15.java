import java.util.Scanner;

public class Ejercicio15 {

        //Ejercicio 15
        static char[][] rooms = {{'O', 'O', 'O', 'O'},
                                {'O', 'O', 'O', 'O'},
                                {'O', 'O', 'O', 'O'},
                                {'O', 'O', 'O', 'O'}};

        public static void main(String[] args){
            //Ejercicio 6
            System.out.println("Este programa es para reservar habitación en un hotel");
            System.out.println("O -> habitación disponible");
            System.out.println("X -> habitación reservada");

            boolean ciclo = true;
            int cont = 0;
            Scanner scanner = new Scanner(System.in);
            while(ciclo){
                switch (menu()){
                    case "1":
                        //Reservar habitacion
                        String fila = "";
                        String columna = "";
                        showHabitaciones();
                        System.out.println("Escoja por favor el número de la fila");
                        fila = scanner.next();
                        System.out.println("Escoja por favor el número de la columna");
                        columna =scanner.next();
                        if(rooms[(Integer.parseInt(fila)-1)][(Integer.parseInt(columna)-1)] == 'X'){
                            System.out.println("Habitación ocupada");
                        }else{
                            System.out.println("Tu habitación fue reservada satisfactoriamente en la fila: " + fila + " y columna: " + columna);
                            rooms[(Integer.parseInt(fila)-1)][(Integer.parseInt(columna)-1)] = 'X';
                        }

                        break;
                    case "2":
                        //Salir del programa
                        ciclo = false;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
                showHabitaciones();
            }


        }

        public static String menu(){
            System.out.println("--------------------------------------");
            System.out.println("|                 MENU               |");
            System.out.println("|1. Reservar habitacion              |");
            System.out.println("|2. Salir                            |");
            System.out.println("--------------------------------------");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Entry option");
            return scanner.nextLine();
        }

        public static void showHabitaciones(){
            System.out.println("Estado de las habitaciones");
            System.out.println("     1   2   3   4");
            String cadena = "";
            String cadena2 = "";
            for(int i=0; i < 4; i++){
                cadena= " " + (i+1) + " ";
                cadena2 = "  ";
                for(int j=0; j < 4; j++){
                    cadena2 += rooms[i][j] + "   ";
                }
                System.out.println( cadena + cadena2);
            }
        }
}
