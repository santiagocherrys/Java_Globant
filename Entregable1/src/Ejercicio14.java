import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {

        static ArrayList<String[]> empleados = new ArrayList<>();

        public static void main(String[] args){
            //Ejercicio 14
            boolean ciclo = true;
            int cont = 0;
            Scanner scanner = new Scanner(System.in);

            while(ciclo) {
                switch (menu()) {
                    case "1":
                        //Ingresar empleado
                        String[] empleado ={"Nombre_Empleado", "Puesto_Empleado", "Salario_Empleado"};
                        System.out.println("Ingrese nombre del empleado");
                        empleado[0] = scanner.nextLine();
                        System.out.println("Ingrese puesto del empleado");
                        empleado[1] = scanner.nextLine();
                        System.out.println("Ingrese salario del empleado");
                        empleado[2] = scanner.nextLine();
                        empleados.add(empleado);

                        break;
                    case "2":
                        //Buscar por nombre
                        System.out.println("Ingrese el nombre del empleado");
                        String nombre = scanner.nextLine();
                        boolean flag = false;
                        for(String[] empleado2 : empleados){
                            if(empleado2[0].equals(nombre)){
                                System.out.println("El empleado " + nombre + " tiene puesto de: " + empleado2[1] + " y su salario es: " + empleado2[2]);
                                flag = true;
                                break;
                            }
                        }
                        if(flag){
                            System.out.println("No hay empleado con ese nombre, recuerde que tiene que introducir el empleado con su nombre exacto");
                        }

                        break;
                    case "3":
                        //Mostrar todos los estudiantes
                        showEmpleados();
                        break;
                    case "4":
                        //salir
                        System.out.println("Se sale del programa ");
                        ciclo =  false;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }

        }

        public static String menu(){
            System.out.println("--------------------------------------");
            System.out.println("|                 MENU               |");
            System.out.println("|1. Ingresar empleado                |");
            System.out.println("|2. Buscar por nombre                |");
            System.out.println("|3. Mostrar empleados                |");
            System.out.println("|4. Salir                            |");
            System.out.println("--------------------------------------");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Entry option");
            return scanner.nextLine();

        }

        public static void showEmpleados(){
            for (String[] empleado : empleados){
                System.out.println("NOMBRE EMPLEADO: " + empleado[0] + " PUESTO EMPLEADO: " + empleado[1] + " SALARIO EMPLEADO: " + empleado[2]);
            }
        }
}
