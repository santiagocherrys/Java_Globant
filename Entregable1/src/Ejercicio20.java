import java.util.Scanner;

public class Ejercicio20 {
    static char[][] sits = {{'O', 'O', 'O', 'O', 'O', 'O'},
                            {'O', 'O', 'O', 'O', 'O', 'O'},
                            {'O', 'O', 'O', 'O', 'O', 'O'},
                            {'O', 'O', 'O', 'O', 'O', 'O'},
                            {'O', 'O', 'O', 'O', 'O', 'O'},
                            {'O', 'O', 'O', 'O', 'O', 'O'}};

    public static void main(String[] args){
        //Ejercicio 20
        System.out.println("Este programa es para reservar asientos en un avion");
        System.out.println("O -> silla disponible");
        System.out.println("X -> silla ocupada");

        boolean ciclo = true;
        int cont = 0;
        Scanner scanner = new Scanner(System.in);
        while(ciclo){
            switch (menu()){
                case "1":
                    //Reservar asiento
                    String fila = "";
                    String columna = "";
                    showSits();
                    System.out.println("Escoja por favor el número de la fila");
                    fila = scanner.next();
                    System.out.println("Escoja por favor el número de la columna");
                    columna =scanner.next();
                    if(sits[(Integer.parseInt(fila)-1)][(Integer.parseInt(columna)-1)] == 'X'){
                        System.out.println("Asiento ocupado");
                    }else{
                        System.out.println("Tu asiento fue reservado satisfactoriamente en la fila: " + fila + " y columna: " + columna);
                        sits[(Integer.parseInt(fila)-1)][(Integer.parseInt(columna)-1)] = 'X';
                    }

                    break;
                case "2":
                    //Salir del programa
                    ciclo = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            showSits();
        }


    }

    public static String menu(){
        System.out.println("--------------------------------------");
        System.out.println("|                 MENU               |");
        System.out.println("|1. Reservar asiento                 |");
        System.out.println("|2. Salir                            |");
        System.out.println("--------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry option");
        return scanner.nextLine();
    }

    public static void showSits(){
        System.out.println("Estado de las sillas");
        System.out.println("     1   2   3   4   5   6");
        String cadena = "";
        String cadena2 = "";
        for(int i=0; i < 6; i++){
            cadena= " " + (i+1) + " ";
            cadena2 = "  ";
            for(int j=0; j < 6; j++){
                cadena2 += sits[i][j] + "   ";
            }
            System.out.println( cadena + cadena2);
        }
    }
}
