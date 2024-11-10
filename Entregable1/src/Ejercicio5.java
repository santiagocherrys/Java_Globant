import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    static ArrayList<String[]> users = new ArrayList<>();


    public static void main(String[] args){
        //Ejercicio 5
        boolean ciclo = true;
        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        while(ciclo) {
            switch (menu()) {
                case "1":
                    //add new user
                    String[] user = {"name", "password", "email"};

                    System.out.println("Ingrese nombre");
                    user[0]= scanner.nextLine();

                    boolean ciclo2= true;
                    while(ciclo2) {

                        System.out.println("Ingrese contraseña");
                        user[1] = scanner.next();

                        if (user[1].length() < 8) {

                            System.out.println("contraseña debe tener mínimo 8 caracteres");

                        } else {
                            for (int i = 0; i < user[1].length(); i++) {
                                if (Character.isUpperCase(user[1].charAt(i))) {

                                    //Check if has a number

                                    for(int j = 0; j < user[1].length(); j++){
                                        if(Character.isDigit(user[1].charAt(j))){
                                            ciclo2 = false;
                                            break;
                                        }
                                    }


                                }
                            }
                            if (ciclo2) {
                                System.out.println("La contraseña debe tener al Menos un caracter en Mayuscula y un numero");
                            }else{
                                user[1] = scanner.nextLine();
                                System.out.println("Ingrese correo");
                                user[2] = scanner.nextLine();
                            }

                        }



                    }

                    users.add(user);
                    break;
                case "2":
                    //Exit
                    System.out.println("Gracias por utilizar el programa");
                    ciclo = false;
                    break;
                default:
                    System.out.println("opcion no válida");
            }

            mostrarArreglo(users);
        }
    }

    public static String menu(){
        System.out.println("--------------------------------------");
        System.out.println("|                 MENU               |");
        System.out.println("|1. Add new user                     |");
        System.out.println("|2. Exit                             |");
        System.out.println("--------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry option");
        return scanner.nextLine();
    }

    public static void mostrarArreglo(ArrayList<String[]> users){
        for(String[] user: users ){
            System.out.println("usuario:" + user[0] + " contraseña: " + user[1] + " correo: " + user[2]);
        }
    }
}
