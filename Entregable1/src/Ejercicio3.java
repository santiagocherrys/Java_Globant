import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
         //Ejercicio 3
        final int NUMBER_OF_TASKS = 3;
        String[] tasks = new String[NUMBER_OF_TASKS];
        boolean[] doneTask = new boolean[NUMBER_OF_TASKS];
        boolean ciclo = true;
        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        while(ciclo){
            switch(menu()){
                case "1":
                    //add Task
                    if(cont == NUMBER_OF_TASKS){
                        System.out.println("No se puede agregar mas tareas");

                    }else{
                        System.out.println("ingrese la tarea");

                        tasks[cont] = scanner.nextLine();

                        cont++;                    }
                    break;
                case "2":
                    //Mark Task as done
                    mostrarArreglo(tasks,doneTask,2,cont);
                    System.out.println("Ingrese el número de la tarea que va a poner como completada");
                    int taskdone = scanner.nextInt();
                    doneTask[taskdone-1] = true;
                    break;
                case "3":
                    //show all the tasks
                    System.out.println("Estas son todas las tareas que tiene");
                    mostrarArreglo(tasks,doneTask,0,cont);
                    break;
                case "4":
                    ciclo= false;
                    break;
                default:
                    System.out.println("opcion no válida");
            }
            System.out.println(" ");
            System.out.println("las tareas realizadas hasta el momento son:");
            mostrarArreglo(tasks,doneTask,1,cont);
        }



    }

    public static String menu(){
        System.out.println("--------------------------------------");
        System.out.println("|                 MENU               |");
        System.out.println("|1. Add new task                     |");
        System.out.println("|2. Mark task as Done                |");
        System.out.println("|3. Show all the tasks               |");
        System.out.println("|4. Exit                             |");
        System.out.println("--------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry option");
        return scanner.nextLine();
    }
    public static void mostrarArreglo(String[] tareas, boolean[] doneTask, int flag, int numTasks) {
        //flag = 0 muestra todas las tareas
        //flag = 1 muestra solo las tareas completadas
        //flag = 2 muestra las tareas no completadas
        if (flag == 0) {
            for (int i = 0; i < numTasks; i++) {
                System.out.println((i + 1) + " " + tareas[i] + "   estado: " + doneTask[i]);
            }
        }else if(flag == 1) {
            for (int i = 0; i < numTasks; i++) {
                if (doneTask[i]) {
                    System.out.println((i + 1) + " " + tareas[i] + "   estado: " + doneTask[i]);
                }
            }
        }else{
            //muestra las tareas no completadas para ser marcadas
            for (int i = 0; i < numTasks; i++) {
                if (!doneTask[i]) {
                    System.out.println((i + 1) + " " + tareas[i]);
                }
            }
        }
    }
}
