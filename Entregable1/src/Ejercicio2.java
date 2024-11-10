import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        //Ejercicio2
        //Nota: para probarlo se hizo con 3 personas por facilidad, pero para el ejercicio solo es cambiar el
        // de SITS a 100
        final int SITS = 3;
        String[] asistentes = new String[SITS];
        String opcion = "";

        int entry = SITS;
        Scanner scanner = new Scanner(System.in);

        while(true){
            opcion = menu();
            if(opcion.equals("3")){
                break;
            }else if(opcion.equals("1")){
                //Reserve entry

                //check that there is available sits
                if(entry == 0) {
                    System.out.println("we ran out of seats, sorry");
                }else {
                    System.out.println("We ran out of sits, sorry");
                    System.out.println("Entry your name for reservation");
                    String name = scanner.nextLine();
                    if (name.isEmpty()) {
                        System.out.println("You don't enter nothing");
                    } else {
                        asistentes[SITS - entry] = name;
                        entry--;
                        System.out.println("Your reservation name is " + name + " and your sit is " + (SITS - entry));
                    }
                }

            }else if(opcion.equals("2")){
                //See available entries
                System.out.println("The availables entries are: " + entry);
            }else{
                System.out.println("Opcion no valida");
            }
        }


    }

    public static String menu(){
        System.out.println("--------------------------------------");
        System.out.println("|                 MENU               |");
        System.out.println("|1. Reserve entry                    |");
        System.out.println("|2. Entries availables               |");
        System.out.println("|3. Exit                             |");
        System.out.println("--------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry option");
        return scanner.nextLine();
    }
}
