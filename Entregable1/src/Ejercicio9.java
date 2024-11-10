import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        //Ejercicio 9
        String[] empleados = {"Juan Arango", "Adriana Ortiz", "Samanta Rodriguez", "Santiago Echeverry", "Laura Serna"};
        int[] calificacion = new int[5];
        Scanner scanner = new Scanner(System.in);
        int calAlta = 0;
        int calBaja = 11;
        int cont = 0, indexAlto=0, indexBajo =0;
        for(String empleado: empleados){
            System.out.println("Ingrese calificación para: " + empleados[cont]);
            calificacion[cont] = scanner.nextInt();
            if(calificacion[cont] > calAlta){
                calAlta = calificacion[cont];
                indexAlto = cont;
                if(calificacion[cont] < calBaja){
                    calBaja =calificacion[cont];
                    indexBajo = cont;
                }
            }else if(calificacion[cont] < calBaja){
                calBaja = calificacion[cont];
                indexBajo = cont;
            }


            cont++;

        }
        System.out.println(empleados[indexBajo] + " tiene la calificación mas baja con " + calificacion[indexBajo] + "  y  \n" + empleados[indexAlto] + " tiene la calificación más alta con: " + calificacion[indexAlto]);

    }
}
