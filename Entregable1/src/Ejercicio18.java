import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio18 {
    static ArrayList<String[]> flotas = new ArrayList<>();

    public static void main(String[] args){
        //Ejercicio 18
        boolean ciclo = true;
        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        while(ciclo) {
            switch (menu()) {
                case "1":
                    //Ingresar flota
                    // estado -> disponible u ocupado
                    String[] flota ={"Matricula", "Modelo", "Estado"};
                    System.out.println("Ingrese matricula");
                    flota[0] = scanner.nextLine();
                    System.out.println("Ingrese modelo");
                    flota[1] = scanner.nextLine();
                    System.out.println("Ingrese estado vehiculo(disponible-ocupado)");
                    flota[2] = scanner.nextLine();
                    flotas.add(flota);

                    break;
                case "2":
                    //Actualizar estado
                    showFlotas(0);
                    System.out.println("Ingrese la matricula");
                    String matricula = scanner.nextLine();
                    int index = 0;
                    for(String[] flota1 : flotas){
                        if(flota1[0].equals(matricula)){
                            System.out.println("ingresa 1 para disponible y 2 para ocupado");
                            int opc = scanner.nextInt();
                            String[] flotita = new String[3];
                            if( opc == 1){
                                flotita[0] = matricula;
                                flotita[1] = flota1[1];
                                flotita[2] = "disponible";
                            }else if(opc == 2){
                                flotita[0] = matricula;
                                flotita[1] = flota1[1];
                                flotita[2] = "ocupado";
                            }else{
                                System.out.println("Opción no válida");
                            }
                            break;

                        }
                    }
                    break;
                case "3":
                    //Mostrar lista disponible
                    showFlotas(1);
                    break;
                case "4":
                    //mostrar todo
                    showFlotas(0);
                    break;
                case "5":
                    System.out.println("Fin del programa");
                    ciclo = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }

    }

    public static String menu(){
        System.out.println("--------------------------------------");
        System.out.println("|                 MENU               |");
        System.out.println("|1. Ingresar flota                   |");
        System.out.println("|2. Actualizar estado                |");
        System.out.println("|3. Mostrar lista disponibles        |");
        System.out.println("|4. Mostrar todo                     |");
        System.out.println("|5. Salir                            |");
        System.out.println("--------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry option");
        return scanner.nextLine();

    }

    public static void showFlotas(int flag){
        if(flag == 0){
            //Muestra todos las flotas disponibles y ocupadas
            for (String[] flota : flotas){
                System.out.println("MATRICULA: " + flota[0] + " MODELO: " + flota[1] + " ESTADO: " + flota[2]);
            }

        }else{
            //lista de flotas disponibles
            for (String[] flota : flotas){
                if(flota[2].equals("disponible")){
                    System.out.println("MATRICULA: " + flota[0] + " MODELO: " + flota[1]);
                }

            }
        }

    }
}
