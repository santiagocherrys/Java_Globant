import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] arg){
        //Ejercicio 17
        ArrayList<String[]> proyectos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //ingresar proyecto y calificación

        for(int i = 0; i < 5; i++){
            String[] proyecto = {"Nombre proyecto", "Calificacion"};
            System.out.println("Ingrese el nombre del proyecto");
            proyecto[0] = scanner.next();
            System.out.println(("Ingrese la calificación del proyecto de  1 a 5"));
            proyecto[1] = scanner.next();
            proyectos.add(proyecto);
        }
        System.out.println(proyectos);

        //organizar por calificacion
        for(int i=0; i< 5; i++){
            for(int j=0; j <4; j++){
                String[] aux = new String[2];
                if(Integer.parseInt(proyectos.get(j)[1]) < Integer.parseInt(proyectos.get((j+1))[1])){
                    aux = proyectos.get(j);
                    proyectos.set(j,proyectos.get((j+1)));
                    proyectos.set((j+1),aux);
                }
            }
        }

        //imprimir organizado
        for(String[] proyecto: proyectos){
            System.out.println(proyecto[0] + " Calificacion: " + proyecto[1]);
        }

    }
}
